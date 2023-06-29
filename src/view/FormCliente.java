package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class FormCliente extends JFrame {
	
	Color fundoSplash = Color.decode("#fb8500");
	JLabel lbNome,lbIdade,lbCpf, lbEstadoCivil;
	JTextField txNome,txIdade;
	JFormattedTextField txCpf;
	JComboBox cbEstadocivil;

	
	JButton btSalvar;
	
	//get dos campos para recuperar no Controller	
	public JTextField getTxIdade() {
		return txIdade;
	}

	public JTextField getTxCpf() {
		return txCpf;
	}

	public JTextField getTxNome() {
		return txNome;
	}	
	
	public JButton getBtSalvar() {
		return btSalvar;
	}


	public FormCliente() throws ParseException {
		
		this.getContentPane().setBackground(fundoSplash);
		this.setTitle("Cadastro da NBA");
		this.setSize(500,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setLayout(null);
		
		Container c = getContentPane();
		MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		
		lbNome = new JLabel();
		lbNome.setFont(new Font("Arial", Font.BOLD, 14));
		lbNome.setForeground(Color.WHITE);
		lbNome.setText("Nome do Jogador");
		lbNome.setBounds(50,50,200,30);
		c.add(lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(180, 50, 200, 30);
		c.add(txNome);
		
		lbIdade = new JLabel();
		lbIdade.setFont(new Font("Arial", Font.BOLD, 14));
		lbIdade.setForeground(Color.WHITE);
		lbIdade.setText("Idade");
		lbIdade.setBounds(50,90,100,30);
		c.add(lbIdade);
		
		txIdade = new JTextField();
		txIdade.setBounds(120, 90, 200, 30);
		c.add(txIdade);
		
		lbCpf = new JLabel();
		lbCpf.setFont(new Font("Arial", Font.BOLD, 14));
		lbCpf.setForeground(Color.WHITE);
		lbCpf.setText("CPF");
		lbCpf.setBounds(50,130,100,30);
		c.add(lbCpf);
		
		txCpf = new JFormattedTextField(mascaraCpf);
		txCpf.setBounds(120, 130, 100, 30);
		c.add(txCpf);
		
		lbEstadoCivil = new JLabel();
		lbEstadoCivil.setFont(new Font("Arial", Font.BOLD, 14));
		lbEstadoCivil.setForeground(Color.WHITE);
		lbEstadoCivil.setText("Posição");
		lbEstadoCivil.setBounds(50,170,100,30);
		c.add(lbEstadoCivil);
		
		cbEstadocivil = new JComboBox();
		cbEstadocivil.setBounds(120, 170, 100, 30);
		cbEstadocivil.addItem("Armador");
		cbEstadocivil.addItem("Ala");
		cbEstadocivil.addItem("Pivô");
		cbEstadocivil.addItem("Ala-Pivô");
		cbEstadocivil.addItem("Ala-Armador");
		c.add(cbEstadocivil);
		
		btSalvar = new JButton();
		btSalvar.setText("Salvar");
		btSalvar.setBounds(200, 210, 100, 30);
		c.add(btSalvar);
		
		this.setVisible(true);
	}
}