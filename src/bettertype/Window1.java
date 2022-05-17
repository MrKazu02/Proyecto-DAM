package bettertype;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class Window1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		showWindow();

	}

	public static void showWindow() throws SQLException {
		
		Database db = new Database();
		
		JFrame frame = new JFrame("BetterType");
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setLayout(new GridLayout(3,1));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(panel_1);
		frame.setBounds(100,100,717,412);
		frame.setVisible(true);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel record = new JLabel("R\u00E9cord : " + db.consultaPuntos());
		record.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		record.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(record);
		
		JLabel lblNewLabel_2 = new JLabel("BetterType");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("");
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 128, 128));
		panel_3.setForeground(new Color(169, 169, 169));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("                                                       ");
		panel_3.add(lblNewLabel_7);
		
		JLabel label = new JLabel("");
		panel_3.add(label);
		
		JLabel label_1 = new JLabel("");
		panel_3.add(label_1);
		
		JLabel lblNewLabel_6 = new JLabel("                              ");
		lblNewLabel_6.setForeground(new Color(128, 128, 128));
		lblNewLabel_6.setBackground(new Color(128, 128, 128));
		panel_3.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("\u00A1Empieza a tipear!");
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Window2 w2 = new Window2();
				w2.showWindow();
				db.apagarDb();
				
			}
		});
		
		panel_3.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("                                  ");
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("                                  ");
		panel_3.add(lblNewLabel_9);
		
		JLabel label_2 = new JLabel("");
		panel_3.add(label_2);
		
		JLabel label_3 = new JLabel("");
		panel_3.add(label_3);

		
	}
	
}
