package Project.UAS;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class User extends JFrame {

	private JPanel contentPane;
	private JPasswordField textPassword;
	private JTextField textUsername;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		setTitle("User");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Chat Application");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Calibri Light", Font.BOLD, 16));
		lblTitle.setBounds(86, 53, 272, 40);
		contentPane.add(lblTitle);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Calibri Light", Font.PLAIN, 13));
		lblUsername.setBounds(10, 131, 92, 24);
		contentPane.add(lblUsername);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		textUsername.setBounds(86, 132, 272, 24);
		contentPane.add(textUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Calibri Light", Font.PLAIN, 13));
		lblPassword.setBounds(10, 181, 92, 24);
		contentPane.add(lblPassword);
				
		textPassword = new JPasswordField();
		textPassword.setBounds(86, 181, 272, 24);
		contentPane.add(textPassword);
		
		JButton btnLogin = new JButton("Login");
	    btnLogin.setFont(new Font("Calibri Light", Font.PLAIN, 12));
	    btnLogin.setBounds(164, 231, 120, 31);
	    btnLogin.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String username = textUsername.getText(); 
	            String password = new String(textPassword.getPassword());
	            if (username.isEmpty() || password.isEmpty()) {
	                JOptionPane.showMessageDialog(contentPane, "Silahkan mengisi data dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
	            } else if (!username.equals("siti") || !password.equals("123")) {
	                JOptionPane.showMessageDialog(contentPane, "Data yang anda masukan salah", "Error", JOptionPane.ERROR_MESSAGE);
	            } else {
	                JOptionPane.showMessageDialog(contentPane, "Selamat Datang " + username, "Login Success", JOptionPane.INFORMATION_MESSAGE);
	                Contact contact = new Contact();
	                contact.setVisible(true);
	                }
	        }
	    });

	    contentPane.add(btnLogin);
	}

}
