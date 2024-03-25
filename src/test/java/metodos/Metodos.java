package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import drivers.Drivers;

public class Metodos extends Drivers {

	public void escreverPrompt (String texto, String passo) {
			try {
				driver.switchTo().alert().sendKeys(texto);
			} catch (Exception e) {
				System.out.println("Erro no passo " + passo);
				System.out.println("Causa do erro " + e.getCause());
				System.out.println("Mensagem de erro " + e.getMessage());

			}
		}

	public void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	public void validarAlert(String alert, String passo) {
		try {
			String alertText = driver.switchTo().alert().getText();
			assertEquals(alert, alertText);
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	public void aceitarAlert(String passo) {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	public void validarTexto(By element, String textoEsperado, String passo) {
		try {
			assertTrue(driver.findElement(element).getText().contains(textoEsperado));
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	public void cancelarAlert(String passo) {
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}
}