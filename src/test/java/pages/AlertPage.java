package pages;

import elementos.ElementosAlertPage;
import metodos.Metodos;

public class AlertPage  {

	Metodos metodo = new Metodos();
	ElementosAlertPage elemento = new ElementosAlertPage();
	
	
	public void clicarAlertSimples() {
		metodo.clicar(elemento.btnSimples, "Click alert simples.");
		metodo.validarAlert("You clicked a button", "Validando alert simples.");
		metodo.aceitarAlert("Aceitando alert simples.");

	}

	public void clicarAlertEspera() throws InterruptedException {
		metodo.clicar(elemento.btnEspera, "Click alert com espera");
		Thread.sleep(5000);
		metodo.validarAlert("This alert appeared after 5 seconds", "Validando alert com espera");
		metodo.aceitarAlert("Aceitando alert com espera.");
	}

	public void clicarAlertConfirm() {
		metodo.clicar(elemento.btnConfimBtn,"Click alert com caixa de confirmação.");
		metodo.validarAlert("Do you confirm action?", "Validando alert de confirmação.");
		metodo.aceitarAlert("Aceitando alert com button OK.");
		metodo.validarTexto(elemento.confirmarResposta, "You selected " + "Ok", "Validando alert com OK");
	}

	public void clicarAlertRecusa() {
		metodo.clicar(elemento.btnConfimBtn,"Click alert com caixa de confirmação.");
		metodo.validarAlert("Do you confirm action?", "Validando alert de confirmação.");
		metodo.cancelarAlert("Recusando alert com button CANCELAR.");
		metodo.validarTexto(elemento.confirmarResposta, "You selected " + "Cancel", "Validando alert com Cancel");
	}
	

	public void clicarAlertPromt() {
		metodo.clicar(elemento.btnPromptBox, "Click alert com caixa de comando.");
		metodo.validarAlert("Please enter your name", "Validando alert com caixa de comando.");
		metodo.escreverPrompt("Susana Bergamo", "Preenchendo campus da caixa de comando.");
		metodo.aceitarAlert("Aceitando alert.");
		metodo.validarTexto(elemento.resultadoPrompt, "You entered " + "Susana Bergamo", "Validando resultado de prompt");
	}
	
	
	

}
