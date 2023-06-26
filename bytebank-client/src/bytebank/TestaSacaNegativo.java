package bytebank;

public class TestaSacaNegativo {
	public static void main(String[] args) {
		ContaClient conta = new ContaClient();
        conta.deposita(100);
        System.out.println(conta.saca(101));

        conta.saca(101);

        System.out.println(conta.getSaldo());
	}
}
