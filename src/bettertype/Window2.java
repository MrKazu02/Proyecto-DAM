package bettertype;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class Window2 {
	private static JTextField win2_text_escribir;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showWindow();
		
	}

	public static void showWindow() {
		
		Database db = new Database();
		
		Puntos puntuacion = new Puntos();
		
		JFrame frame = new JFrame("BetterType");
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100,100,1280,720);
		frame.getContentPane().setLayout(new GridLayout(3, 1));
		frame.setBounds(100,100,717,412);
		frame.setVisible(true);
		
		JPanel win2_panel1 = new JPanel();
		win2_panel1.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(win2_panel1);
		win2_panel1.setLayout(new GridLayout(1, 0, 0, 0));
		
		PalabraEscribir palabras = new PalabraEscribir();
		palabras.nuevaPalabra();
		
		JLabel win2_escribir = new JLabel("Palabra a escribir : "+palabras.getPalabra());
		win2_escribir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		win2_escribir.setHorizontalAlignment(SwingConstants.CENTER);
		win2_panel1.add(win2_escribir);
		
		JPanel win2_panel_2 = new JPanel();
		win2_panel_2.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(win2_panel_2);
		win2_panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel win2_espacio1 = new JLabel("");
		win2_panel_2.add(win2_espacio1);
		
		JLabel win2_espacio2 = new JLabel("");
		win2_panel_2.add(win2_espacio2);
		
		JLabel win2_espacio3 = new JLabel("");
		win2_panel_2.add(win2_espacio3);
		
		JPanel win2_panel3 = new JPanel();
		win2_panel3.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(win2_panel3);
		win2_panel3.setLayout(new GridLayout(3, 9, 0, 0));
		
		JLabel win2_escribe = new JLabel("Escriba aqu\u00ED su respuesta :");
		win2_escribe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		win2_escribe.setHorizontalAlignment(SwingConstants.CENTER);
		win2_panel3.add(win2_escribe);
		
		win2_text_escribir = new JTextField();
		win2_text_escribir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		win2_panel3.add(win2_text_escribir);
		win2_text_escribir.setColumns(10);
		
		JLabel win2_espacio4 = new JLabel("");
		win2_panel3.add(win2_espacio4);
		
		JLabel win2_espacio5 = new JLabel("");
		win2_panel3.add(win2_espacio5);
		
		JLabel win2_espacio6 = new JLabel("");
		win2_panel3.add(win2_espacio6);
		
		JLabel win2_espacio7 = new JLabel("");
		win2_panel3.add(win2_espacio7);
		
		JLabel win2_espacio8 = new JLabel("");
		win2_panel3.add(win2_espacio8);
		
		int puntos = 0;
		
		
		JLabel win2_tiempo = new JLabel("60");
		win2_tiempo.setForeground(new Color(255, 0, 0));
		win2_tiempo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		win2_tiempo.setHorizontalAlignment(SwingConstants.CENTER);
		win2_panel1.add(win2_tiempo);
		
		Timer timer = new Timer();
		 timer.scheduleAtFixedRate(new TimerTask() {
			 
				 int tiempo = 60;
				 String tFinal = null;
			 
	            public void run() {

                    tFinal = String.valueOf(tiempo);
                    win2_tiempo.setText(tFinal);
	                
	                tiempo--;

	                if (tiempo <= 0) {
	                    timer.cancel();
	                    String tFinal = String.valueOf(tiempo);
	                    win2_tiempo.setText(tFinal);
	                    
	                   int puntosAcabar = puntuacion.getPuntos();
	                    
	                   db.agregaPuntos(puntosAcabar);
	                   
	                   db.apagarDb();
	                   
	    				frame.setVisible(false);
	    				Window1 w1 = new Window1();
	    				try {
							w1.showWindow();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                }
	            }
	        }, 0, 1000);
		
			JLabel win2_puntuacion = new JLabel("Puntuaci\u00F3n : "+puntuacion.getPuntos());
			win2_puntuacion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
			win2_puntuacion.setHorizontalAlignment(SwingConstants.CENTER);
			win2_panel1.add(win2_puntuacion);
		 
		 JButton win2_btn_comprobar = new JButton("\u00A1Comprueba!");
			win2_btn_comprobar.setForeground(new Color(0, 128, 0));
			win2_btn_comprobar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			win2_btn_comprobar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				
					String texto = win2_text_escribir.getText();
					if(texto.equals(palabras.getPalabra())) {
						
						int puntosActuales = puntuacion.getPuntos();
						
						puntosActuales = puntosActuales + 1;
						
						puntuacion.setPuntos(puntosActuales);
						
						
						win2_text_escribir.setText("");
						win2_puntuacion.setText("Puntuaci\u00F3n : "+puntuacion.getPuntos());
						palabras.nuevaPalabra();
						win2_escribir.setText("Palabra a escribir : "+palabras.getPalabra());
					}else {
						
						int puntosActuales = puntuacion.getPuntos();
						
						puntosActuales = puntosActuales - 1;
						
						puntuacion.setPuntos(puntosActuales);
						
						
						win2_text_escribir.setText("");
						win2_puntuacion.setText("Puntuaci\u00F3n : "+puntuacion.getPuntos());
						palabras.nuevaPalabra();
						win2_escribir.setText("Palabra a escribir : "+palabras.getPalabra());
						
					}
					
				}	
				
			});
			win2_panel3.add(win2_btn_comprobar);
		 
		JLabel win2_espacio9 = new JLabel("");
		win2_panel3.add(win2_espacio9);

	}
	
}
