package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.ClienteDao;
import model.ClienteModel;
import view.FormCliente;

public class ClienteController implements ActionListener {
	
	FormCliente frCliente;
	ClienteModel cm;
	ClienteDao daoCli = new ClienteDao();
	
	
	public ClienteController(FormCliente frCliente) {	
		this.frCliente = frCliente;		
		this.frCliente.getBtSalvar().addActionListener(this);	
	}	
	
	
	public void actionPerformed(ActionEvent e) {		

		if(e.getSource()==this.frCliente.getBtSalvar()) {			

			cm = new ClienteModel();
						
			cm.setNome(frCliente.getTxNome().getText());
			cm.setIdade(Integer.parseInt(frCliente.getTxIdade().getText()));
			cm.setCpf(frCliente.getTxCpf().getText());

			
			String resultado = String.format("%s - %d - %s",
					cm.getNome(),cm.getIdade(),cm.getCpf());
					
			JOptionPane.showMessageDialog(null,resultado);
			
			try {
				daoCli.adicionar(cm);
			} catch (SQLException e1) {				
				e1.printStackTrace();
			}
			
		}			
	}
}