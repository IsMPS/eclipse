package eedd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JRadioButton;

public class calculadora {

	private JFrame frmCalculadora;
	private JTextField textNum1;
	private JTextField textNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\alumno\\Pictures\\calculadora.jpg"));
		frmCalculadora.getContentPane().setBackground(new Color(255, 228, 196));
		frmCalculadora.getContentPane().setForeground(new Color(0, 0, 0));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 700, 400);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JLabel lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setForeground(new Color(139, 69, 19));
		lblCalculadora.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCalculadora.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadora.setBounds(284, 11, 112, 35);
		frmCalculadora.getContentPane().add(lblCalculadora);
		
		textNum1 = new JTextField();
		textNum1.setHorizontalAlignment(SwingConstants.CENTER);
		textNum1.setBackground(new Color(255, 255, 224));
		textNum1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNum1.setBounds(144, 136, 86, 20);
		frmCalculadora.getContentPane().add(textNum1);
		textNum1.setColumns(10);
		
		textNum2 = new JTextField();
		textNum2.setHorizontalAlignment(SwingConstants.CENTER);
		textNum2.setBackground(new Color(255, 248, 220));
		textNum2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNum2.setBounds(257, 136, 86, 20);
		frmCalculadora.getContentPane().add(textNum2);
		textNum2.setColumns(10);
		
		JLabel lblresultado = new JLabel("");
		lblresultado.setForeground(new Color(139, 69, 19));
		lblresultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblresultado.setBounds(233, 213, 125, 48);
		frmCalculadora.getContentPane().add(lblresultado);
		
		JLabel lblresto = new JLabel("");
		lblresto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblresto.setForeground(new Color(139, 69, 19));
		lblresto.setBounds(144, 252, 199, 29);
		frmCalculadora.getContentPane().add(lblresto);
		
		JLabel lbloperacion = new JLabel("");
		lbloperacion.setHorizontalAlignment(SwingConstants.CENTER);
		lbloperacion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbloperacion.setBounds(230, 136, 27, 19);
		frmCalculadora.getContentPane().add(lbloperacion);
		
		JButton btnsuma = new JButton("SUMA");
		btnsuma.setForeground(new Color(139, 69, 19));
		btnsuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 =Integer.parseInt(textNum1.getText());
				int num2 =Integer.parseInt(textNum2.getText());
				int resultado = num1+num2;
				lbloperacion.setText(String.valueOf("+"));
				lblresultado.setText(String.valueOf(resultado));
			}
		});
		btnsuma.setBounds(391, 119, 74, 23);
		frmCalculadora.getContentPane().add(btnsuma);
		
		JButton btnresta = new JButton("RESTA");
		btnresta.setForeground(new Color(139, 69, 19));
		btnresta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 =Integer.parseInt(textNum1.getText());
				int num2 =Integer.parseInt(textNum2.getText());
				int resultado = num1-num2;
				lbloperacion.setText(String.valueOf("-"));
				lblresultado.setText(String.valueOf(resultado));
			}
		});
		btnresta.setBounds(475, 119, 74, 23);
		frmCalculadora.getContentPane().add(btnresta);
		
		JButton btnmultiplicacion = new JButton("MULTIPLICACI\u00D3N");
		btnmultiplicacion.setForeground(new Color(139, 69, 19));
		btnmultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 =Integer.parseInt(textNum1.getText());
				int num2 =Integer.parseInt(textNum2.getText());
				int resultado = num1*num2;
				lbloperacion.setText(String.valueOf("*"));
				lblresultado.setText(String.valueOf(resultado));
			}
		});
		btnmultiplicacion.setBounds(391, 153, 158, 23);
		frmCalculadora.getContentPane().add(btnmultiplicacion);
		
		JButton btndivision = new JButton("DIVISI\u00D3N");
		btndivision.setForeground(new Color(139, 69, 19));
		btndivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText());
				int resto = num1%num2;
				lbloperacion.setText(String.valueOf("/"));
				if (num2==0) {
					lblresultado.setText(String.valueOf("ERROR"));
				} else {
				int resultado = num1/num2;
				lblresultado.setText(String.valueOf(resultado));
				lblresto.setText(String.valueOf("RESTO: " + resto));
				}
			}
		});
		btndivision.setBounds(391, 188, 158, 23);
		frmCalculadora.getContentPane().add(btndivision);
		
		JButton btnsalir = new JButton("SALIR");
		btnsalir.setForeground(new Color(139, 69, 19));
		btnsalir.setBackground(new Color(255, 160, 122));
		btnsalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnsalir.setBounds(585, 327, 89, 23);
		frmCalculadora.getContentPane().add(btnsalir);
		
		JLabel lblNewLabel = new JLabel("RESULTADO: ");
		lblNewLabel.setForeground(new Color(139, 69, 19));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(144, 213, 86, 48);
		frmCalculadora.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnColorAmarillo = new JRadioButton("Amarillo");
		rdbtnColorAmarillo.setBackground(new Color(238, 232, 170));
		rdbtnColorAmarillo.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnColorAmarillo.setBounds(585, 81, 74, 23);
		frmCalculadora.getContentPane().add(rdbtnColorAmarillo);
		
		JRadioButton rdbtnColorNaranja = new JRadioButton("Naranja");
		rdbtnColorNaranja.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnColorNaranja.setBackground(new Color(244, 164, 96));
		rdbtnColorNaranja.setBounds(590, 119, 69, 23);
		frmCalculadora.getContentPane().add(rdbtnColorNaranja);
	}
}
