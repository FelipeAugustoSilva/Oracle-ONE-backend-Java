
public class TestaValores {
	public static void main(String[] args) {
		ContaClient2 conta = new ContaClient2(1001, 1234560);
		
		ContaClient2 conta2 = new ContaClient2(1001, 1234570);
		
		ContaClient2 conta3 = new ContaClient2(1001, 1234580);
		
		System.out.println("O numero total de contas é: " + ContaClient2.getTotal());
	}
}
