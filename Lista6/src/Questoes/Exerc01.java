package Questoes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exerc01 extends JFrame implements ActionListener {

	private JPanel JPcor;
	private JLabel TextCor;

	public Exerc01() {
		setLayout(new BorderLayout());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(this);
		
		organizarLayout();

		setVisible(true);
	}

	public JPanel botoes() {
		JPanel JP = new JPanel();
		JP.setLayout(new FlowLayout());

		JButton btn1 = new JButton("Amarelo");
		JButton btn2 = new JButton("Verde");
		JButton btn3 = new JButton("Azul");

		JP.add(btn1);
		JP.add(btn2);
		JP.add(btn3);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

		return JP;
	}

	public JPanel painelCor() {
		JPcor = new JPanel();
		JPcor.setLayout(new GridBagLayout());

		TextCor = new JLabel();

		JPcor.add(TextCor);

		return JPcor;
	}

	public void organizarLayout() {
		add(BorderLayout.NORTH, botoes());
		add(BorderLayout.CENTER, painelCor());
	}

	public void actionPerformed(ActionEvent e) {
		JButton botao = (JButton) e.getSource();

		if (botao.getText().equals("Amarelo")) {
			this.JPcor.setBackground(Color.YELLOW);
			this.TextCor.setText("Amarelo");
		}
		if (botao.getText().equals("Verde")) {
			this.JPcor.setBackground(Color.GREEN);
			this.TextCor.setText("Verde");
		}
		if (botao.getText().equals("Azul")) {
			this.JPcor.setBackground(Color.BLUE);
			this.TextCor.setText("Azul");
		}
	}

	public static void main(String[] args) {
		Exerc01 Q1 = new Exerc01();
	}
}
