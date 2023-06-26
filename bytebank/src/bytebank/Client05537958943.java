package bytebank;

public class Client05537958943 {
	public static void main(String[] args) {
		Conta client05537958943 = new Conta();
		client05537958943.agencia = 0001;
		client05537958943.numero = 174458784 - 0;
		client05537958943.saldo = 9032918.0;
		client05537958943.titular = "Anne Caroline Reis Prado";

		client05537958943.deposita(25920.89);
		client05537958943.deposita(157000.07);
		System.out.println(client05537958943.saldo);

		client05537958943.saca(1200.00);
		client05537958943.deposita(8950.25);
		System.out.println(client05537958943.saldo);		
		
		
		
		
		Conta client08750199943 = client05537958943;
		client05537958943.transfere(1000, client08750199943 );
		System.out.println(client05537958943.saldo);
		
		System.out.println("Resumo de dados do cliente:");
		System.out.println(client05537958943);
		System.out.println(client05537958943.agencia);
		System.out.println(client05537958943.numero);
		System.out.println(client05537958943.saldo);
		System.out.println(client05537958943.titular);

	}
}
