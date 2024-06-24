package project.common;

import javax.swing.JOptionPane;
public class Pop_up {
	
	/*
		whether 여부 : 등록실패 or 등록성공
		message : 여부 아래 출력되는 메세지
		color : red , bule ...
	 */
	
	public Pop_up(String whether, String message, String color) {
        String formattedMessage =
                "<html><body style=\"text-align:center; color: " + color + ";\">"
                + whether + "<br>"
                + "[" + message + "]</body></html>";
        JOptionPane.showMessageDialog(
                null,
                formattedMessage,
                "알림",
                JOptionPane.WARNING_MESSAGE
        );
    }
}