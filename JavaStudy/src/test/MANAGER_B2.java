package test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MANAGER_B2 {

	public MANAGER_B2() {
		JFrame frame = new JFrame("MANAGER-B2");
		frame.setBounds(600, 100, 400, 850);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
		// 뒤로가기 버튼
		JButton backBtn = new JButton("뒤로가기");
		backBtn.setBounds(10, 10, 100, 40);
		backBtn.setFont(new Font("나눔글꼴", Font.PLAIN, 16));
	
	//	backBtn.addActionListener(new ActionListener() {
	//
	//		@Override
	//		public void actionPerformed(ActionEvent e) {
	//
	//			new MANAGER_B1();
	//			frame.setVisible(false);
	//
	//		}
	//	});
	
		frame.add(backBtn);
	
		// 삭제하기 버튼
		JButton deleteBtn = new JButton("삭제하기");
		deleteBtn.setBounds(270, 100, 100, 40);
		deleteBtn.setFont(new Font("나눔글꼴", Font.PLAIN, 16));
	
		frame.add(deleteBtn);
	
		// 수정하기 버튼
		JButton modifyBtn = new JButton("수정하기");
		modifyBtn.setBounds(270, 180, 100, 40);
		modifyBtn.setFont(new Font("나눔글꼴", Font.PLAIN, 16));
	
		frame.add(modifyBtn);
	
		// 조회하기 버튼
		JButton inquiryBtn = new JButton("조회하기");
		inquiryBtn.setBounds(270, 260, 100, 40);
		inquiryBtn.setFont(new Font("나눔글꼴", Font.PLAIN, 16));
	
		frame.add(inquiryBtn);
	
		// 계정SEQ 입력창
		JLabel seqLabel = new JLabel("계정 SEQ");
		seqLabel.setBounds(30, 30, 100, 100);
		seqLabel.setFont(new Font("나눔글꼴", Font.PLAIN, 16));
	
		frame.add(seqLabel);
	
		JTextField seqField = new JTextField();
		seqField.setBounds(30, 100, 200, 40);
	
		frame.add(seqField);
	
		// 새 ID 입력창
		JLabel idLabel = new JLabel("새 ID");
		idLabel.setBounds(30, 110, 100, 100);
		idLabel.setFont(new Font("나눔글꼴", Font.PLAIN, 16));
	
		frame.add(idLabel);
	
		JTextField idField = new JTextField();
		idField.setBounds(30, 180, 200, 40);
	
		frame.add(idField);
	
		// 새 PW 입력창
		JLabel pwLabel = new JLabel("새 PW");
		pwLabel.setBounds(30, 190, 100, 100);
		pwLabel.setFont(new Font("나눔글꼴", Font.PLAIN, 16));
	
		frame.add(pwLabel);
	
		JTextField pwField = new JTextField();
		pwField.setBounds(30, 260, 200, 40);
	
		frame.add(pwField);
	
		// 검색결과 표
		String header[] = { "계정SEQ", "아이디", "비밀번호" };
		String contents[][] = { { "", "", "" }, { "", "", "" }, { "", "", "" }, { "", "", "" }, { "", "", "" },
				{ "", "", "" }, { "", "", "" }, { "", "", "" }, { "", "", "" }, { "", "", "" }, { "", "", "" },
				{ "", "", "" }, { "", "", "" }, { "", "", "" }, };
	
		JTable table = new JTable(contents, header);
		JScrollPane scp = new JScrollPane(table);
		scp.setBounds(30, 340, 340, 440);
		scp.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
		table.setRowHeight(40);
	
		frame.add(scp);
	
		
		// 미완성 (안 만든 기능들 다수)
	}
	
	public static void main(String[] args) {
		new MANAGER_B2();
	}
}