package eedd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eeddprueba {

	private JFrame frmProgramaPro;
	private JTextField textNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eeddprueba window = new eeddprueba();
					window.frmProgramaPro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public eeddprueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProgramaPro = new JFrame();
		frmProgramaPro.setTitle("Programa pro");
		frmProgramaPro.setBounds(100, 100, 600, 400);
		frmProgramaPro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProgramaPro.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("");
		lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre.setBounds(47, 140, 408, 36);
		frmProgramaPro.getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(10, 47, 252, 20);
		frmProgramaPro.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblintroducirnombre = new JLabel("Introduce tu nombre");
		lblintroducirnombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblintroducirnombre.setBounds(10, 21, 326, 28);
		frmProgramaPro.getContentPane().add(lblintroducirnombre);
		
		JButton btnClick = new JButton("Click");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String nombre =textNombre.getText();
			 lblNombre.setText("Hola " + nombre);
			}
		});
		btnClick.setBounds(268, 46, 89, 23);
		frmProgramaPro.getContentPane().add(btnClick);
	}
}
