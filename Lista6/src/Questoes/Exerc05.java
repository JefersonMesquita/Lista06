package Questoes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exerc05 extends JFrame implements ActionListener {

	private JComboBox<String> opcoes;
	private JTextField JT;
	private int num1;
	private int num2;

	public Exerc05() {
		setLayout(new FlowLayout());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 80);
		setLocationRelativeTo(this);

		dados();

		setVisible(true);
	}

	public void dados() {
		JLabel JL = new JLabel("Valores: ");
		JT = new JTextField(10);

		opcoes = new JComboBox<String>();
		opcoes.addItem("Soma");
		opcoes.addItem("Multiplicacao");

		JButton JB = new JButton("	Calcular	");
		JB.addActionListener(this);

		add(JL);
		add(JT);
		add(opcoes);
		add(JB);
	}

	public void converterString() {

		char[] chars = new char[JT.getText().length()];

		for (int i = 0; i < JT.getText().length(); i++) {
			chars[i] = JT.getText().charAt(i);
		}

		num1 = Character.getNumericValue(chars[0]);
		num2 = Character.getNumericValue(chars[1]);
	}

	public void actionPerformed(ActionEvent e) {
		JButton botao = (JButton) e.getSource();
		converterString();

		if (opcoes.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, num1+num2);
			JT.setText(null);
		}
		if (opcoes.getSelectedIndex() == 1) {
			JOptionPane.showMessageDialog(null, num1*num2);
			JT.setText(null);
		}
	}

	public static void main(String[] args) {
		Exerc05 Q5 = new Exerc05();
	}

}
