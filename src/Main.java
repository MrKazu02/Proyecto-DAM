import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		ventana1.fullScreen(frame);
		
		JButton exit_btn = new JButton("");
		exit_btn.setBackground(Color.WHITE);
		exit_btn.setForeground(Color.WHITE);
		exit_btn.setIcon(new ImageIcon("C:\\Users\\sergi\\Desktop\\Proyecto DAM\\Proyecto-DAM\\src\\img\\exit_btn.png"));
		exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana1.exit();
				
			}
		});
		frame.getContentPane().setLayout(null);
		exit_btn.setBounds(1785, 933, 109, 97);
		frame.getContentPane().add(exit_btn);
	}
}
