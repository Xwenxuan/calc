package com.newer.calc;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * 计算器的窗口
 * @author xiaowenxuan
 *
 */
public class CalcUi extends JFrame {
	
	/**
	 * 显示计算结果
	 */
	private JLabel lableResult;
	/**
	 * 按钮上的标签
	 */
	private String[] titles = {"7","8","9","/","4","5","6","*","1","2","3","-",".","0","删除","+","","","","="};
	/**
	 * 按钮
	 */
	private JButton[] buttons = new JButton[titles.length];
	
	public CalcUi() {
		initUi();
		setVisible(true);
		
	}

	private void initUi() {
		setTitle("计算器- xx 作品");
		setSize(320,480);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//添加结果标签
		lableResult = new JLabel("0.0");
//		lableResult.setBounds(0, 0, getWidth(), 200);
		lableResult.setBorder(new EmptyBorder(20, 10, 20, 10));
		//设置又对齐
		lableResult.setHorizontalAlignment(SwingConstants.RIGHT);
		//设置字体
		lableResult.setFont(new Font("微软雅黑",Font.PLAIN,32));
		
		add(lableResult,BorderLayout.NORTH);
		
		//添加按钮
		JPanel buttonPanel = new JPanel(new GridLayout(5,4,2,2));
		add(buttonPanel,BorderLayout.CENTER);
		
		for (int i = 0;i < titles.length;i++) {
			if(titles[i].length() == 0){
				buttonPanel.add(new JLabel());
			}else{
				buttons[i] = new JButton(titles[i]);
				buttonPanel.add(buttons[i]);
			}
		}

	}
	

}
