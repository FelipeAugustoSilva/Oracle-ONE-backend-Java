package bytebank;

public class Client08750199943 {
	public static void main(String[] args) {
		Conta client08750199943 = new Conta();
		client08750199943.agencia = 0001;
		client08750199943.numero = 123456789 - 0;
		client08750199943.saldo = 100.0;
		client08750199943.titular = "Felipe Augusto da Silva";

		client08750199943.deposita(133.03);
		client08750199943.deposita(3.03);
		System.out.println(client08750199943.saldo);

		client08750199943.saca(8.99);
		client08750199943.deposita(2.77);
		System.out.println(client08750199943.saldo);		
		
		
		
		
		
		System.out.println("Resumo de dados do cliente:");
		System.out.println(client08750199943);
		System.out.println(client08750199943.agencia);
		System.out.println(client08750199943.numero);
		System.out.println(client08750199943.saldo);
		System.out.println(client08750199943.titular);

	}
}
