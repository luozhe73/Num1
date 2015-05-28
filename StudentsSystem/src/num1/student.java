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
import java.util.List;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class student extends JFrame {

	private JPanel contentPane;
	private JTable table;



	/**
	 * Create the frame.
	 */
	public student() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5B66\u751F\u6210\u7EE9\u67E5\u8BE2");
		label.setFont(new Font("宋体", Font.PLAIN, 24));
		label.setBounds(157, 10, 156, 47);
		contentPane.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 67, 456, 184);
		contentPane.add(scrollPane);
			
		
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5B66\u53F7", "\u59D3\u540D", "\u8BED\u6587", "\u6570\u5B66", "\u82F1\u8BED", "\u603B\u6210\u7EE9"
			}
		));
		scrollPane.setViewportView(table);
		
		List<String[]> list = Get.getScoreInfo();
		int num = list.size();
		DefaultTableModel model = (DefaultTableModel)table.getModel();	//得到本窗体中table表的表格模型
		model.getDataVector().clear();	//清除表格数据
		for (int i=0;i<num;i++) {
			model.addRow(list.get(i));	//增加一行数据
		}
		table.setModel(model);//设置模型

	}
	
	
}
