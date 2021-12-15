package app;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Pokedex {

	private JFrame frame;
	private JFrame prog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pokedex window = new Pokedex();
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
	public Pokedex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Pokedex");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\alumno\\Pictures\\pokemon\\pokebola.png"));
		frame.getContentPane().setBackground(new Color(178, 34, 34));
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 720, 530);
		visual();
	}
	
	private void visual() {
		
		JLabel minilogo = new JLabel("");
		minilogo.setIcon(new ImageIcon("C:\\Users\\alumno\\Pictures\\pokemon\\AAAAAAAAAAA.png"));
		minilogo.setBounds(596, 438, 108, 53);
		frame.getContentPane().add(minilogo);
		
		JLabel logogrande = new JLabel("");
		logogrande.setIcon(new ImageIcon("C:\\Users\\alumno\\Pictures\\pokemon\\pixelpoke.png"));
		logogrande.setBounds(177, 59, 340, 137);
		frame.getContentPane().add(logogrande);
		
		JLabel pokeball = new JLabel("");
		pokeball.setIcon(new ImageIcon("C:\\Users\\alumno\\Pictures\\pokemon\\pokeballabierta.png"));
		pokeball.setBounds(309, 226, 73, 98);
		frame.getContentPane().add(pokeball);
		
		JButton btnSalir = new JButton("Cerrar sesi\u00F3n");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				irmenuprin();
			}
		});
		btnSalir.setBounds(285, 438, 123, 23);
		frame.getContentPane().add(btnSalir);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setBounds(297, 335, 97, 23);
		frame.getContentPane().add(btnCrear);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(297, 369, 97, 23);
		frame.getContentPane().add(btnActualizar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(297, 403, 97, 23);
		frame.getContentPane().add(btnBorrar);
		
		frame.setVisible(true);
	}
	
	public void irmenuprin() {
		new Programa();
		frame.setVisible(false);
	}
}
