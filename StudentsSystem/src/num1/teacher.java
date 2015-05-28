package num1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class teacher extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public teacher() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u589E\u52A0\u6210\u7EE9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add ad=new add();
				ad.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 74, 139, 80);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u4FEE\u6539\u6210\u7EE9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alter al=new alter();
				al.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(170, 74, 151, 80);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u5220\u9664\u6210\u7EE9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delect de=new delect();
				de.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(354, 70, 145, 84);
		contentPane.add(btnNewButton_2);
		
		JLabel label = new JLabel("\u6210\u7EE9\u7BA1\u7406");
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 24));
		label.setBounds(194, 10, 104, 32);
		contentPane.add(label);
	}
}
