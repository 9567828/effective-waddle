package myobj.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.LinkedList;

//24.05.31

public class ChatServer {
	MessageShare ms = new MessageShare();	
	ServerSocket ss;
	int cnt = 0;

	public ChatServer(int port) {
		try {
			ss = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start() {

		while (true) {
			try {
				System.out.printf("연결을 기다리는 중... 현재접속자(%d명)\n", cnt);
				Socket s = ss.accept();
				
				Client c = new Client(s);
				ms.addClient(c);
				
				// 리스닝스레드를 돌려준다
				// 연결될때마다 연결된 클라이언트의 메세지를 기다리는 쓰레드가 추가 된다
				// 이렇게 되면 접속자가 많을 때 쓰레드가 많아서 비효율적인 방법이기는 함
				new ListeningThread(c).start();
				
				++cnt;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 계속 듣고 있는 쓰레드가 필요해서 만든다
	class ListeningThread extends Thread {
		
		Client client;
		
		// 상대(클라이언트)와 연결 된 소켓이 있어야 한다 
		public ListeningThread(Client client) {
			this.client = client;
		}
		
		@Override
		public void run() {
			System.out.println("듣기쓰레드 시작됨...");
			
			try (
				BufferedReader in = client.getInputStream();
			) {
				while (true) {
					String message = in.readLine();
					// 도착할 때 까지 기다린다
					// getRemoteSocketAddress() 나에게 연결 된 사람의 IP를 얻을 수 있다
					System.out.printf("\"%s\"로 부터 도착한 메시지: %s\n", 
							client.getId(), 
							message);
					
					// MessageShare에 등록된 모든 클라이언트들에게 메시지 전달
					ms.sendMessageAll(message);
				}
				
			} catch (SocketException e) {
				System.out.printf("\"%s\"님의 연결이 만료되었습니다.\n", client.getId());
				
				--cnt;
				ms.removeClient(client);
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		new ChatServer(9000).start();
	}
}

// 메시지 분배기
class MessageShare {
	// 모든 클라이언트 관리
	LinkedList<Client> allClients = new LinkedList<>();
	
	void sendMessageAll(String message) {
		// 모든 클라이언트에게 메시지를 보낸다
		for (Client client : allClients) {
			client.sendMessage(message);
		}
	}
	
	void addClient(Client client) {
		allClients.add(client);
	}
	
	void removeClient(Client client) {
		allClients.remove(client);
	}
	
	
}