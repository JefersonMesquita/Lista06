package Questoes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exerc04 extends JFrame implements ActionListener {

	private ArrayList<Integer> numeros;
	private JTextField num;
	private JTextField maior;
	private JTextField menor;
	private JTextField media;

	public Exerc04() {
		setLayout(new BorderLayout());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 150);
		setLocationRelativeTo(this);

		numeros = new ArrayList<Integer>();
		organizarLayout();

		setVisible(true);
	}

	public JPanel inserirNumero() {
		JPanel JP = new JPanel();
		setLayout(new FlowLayout());

		JLabel JL = new JLabel("Digite o número");
		num = new JTextField(5);
		num.setHorizontalAlignment(JTextField.CENTER);
		JButton JB = new JButton("	OK	");

		JP.add(JL);
		JP.add(num);
		JP.add(JB);

		JB.addActionListener(this);

		return JP;
	}

	public JPanel informarDados() {
		JPanel JP = new JPanel();
		JP.setLayout(new GridLayout(3, 2));

		JLabel JL1 = new JLabel("Maior: ");
		JLabel JL2 = new JLabel("Menor: ");
		JLabel JL3 = new JLabel("Media: ");

		maior = new JTextField(10);
		menor = new JTextField(10);
		media = new JTextField(10);
		maior.setHorizontalAlignment(JTextField.CENTER);
		menor.setHorizontalAlignment(JTextField.CENTER);
		media.setHorizontalAlignment(JTextField.CENTER);
		maior.setEditable(false);
		menor.setEditable(false);
		media.setEditable(false);

		JP.add(JL1);
		JP.add(maior);

		JP.add(JL2);
		JP.add(menor);

		JP.add(JL3);
		JP.add(media);

		return JP;
	}

	public JButton botaoExibir() {
		JPanel JP = new JPanel();
		JButton JB = new JButton("	Exibir	");
		JB.addActionListener(this);
		JP.add(JB);

		return JB;
	}

	public void organizarLayout() {
		add(BorderLayout.NORTH, inserirNumero());
		add(BorderLayout.CENTER, informarDados());
		add(BorderLayout.SOUTH, botaoExibir());
	}

	public void limparTexto() {
		num.setText(null);
		maior.setText(null);
		menor.setText(null);
		media.setText(null);
	}

	public int maior() {
		int maior = numeros.get(0);
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) > maior)
				maior = numeros.get(i);
		}
		return maior;
	}

	public int menor() {
		int menor = numeros.get(0);
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) < menor)
				menor = numeros.get(i);
		}
		return menor;
	}

	public float media() {
		int soma = 0;
		float media = 0;

		for (int a : numeros) {
			soma += a;
		}

		media = soma / numeros.size();

		return media;
	}

	public void calculos() {
		maior.setText("" + maior());
		menor.setText("" + menor());
		media.setText("" + media());
	}

	public void actionPerformed(ActionEvent e) {
		JButton botao = (JButton) e.getSource();

		if (botao.getText().equals("	OK	")) {
			numeros.add(Integer.parseInt(num.getText()));
			limparTexto();
		}
		if (botao.getText().equals("	Exibir	")) {
			calculos();
		}

	}

	public static void main(String[] args) {
		Exerc04 Q4 = new Exerc04();
	}

}
