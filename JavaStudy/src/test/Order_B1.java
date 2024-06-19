package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import database.DBConnector;

public class Order_B1 extends JFrame {

// 폰트 설정 TextField, 사이즈 설정
	boolean isClientExist = false;
	static Font font = new Font("나눔글꼴", Font.PLAIN, 14);
	boolean isShow = true;

	JTextField name, qty, cId;

	DBConnector connector = new DBConnector("HR", "1234");
	Dimension textField = new Dimension(200, 35);

// 날짜설정 필요도구 불러오기
	Date today = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

	Order_B1() {
		setTitle("Order_B1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());

		// 뒤로가기 버튼
		JButton backButton = new JButton("뒤로가기");
		backButton.setFont(font);
		backButton.setSize(new Dimension(80, 40));

		// 상단 라벨
		JLabel head = new JLabel("발주신청");
		JPanel headPanel = new JPanel();

		head.setFont(new Font("나눔글꼴", Font.PLAIN, 15));
		headPanel.add(head);

		headPanel.setAlignmentY(CENTER_ALIGNMENT);
		headPanel.setPreferredSize(textField);
		headPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

		// 날짜 표시
		JButton date = new JButton();
		date.setPreferredSize(new Dimension(200, 35));
		date.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		date.setText(dateFormat.format(today));
		date.setFont(new Font("나눔글꼴", Font.PLAIN, 15));

		// 이름 수량 업체코드 TextField 설정
		name = new JTextField();
		name.setPreferredSize(textField);
		name.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		qty = new JTextField();
		qty.setPreferredSize(textField);
		qty.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		cId = new JTextField();
		cId.setPreferredSize(textField);
		cId.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

		// TextField 라벨 설정
		JLabel nameLabel = new JLabel("상품명");
		nameLabel.setFont(font);
		JLabel qtyLabel = new JLabel("수량");
		qtyLabel.setFont(font);
		JLabel cIdLabel = new JLabel("업체코드");
		cIdLabel.setFont(font);

		// 신청하기 버튼
		JButton submit = new JButton("신청하기");
		submit.setFont(font);
		submit.setSize(80, 40);
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// 데이터 삽입 메서드
				insertData();

				// 데이터 삽입 완료후 클라이언트 ID가 존재여부에 따라 다른 알림창 출력
				if (isClientExist) {
					JDialog dialog = new JDialog(Order_B1.this, "알림", true);
					dialog.setSize(200, 150);
					dialog.setLocation(150, 300);
					dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

					JLabel label = new JLabel("신청이 완료되었습니다.");
					label.setFont(font);
					label.setHorizontalAlignment(SwingConstants.CENTER);
					dialog.add(label, BorderLayout.CENTER);

					JButton okButton = new JButton("확인");
					okButton.setFont(font);
					okButton.setSize(80, 40);
					okButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							dialog.dispose();
						}
					});

					JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
					buttonPanel.add(okButton);
					dialog.add(buttonPanel, BorderLayout.SOUTH);

					dialog.setVisible(true);

				} else {
					JDialog dialog = new JDialog(Order_B1.this, "알림", true);
					dialog.setSize(200, 150);
					dialog.setLocation(150, 300);
					dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

					JLabel label = new JLabel("등록된업체 코드가 아닙니다");
					label.setFont(font);
					label.setHorizontalAlignment(SwingConstants.CENTER);
					dialog.add(label, BorderLayout.CENTER);

					JButton okButton = new JButton("확인");
					okButton.setFont(font);
					okButton.setSize(80, 40);
					okButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							dialog.dispose();
						}
					});

					JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
					buttonPanel.add(okButton);
					dialog.add(buttonPanel, BorderLayout.SOUTH);

					dialog.setVisible(true);

				}
			}
		});

		// 레이아웃에 컴포넌트 배치
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.weightx = 0.5;
		gbc.weighty = 0.5;
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc.insets = new Insets(20, 20, 0, 0);
		add(backButton, gbc);

		gbc.weighty = 0.5;
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.PAGE_START;
		gbc.insets = new Insets(100, 0, 0, 0);
		add(headPanel, gbc);

		gbc.weighty = 0.5;
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.PAGE_START;
		gbc.insets = new Insets(200, 0, 0, 0);
		add(date, gbc);

		gbc.insets = new Insets(255, -300, 0, 0);
		add(nameLabel, gbc);

		gbc.insets = new Insets(250, 0, 0, 0);
		add(name, gbc);

		gbc.insets = new Insets(305, -300, 0, 0);
		add(qtyLabel, gbc);

		gbc.insets = new Insets(300, 0, 0, 0);
		add(qty, gbc);

		gbc.insets = new Insets(355, -300, 0, 0);
		add(cIdLabel, gbc);

		gbc.insets = new Insets(350, 0, 0, 0);
		add(cId, gbc);

		gbc.gridx = 3;
		gbc.anchor = GridBagConstraints.PAGE_START;
		gbc.insets = new Insets(400, 0, 0, 0);
		add(submit, gbc);

		setSize(450, 800);
		setVisible(isShow);
	}

// 데이터 삽입 메서드
	private void insertData() {
		String nameStr = name.getText();
		String dateStr = dateFormat.format(today);
		String qtyStr = qty.getText();
		String cIdStr = cId.getText();

		String sql = "INSERT INTO order_item(order_seq, item_name, order_date, qty, client_id)"
				+ " VALUES(order_seq.nextval, ?, ?, ?, ?)";

		try (Connection conn = connector.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, nameStr);
			pstmt.setString(2, dateStr);
			pstmt.setString(3, qtyStr);
			pstmt.setString(4, cIdStr);

			int row = pstmt.executeUpdate();
			System.out.printf("%d행 업데이트 되었습니다.", row);
			isClientExist = true;

		} catch (SQLException e) {
			e.printStackTrace();
			isClientExist = false;
		}
	}

	public static void main(String[] args) {
		new Order_B1();
	}
}