package bytebank;

public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo+= 100;
		System.out.println(primeiraConta.saldo);
		
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
	}
}
