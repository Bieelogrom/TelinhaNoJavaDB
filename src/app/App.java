package app;

import java.text.ParseException;

import controller.ClienteController;
import view.FormCliente;
import view.FormSplash;

public class App {

	public static void main(String[] args) throws ParseException {
		
	
		
		FormSplash formSplash = new FormSplash();
		
		try {
			for (int i=0; i<=100; i++) {
				Thread.sleep(30);
				formSplash.lbPorcentagem.setText(" "+i);
				formSplash.pbProgresso.setValue(i);
				if(i==100) {
					formSplash.setVisible(false);
					FormCliente frCliente = new FormCliente();
					new ClienteController(frCliente);			
				}
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}