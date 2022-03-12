package empresa;

public class PessoaFisica extends Pessoa{
	public long cpf;
	
	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return "A pessoa: "+nome;
	}
}
