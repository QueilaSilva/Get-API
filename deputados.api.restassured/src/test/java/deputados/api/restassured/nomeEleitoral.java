package deputados.api.restassured;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class nomeEleitoral {
	Response response;
	private String nome;

	@Test
	public void validarNome() {

		response = RestAssured.get("https://dadosabertos.camara.leg.br/api/v2/deputados/220550");

		setNome(response.getBody().path("nomeEleitoral", "nome"));
		System.out.println("Mauricio Marcon");
 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(Object object) {
		this.nome = (String) object;
	}

}
