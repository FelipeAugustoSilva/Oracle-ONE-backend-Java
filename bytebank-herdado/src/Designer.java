
public class Designer extends Funcionario{
	
	

	
	
	
	
	
	public double getBonificacao() {
		return + 200;
	}
	public double getTotal(double salario, double bonificacao) {
		return this.salario + this.getBonificacao();
	}


}
