package Questoes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Questao1.q1;

public class Exerc02 extends JFrame implements ActionListener {

	public Exerc02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 250);
		setLocationRelativeTo(this);

		botoes();
		
		setVisible(true);
	}
	
	public void botoes() {
		setLayout(new GridLayout(3,2));
		
		JButton btn1 = new JButton("Java");
		JButton btn2 = new JButton("JavaScript");
		JButton btn3 = new JButton("Python");
		JButton btn4 = new JButton("C++");
		JButton btn5 = new JButton("C#");
		JButton btn6 = new JButton("C");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton botao = (JButton) e.getSource();
		setTitle(botao.getText());
	}
	
	public static void main(String[] args) {
		Exerc02 Q2 = new Exerc02();
	}
	
}

