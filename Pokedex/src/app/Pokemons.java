package app;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

import models.Pokemon;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Pokemons {

	private JFrame frame;
	private String accion;
	private ArrayList<Pokemons> pokemon = new ArrayList<Pokemons>();
	private int num = 1;

	/**
	 * Create the application.
	 */
	public Pokemons(String a) {
		this.accion = a;
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
		
		JButton btnFlechaIzq = new JButton("");
		btnFlechaIzq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum();
			}
		});
		btnFlechaIzq.setBackground(new Color(178, 34, 34));
		btnFlechaIzq.setIcon(new ImageIcon("C:\\Users\\alumno\\Pictures\\pokemon\\flechaizq.png"));
		btnFlechaIzq.setBounds(10, 202, 68, 67);
		frame.getContentPane().add(btnFlechaIzq);
		
		JButton btnFlechaDer = new JButton("");
		btnFlechaDer.setBackground(new Color(178, 34, 34));
		btnFlechaDer.setIcon(new ImageIcon("C:\\Users\\alumno\\Pictures\\pokemon\\flechader.png"));
		btnFlechaDer.setBounds(626, 202, 68, 67);
		frame.getContentPane().add(btnFlechaDer);
		
		JLabel lblTipo = new JLabel("Tipo :");
		lblTipo.setForeground(new Color(255, 255, 255));
		lblTipo.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblTipo.setBounds(273, 374, 54, 28);
		frame.getContentPane().add(lblTipo);
		
		JLabel lblTipoImg = new JLabel("");
		lblTipoImg.setBounds(337, 374, 117, 24);
		frame.getContentPane().add(lblTipoImg);
		
		JLabel lblAltura = new JLabel("Altura :");
		lblAltura.setForeground(Color.WHITE);
		lblAltura.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblAltura.setBounds(259, 405, 68, 28);
		frame.getContentPane().add(lblAltura);
		
		JLabel lblPeso = new JLabel("Peso :");
		lblPeso.setForeground(Color.WHITE);
		lblPeso.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblPeso.setBounds(269, 433, 54, 28);
		frame.getContentPane().add(lblPeso);
		
		JLabel lblAlturaVar = new JLabel("");
		lblAlturaVar.setForeground(Color.WHITE);
		lblAlturaVar.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblAlturaVar.setBounds(337, 405, 54, 28);
		frame.getContentPane().add(lblAlturaVar);
		
		JLabel lblPesoVar = new JLabel("");
		lblPesoVar.setForeground(Color.WHITE);
		lblPesoVar.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblPesoVar.setBounds(333, 433, 54, 28);
		frame.getContentPane().add(lblPesoVar);
		
		JLabel lblPokemonImg = new JLabel("");
		lblPokemonImg.setBounds(195, 11, 307, 281);
		frame.getContentPane().add(lblPokemonImg);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblNombre.setBounds(246, 350, 83, 28);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblNombreVar = new JLabel("");
		lblNombreVar.setBounds(337, 349, 83, 18);
		frame.getContentPane().add(lblNombreVar);
		frame.setBounds(100, 100, 720, 530);
		
		
		
		frame.setVisible(true);
	}
	
	public void sum() {
//		if() {
//			num = num + 1;
//		}
		
	}
}
