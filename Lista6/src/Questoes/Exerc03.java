package Questoes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Exerc03 extends JFrame implements ActionListener{
	
	private JTextField JT;
	
	public Exerc03() {
		setLayout(new FlowLayout());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 80);
		setLocationRelativeTo(this);

		texto();
		botoes();

		setVisible(true);
	}

	public void texto() {
		JT = new JTextField(25);
		add(JT);
	}

	public void botoes() {
		JButton iniciar = new JButton("Enviar");
		add(iniciar);
		iniciar.addActionListener(this);
	}

	public void mensagemTexto() {
		JOptionPane.showMessageDialog(null, "textField: " + this.JT.getText());
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton botao = (JButton) e.getSource();

		if (botao.getText() == "Enviar") {
			mensagemTexto();
			this.dispose();
		}
	}
	
	public static void main(String[] args) {
		Exerc03 Q3 = new Exerc03();
	}
	
}
