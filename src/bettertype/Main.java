package bettertype;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;

import java.awt.Font;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Database db = new Database();
		db.conectar();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Ventana ventana1 = new Ventana();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setForeground(Color.BLACK);
		ventana1.fullScreen(frame);
		
		JButton exit_btn = new JButton("");
		exit_btn.setIcon(new ImageIcon(Main.class.getResource("/bettertype/exit_btn.png")));
		exit_btn.setBounds(1814, 979, 103, 97);
		exit_btn.setBackground(Color.GRAY);
		exit_btn.setForeground(Color.DARK_GRAY);
		exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana1.exit();
				
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(exit_btn);
		
		JLabel titulo_label = new JLabel("BetterType");
		titulo_label.setForeground(Color.WHITE);
		titulo_label.setBackground(Color.WHITE);
		titulo_label.setFont(new Font("Microsoft Uighur", Font.ITALIC, 99));
		titulo_label.setBounds(896, 71, 342, 78);
		frame.getContentPane().add(titulo_label);
		
		JLabel icon_label = new JLabel("");
		icon_label.setIcon(new ImageIcon(Main.class.getResource("/bettertype/logo_bt.png")));
		icon_label.setBounds(897, 247, 307, 258);
		frame.getContentPane().add(icon_label);
		
		JLabel puntuacion_label = new JLabel("Mejor puntuaci\u00F3n:");
		puntuacion_label.setForeground(Color.WHITE);
		puntuacion_label.setFont(new Font("Microsoft Uighur", Font.ITALIC, 79));
		puntuacion_label.setBackground(Color.WHITE);
		puntuacion_label.setBounds(42, 71, 569, 78);
		frame.getContentPane().add(puntuacion_label);
		
		JLabel puntuacion_label_2 = new JLabel("");
		puntuacion_label_2.setForeground(Color.WHITE);
		puntuacion_label_2.setFont(new Font("Microsoft Uighur", Font.ITALIC, 57));
		puntuacion_label_2.setBackground(Color.WHITE);
		puntuacion_label_2.setBounds(42, 169, 569, 78);
		frame.getContentPane().add(puntuacion_label_2);
		puntuacion_label_2.setText("Puntuación :");
		
		JButton btnNewButton = new JButton("\u00A1Empieza a tipear!");
		btnNewButton.setFont(new Font("Goudy Stout", Font.BOLD, 25));
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setBackground(new Color(220, 220, 220));
		btnNewButton.setBounds(735, 904, 569, 88);
		frame.getContentPane().add(btnNewButton);
	}
}
