
public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario Felipe = new Gerente();
		Felipe.setNome("Felipe Augusto da Silva");
		Felipe.setCpf("08750199943");
		Felipe.setSalario(2650);
		
		
		System.out.println(Felipe.getNome());
		System.out.println(Felipe.getSalario());
		System.out.println(Felipe.getBonificacao());
	}
}
