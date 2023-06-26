
public class EditorVideo extends Funcionario{
	
	

	
	
	
	
	
	public double getBonificacao() {
		return + 100;
	}
	public double getTotal(double salario, double bonificacao) {
		return this.salario + this.getBonificacao();
	}


}
