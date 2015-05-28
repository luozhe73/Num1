package num1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

public class alter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;



	/**
	 * Create the frame.
	 */
	public alter() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5B66\u751F\u6210\u7EE9\u4FEE\u6539");
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 22));
		label.setBounds(130, 10, 185, 39);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5B66\u53F7\uFF1A");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("ËÎÌו", Font.PLAIN, 19));
		label_1.setBounds(72, 59, 69, 28);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(151, 59, 117, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u4FEE\u6539\u4E3A\uFF1A");
		label_2.setBounds(21, 97, 69, 28);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u8BED\u6587\u6210\u7EE9\uFF1A");
		label_3.setBounds(54, 135, 69, 15);
		contentPane.add(label_3);
		
		JLabel lblNewLabel = new JLabel("\u6570\u5B66\u6210\u7EE9\uFF1A");
		lblNewLabel.setBounds(54, 169, 69, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label_4 = new JLabel("\u82F1\u8BED\u6210\u7EE9\uFF1A");
		label_4.setBounds(54, 205, 69, 15);
		contentPane.add(label_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 132, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 166, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(136, 202, 66, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("\u4FEE\u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText().trim();
				int chinese = Integer.parseInt(textField_1.getText().trim());
				int math = Integer.parseInt(textField_2.getText().trim());
				int english = Integer.parseInt(textField_3.getText().trim());
				Set.updateStudent(id, chinese, math, english);
				dispose();
			}
		});
		btnNewButton.setBounds(246, 146, 165, 63);
		contentPane.add(btnNewButton);
	}

}
