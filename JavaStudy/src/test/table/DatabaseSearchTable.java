package test.table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import database.DBConnector;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DatabaseSearchTable extends JFrame {
	static DBConnector connecter = new DBConnector("HR", "1234");
	
    private JTable table;
    private JTextField searchField;
    private JButton searchButton;
    private DefaultTableModel tableModel;

    public DatabaseSearchTable() {
        setTitle("Database Search Table");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 테이블 모델 생성
        String[] columnNames = {"Column1", "Column2", "Column3", "C4"}; // 필요에 따라 열 이름 변경
        tableModel = new DefaultTableModel(columnNames, 13);
        table = new JTable(tableModel);

        // 검색 필드와 버튼 생성
        searchField = new JTextField(20);
        searchButton = new JButton("검색");

        // 레이아웃 설정
        setLayout(new BorderLayout());
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel searchPanel = new JPanel();
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        add(searchPanel, BorderLayout.NORTH);

        // 검색 버튼 이벤트 리스너
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchTerm = searchField.getText();
                searchDatabase(searchTerm);
            }
        });
    }

    // 데이터베이스 검색 메서드
    private void searchDatabase(String searchTerm) {
    	
        try {
            Connection conn = connecter.getConnection();
            String query = "SELECT * FROM accessRecord "
            		+ "WHERE acc_date <= ? ORDER BY acc_date";
            
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "%" + searchTerm + "%");
            ResultSet rs = pstmt.executeQuery();

            // 테이블 모델 초기화
            tableModel.setRowCount(0);

            // 결과를 테이블에 추가
            while (rs.next() && tableModel.getRowCount() < 13) {
                Object[] row = new Object[3]; // 열 개수에 맞게 조정
                row[0] = rs.getObject(1);
                row[1] = rs.getObject(2);
                row[2] = rs.getObject(3);
                tableModel.addRow(row);
            }

            // 13행에 미치지 못하는 경우 빈 행 추가
            while (tableModel.getRowCount() < 13) {
                tableModel.addRow(new Object[3]);
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "데이터베이스 검색 중 오류가 발생했습니다.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DatabaseSearchTable().setVisible(true);
            }
        });
    }
}