package Project.UAS;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Contact extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact frame = new Contact();
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
	public Contact() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		setTitle("Contact");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
	    JLabel lblTitle = new JLabel("Contact");
	    lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
	    lblTitle.setFont(new Font("Arial", Font.BOLD, 13));
	    lblTitle.setBounds(118, 11, 191, 23);
	    contentPane.add(lblTitle);

	    JButton btnSophie = new JButton("Sophie");
	    btnSophie.setHorizontalAlignment(SwingConstants.LEFT);
	    btnSophie.setFont(new Font("Arial", Font.BOLD, 12));
	    btnSophie.setIcon(new ImageIcon("C:/user_person_profile_avatar_icon_190943.png"));
	    btnSophie.setBackground(Color.WHITE);
	    btnSophie.setBounds(10, 45, 414, 50);
	    btnSophie.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            Message message = new Message("Sophie");
	            message.setVisible(true);
	            dispose();
	        }
	    });
	    contentPane.add(btnSophie);

	    JButton btnMoon = new JButton("Moon");
	    btnMoon.setHorizontalAlignment(SwingConstants.LEFT);
	    btnMoon.setFont(new Font("Arial", Font.BOLD, 12));
	    btnMoon.setIcon(new ImageIcon("C:/user_person_profile_avatar_icon_190943.png"));
	    btnMoon.setBackground(Color.WHITE);
	    btnMoon.setBounds(10, 116, 414, 50);
	    btnMoon.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	Message message = new Message("Moon");
	            message.setVisible(true);
	            dispose();
	        }
	    });
	    contentPane.add(btnMoon);

	    JButton btnNaila = new JButton("Naila");
	    btnNaila.setHorizontalAlignment(SwingConstants.LEFT);
	    btnNaila.setFont(new Font("Arial", Font.BOLD, 12));
	    btnNaila.setIcon(new ImageIcon("C:/user_person_profile_avatar_icon_190943.png"));
	    btnNaila.setBackground(Color.WHITE);
	    btnNaila.setBounds(10, 188, 414, 50);
	    btnNaila.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	Message message = new Message("Naila");
	            message.setVisible(true);
	            dispose();
	        }
	    });
	   contentPane.add(btnNaila);
	   contentPane.setVisible(true);
	}

}
