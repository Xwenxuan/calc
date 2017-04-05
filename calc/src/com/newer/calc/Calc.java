package com.newer.calc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 计算器的模型
 * @author xiaowenxuan
 *
 */
public class Calc {

	// 逆波兰表达式（后缀表达式）
	// 操作数和运算符
	Stack<String> stack;
	/**
	 * 显示集合
	 */
	List<String> list;
	/**
	 * 运算集合
	 */
	List<String> cList;
	/**
	 * 计算器
	 */
	public Calc() {
		stack = new Stack();
		list = new LinkedList<>();
		cList = new LinkedList<>();
	}
	
	/**
	 * 
	 * @param e
	 */
	public void push(String e) {
		stack.push(e);
		System.out.println(stack);
	}

	public void clear() {

		stack.clear();
	}
	
	public String getResult() {
		return stack.toString();
	}
	public String getInput() {
		StringBuilder s = new StringBuilder();
		for(String s1 : list) {
			s.append(s1);
		}
		return s.toString();
	}
	public void add(String e){
		list.add(e);
	}
	public void removeAll(){
		list.removeAll(list);
	}
	public void addL(String e){
		cList.add(e);
	}
	public void removeAllL(){
		cList.removeAll(cList);
	}
	
}
