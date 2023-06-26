
public class TestaGetESet {
	public static void main(String[] args) {
		ContaClient2 conta = new ContaClient2(1002, 1234568);
		
		
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		
		ClientClient2 Felipe = new ClientClient2();
		//conta.titular = Felipe;
		Felipe.setNome("Felipe Augusto da Silva");
		
		conta.setTitular(Felipe);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular());
		System.out.println(conta.getSaldo());
		
		conta.deposita(2897);
		System.out.println(conta.getSaldo());
		
		
		
		
	}
}
