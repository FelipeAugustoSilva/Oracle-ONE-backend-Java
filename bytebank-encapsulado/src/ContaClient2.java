

public class ContaClient2 {
	private double saldo;
	private int agencia;
	private int numero;
	private ClientClient2 titular;
	private static int total;

	
	
	
	
	public ContaClient2(int agencia, int numero) {
		ContaClient2.total++;
		System.out.println("O total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma nova conta: " + this.agencia + " " + this.numero);
	}
	
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;

	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, ContaClient2 destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Nâo pode valor igual menor a zero!");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Nâo pode valor igual menor a zero!");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(ClientClient2 titular) {
		this.titular = titular;
	}
	public ClientClient2 getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return ContaClient2.total;
	}
	
	

}
