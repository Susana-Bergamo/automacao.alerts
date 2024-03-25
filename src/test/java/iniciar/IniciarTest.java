package iniciar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.AlertPage;
import runner.Executa;

public class IniciarTest {

	AlertPage page = new AlertPage();
	Executa executa = new Executa();

	@Before
	public void iniciarTest() {
		executa.abrirNavegador();
	}

	@After
	public void finalizarTest() {
		executa.fecharNavegador();

	}

	@Test
	public void alertButton() {
		page.clicarAlertSimples();
	}

	@Test
	public void timerAlertButton() throws InterruptedException {
		page.clicarAlertEspera();
	}

	@Test
	public void confirmButtonOk() {
		page.clicarAlertConfirm();
	}

	@Test
	public void confirmButtonCancel() {
		page.clicarAlertRecusa();
	}

	@Test
	public void promptButton() {
		page.clicarAlertPromt();
	}

}
