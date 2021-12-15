package algo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField username;
	private JPasswordField password;
	private Programa menuprincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Pokedex");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\alumno\\Pictures\\pokemon\\pokebola.png"));
		frame.getContentPane().setBackground(new Color(178, 34, 34));
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 720, 530);
		
		visuallog();
	}
	
	public void visuallog() {
		JLabel minilogo = new JLabel("");
		minilogo.setIcon(new ImageIcon("C:\\Users\\alumno\\Pictures\\pokemon\\AAAAAAAAAAA.png"));
		minilogo.setBounds(596, 438, 108, 53);
		frame.getContentPane().add(minilogo);
		
		JLabel logogrande = new JLabel("");
		logogrande.setIcon(new ImageIcon("C:\\Users\\alumno\\Pictures\\pokemon\\pixelpoke.png"));
		logogrande.setBounds(177, 59, 340, 137);
		frame.getContentPane().add(logogrande);
		
		username = new JTextField();
		username.setBounds(349, 247, 109, 20);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(349, 286, 109, 20);
		frame.getContentPane().add(password);
		
		JLabel Tnombre = new JLabel("Username: ");
		Tnombre.setForeground(new Color(255, 255, 255));
		Tnombre.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		Tnombre.setBounds(230, 246, 109, 28);
		frame.getContentPane().add(Tnombre);
		
		JLabel TContraseña = new JLabel("Contrase\u00F1a: ");
		TContraseña.setForeground(new Color(255, 255, 255));
		TContraseña.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		TContraseña.setBounds(230, 287, 120, 25);
		frame.getContentPane().add(TContraseña);
		
		JButton logcheck = new JButton("ENTRAR");
		logcheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checklog();
			}
		});
		logcheck.setBounds(298, 335, 89, 23);
		frame.getContentPane().add(logcheck);
		
		frame.setVisible(true);
		
	}
	
	public void checklog() {
//		if(password) {
//			
//		} else {
//			
//		}
		
	}
}
