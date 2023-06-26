
public class Gerente extends Funcionario{
	
	
	private int senha;
	
	
	
	
	
	public double getBonificacao() {
		return this.salario * 0.50;
	}
	public double getTotal(double salario, double bonificacao) {
		return this.salario + this.getBonificacao();
	}
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}	
}
