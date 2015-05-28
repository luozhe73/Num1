package num1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7BA1\u7406\u767B\u9646");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(10, 10, 149, 61);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u8D26\u6237");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(57, 91, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(57, 138, 54, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(121, 90, 128, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JTextField();
		passwordField.setBounds(121, 137, 128, 21);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				String username = textField.getText().trim();
				String password = passwordField.getText().trim();
				List<String> l = Get.getUserInfo(username);	
					if (!password.equals(l.get(1))) {
						JOptionPane.showMessageDialog(null, "密码错误！请重新输入", "提示", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						teacher tea=new teacher();
						tea.setVisible(true); 
						
					}
			 
			dispose();
				
			}
		});
		btnNewButton.setBounds(279, 101, 128, 43);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u67E5\u770B\u6210\u7EE9");
		button.setFont(new Font("宋体", Font.PLAIN, 21));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				student stu=new student();
				stu.setVisible(true);
						
			}
		});
		button.setBounds(10, 199, 414, 52);
		contentPane.add(button);
	}
}
