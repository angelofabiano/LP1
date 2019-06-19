import org.apache.commons.codec.digest.DigestUtils;

public class Funcionario extends Pessoa implements Autenticavel{

	private String login;
	private String Senha;
	private String nivel;
	
	public Funcionario() {
		
	}

	public Funcionario(String login, String senha, String nivel) {
		super();
		this.login = login;
		this.Senha = senha;
		this.nivel = nivel;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	public int autentica(String senhaAtual) {
		
		String senhaAtualMD5 = DigestUtils.md5Hex(senhaAtual);
		
		if(senhaAtualMD5.equals(this.Senha)) {
			return 1;
		}
		else {
			return 0;
		}	
	}	
	
}
