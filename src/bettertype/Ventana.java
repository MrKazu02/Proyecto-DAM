package bettertype;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class Ventana {
	private GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	private GraphicsDevice gd = null;

	public void fullScreen(JFrame frame) {
		gd = ge.getDefaultScreenDevice();
		// Si no hay soporte adecuado lo mostramos por pantalla
		if (!gd.isFullScreenSupported()) {
			System.out.println("WARNING: No hay soporte.\n");
		} else {
			System.out.println("INFO: Detectado soporte\n");
		}
		try {
			// Activamos el modo a pantalla completa
			gd.setFullScreenWindow(frame);
			// Inicializamos toda la interfaz gráfica                    
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("ERROR CRITICO: " + e.getMessage());
		}
	}

	public void exit() {
		//   salimos del modo a pantalla completa
		gd.setFullScreenWindow(null);
		//   salimos de la aplicación
		System.exit(0);
	}
}