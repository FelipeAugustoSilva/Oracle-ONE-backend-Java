
public class TestaReferencia {          //Poliformismo
	
	public static void main(String[] args) {
		
		Gerente g10 = new Gerente();
		g10.setNome("Marcos");
		g10.setSalario(5000.00);
				
		EditorVideo e10 = new EditorVideo();
		e10.setSalario(3000.0);
		
		Designer d10 = new Designer();
		d10.setSalario(2000.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g10);

		controle.registra(e10);
		controle.registra(d10);
		System.out.println(controle.getSoma());
		
		
	}
}
