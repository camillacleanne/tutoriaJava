package empresa;

public class PessoaJuridica extends Pessoa{
	
	public long cnpj;
	
	public long getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return "A empresa: "+nome;
	}
}
