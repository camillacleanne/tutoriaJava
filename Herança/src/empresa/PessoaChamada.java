package empresa;

public class PessoaChamada {

	public static void main(String[] args) {
		
		/*Pessoa p = new Pessoa();
		p.setNome("LINA");
		
		System.out.println(p.getNome());*/

		//Para pessoa Juridica
		PessoaJuridica pj = new PessoaJuridica();
		pj.setCnpj(168413546843L);
		
		pj.setNome("Vivi");
		
		System.out.println(pj.getNome());
		System.out.println(pj.getCnpj());
		
		//Para pessoa Fisica
				PessoaFisica pf = new PessoaFisica();
				pf.setCpf(9785415263L);
				
				pf.setNome("Osmando");
				
				System.out.println(pf.getNome());
				System.out.println(pf.getCpf());
		
		
	}

}
