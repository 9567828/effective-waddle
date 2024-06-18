package myobj.chat;
// 24. 05. 31

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

// 이 사람의 out/in stream을 모두 만드는 클래스
public class Client {

	private InputStreamReader isr;
	private BufferedReader in;
	private PrintStream out;
	private Socket socket;
	
	public Client(Socket socket) {
		this.socket = socket;
		
		try {
			isr = new InputStreamReader(socket.getInputStream());
			in = new BufferedReader(isr);
			out = new PrintStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sendMessage(String message) {
		out.println(message);
	}
	
	// 버퍼드리더 타입을 리턴하는 메서드로 호출하면 in을 리턴해준다
	public BufferedReader getInputStream() {
		return in;
	}
	
	public String getId() {
		return socket.getRemoteSocketAddress().toString();
	}
	
	public void close() {
		try {
			if (isr != null) isr.close();
			if (in != null) in.close();
			if (out != null) out.close();
			if (socket != null) socket.close();
		} catch(IOException e) {
			
		}
	}
}
