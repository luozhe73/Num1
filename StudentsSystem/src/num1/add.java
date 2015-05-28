package num1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class add extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	
	
	/**
	 * Create the frame.
	 */
	public add() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u589E\u52A0\u5B66\u751F\u6210\u7EE9");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("宋体", Font.PLAIN, 26));
		label.setBounds(41, 10, 173, 53);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u59D3\u540D\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(25, 69, 64, 33);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5B66\u53F7\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(25, 129, 64, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u8BED\u6587\u6210\u7EE9\uFF1A");
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(25, 154, 103, 29);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u6570\u5B66\u6210\u7EE9\uFF1A");
		label_4.setFont(new Font("宋体", Font.PLAIN, 18));
		label_4.setBounds(25, 193, 103, 33);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u82F1\u8BED\u6210\u7EE9\uFF1A");
		label_5.setFont(new Font("宋体", Font.PLAIN, 18));
		label_5.setBounds(25, 236, 103, 29);
		contentPane.add(label_5);
		
		textField = new JTextField();
		textField.setBounds(103, 73, 130, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 123, 131, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 154, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(131, 201, 66, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(131, 242, 66, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton button = new JButton("\u589E\u52A0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText().trim();
				String id = textField_1.getText().trim();
				int chinese = Integer.parseInt(textField_2.getText().trim());
				int math = Integer.parseInt(textField_3.getText().trim());
				int english = Integer.parseInt(textField_4.getText().trim());
				Set.addStudent(id, name, chinese, math, english);
				dispose();
			}
		});
		button.setBounds(25, 275, 173, 56);
		contentPane.add(button);
		
	}
}
