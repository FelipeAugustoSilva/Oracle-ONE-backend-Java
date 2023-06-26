
public class TestaGerente {
  public static void main(String[] args) {
	Gerente g1 = new Gerente();
	g1.setNome("Felipe Augusto da Silva");
	g1.setCpf("08750199943");
	g1.setSalario(2650);
	
	
	System.out.println("Nome:      " + g1.getNome()+ "|");
	System.out.println("CPF:                   " + g1.getCpf()+ "|");
	System.out.println("Salario:                  R$" + g1.getSalario()+ "|");

	System.out.println("Bonifiação:               R$" + g1.getBonificacao()+ "|");
	System.out.println("Beneficios totais:        R$" + g1.getTotal(g1.getSalario(), g1.getBonificacao())+ "|");
}
}
