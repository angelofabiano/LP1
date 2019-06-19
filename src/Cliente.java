
public class Cliente extends Pessoa{
	
	private String telefone;
	
	public Cliente() {
		
	}

	public Cliente(String telefone) {
		super();
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
