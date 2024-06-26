package test;
 
import java.awt.Dimension;
 
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
public class ExampleTable {
 
    public static void main(String[] args) {
 
        Dimension dim = new Dimension(400, 150);
        JFrame frame = new JFrame("모프의 하우스");
        frame.setLocation(200, 400);
        frame.setPreferredSize(dim);
        
        String header[] = {"학생이름", "국어", "영어"};
        String contents[][] = 
        {
            {"박명수", "90", "90", "90"},
            {"유재석", "80", "80", "80"},
            {"유재석", "80", "80", "80"},
            {"정준하", "70", "70", "70"}
        };
        String test[][] = new String[9][3];

        JTable table = new JTable(contents, header);
        JTable table1 = new JTable(test, header);
        
//        JScrollPane scrollPane = new JScrollPane(table);
        JScrollPane scrollPane = new JScrollPane(table1);
        frame.add(scrollPane);
        
        
        //특정컬럼 값 수정
        table.setValueAt("200", 1, 1);
        table.setValueAt("50", 0, 1);
        table1.setValueAt("하이", 0, 0);
        table1.setRowHeight(20);
        
        
        //특정컬럼 가져오기
//        System.out.println(table.getValueAt(0, 0));
 
        //row 갯수
//        System.out.println(table.getRowCount());
        //column 갯수
//        System.out.println(table.getColumnCount());
        //컬럼이름
//        System.out.println(table.getColumnName(0));
        
        frame.pack();
        frame.setVisible(true);
    }
    
}