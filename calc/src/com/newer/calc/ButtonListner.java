package com.newer.calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 按钮的点击事件监听器
 * @author xiaowenxuan
 *
 */
public class ButtonListner implements ActionListener{

	/**
	 * 计算器的核心部分
	 */
	private Calc calc;
	private CalcCallbcak callback;
	private StringBuilder input = new StringBuilder();
	//数字
	String regex = "\\d";
	Pattern pattern = Pattern.compile(regex);
	public ButtonListner(Calc calc,CalcCallbcak callbcak) {
		super();
		this.calc = calc;
		this.callback = callbcak ;
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		//得到点击的内容
		String command = e.getActionCommand();
//		System.out.println(command);
//		calc.push(command);
		switch(command) {
		case "+":
			calc.add(command);
			calc.addL(input.toString());
			input.delete(0, input.length());
			calc.addL(command);
			break;
		case "-":
			calc.add(command);
			calc.addL(input.toString());
			input.delete(0, input.length());
			calc.addL(command);
			break;
		case "*":
			calc.add(command);
			calc.addL(input.toString());
			input.delete(0, input.length());
			calc.addL(command);
			break;
		case "/":
//			calc.push(input.toString());
//			calc.add(input.toString());
//			input.delete(0, input.length());
//			calc.push(command);
			//显示集合
			calc.add(command);
			//运算集合
			calc.addL(input.toString());
			input.delete(0, input.length());
			calc.addL(command);
			break;
		case "=":
//			for(String s : calc.list){
//				if(pattern.matcher(s).matches()){
//					input.append(s);
//				}

//			}
//			Matcher mather = pattern.
			break;
		case "删除":
//			calc.clear();
			calc.removeAll();
			break;
			
		default:
			input.append(command);
			calc.add(command);

		}
		callback.showInput();
		
//		if (command.equals("删除")) {
//			calc.clear();
//		}
	}

}
