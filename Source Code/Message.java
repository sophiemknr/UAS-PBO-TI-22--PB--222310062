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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Message extends JFrame {

    private JPanel contentPane;
    private JTextField textInput;
    private final JTextArea textOutput;
    private String selectedContact;
    private HashMap<String, JTextArea> chatHistory;
    private final EncryptSHA256 encryptor;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Message frame = new Message("");
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
    public Message(String contactName) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 395);
        setTitle("Message");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        encryptor = new EncryptSHA256();

        chatHistory = new HashMap<>();
        contentPane.setLayout(null);
        
        selectedContact = contactName;

        JLabel lblRoomchat = new JLabel(selectedContact + " - Message");
        lblRoomchat.setIcon(new ImageIcon("C:/user_person_profile_avatar_icon_190943.png"));
        lblRoomchat.setHorizontalAlignment(SwingConstants.CENTER);
        lblRoomchat.setFont(new Font("Times New Roman", Font.BOLD, 13));
        lblRoomchat.setBounds(101, 11, 200, 32);
        contentPane.add(lblRoomchat);

        textOutput = new JTextArea();
        textOutput.setEnabled(true);
        textOutput.setEditable(false);
        textOutput.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        textOutput.setForeground(new Color(0, 0, 0));
        textOutput.setBackground(new Color(248, 248, 255));
        textOutput.setBounds(10, 46, 414, 256);
        contentPane.add(textOutput);

        textInput = new JTextField();
        textInput.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        textInput.setBackground(new Color(248, 248, 255));
        textInput.setBounds(10, 313, 316, 32);
        contentPane.add(textInput);
        textInput.setColumns(10);

        JButton btnSend = new JButton("");
        btnSend.setBackground(new Color(248, 248, 255));
        btnSend.setBounds(328, 313, 96, 32);
        btnSend.setIcon(new ImageIcon("C:\\send_121135.png"));
        btnSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = textInput.getText();
                textOutput.append("Plain Text: " + message + "\n");

                String encryptedMessage = encryptor.encryptSHA256(message);
                System.out.println("Hyper Text: " + encryptedMessage + "\n");

                JTextArea contactHistory = chatHistory.get(selectedContact);
                if (contactHistory == null) {
                    contactHistory = new JTextArea();
                    chatHistory.put(selectedContact, contactHistory);
                }
                contactHistory.append(message + "\n");

                textInput.setText("");
            }
        });
        contentPane.add(btnSend);

        JTextArea contactHistory = chatHistory.get(selectedContact);
        if (contactHistory != null) {
            textOutput.setText(contactHistory.getText());
        }

        contentPane.setVisible(true);
    }
}
