package num1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class delect extends JFrame {

	private JPanel contentPane;
	private JTextField textField;



	/**
	 * Create the frame.
	 */
	public delect() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 216, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5B66\u53F7\uFF1A");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 19));
		label.setBounds(21, 46, 105, 37);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(78, 56, 90, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u5220\u9664");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText().trim();
				Set.deleteStudent(id);
				dispose();
			}
		});
		button.setBounds(36, 114, 122, 53);
		contentPane.add(button);
	}

}
