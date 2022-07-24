package subsistema2.cep;

public class CepApi {
	private static CepApi instancia = new CepApi();
		
	private CepApi() {
		super();
	}
		
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Foz do Iguaçu";
	}
	
	public String recuperarEstado(String cep) {
		return "PR";
	}

}
