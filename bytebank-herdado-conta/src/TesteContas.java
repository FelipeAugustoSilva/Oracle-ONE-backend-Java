
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(11, 111);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(12, 112);
		cp.deposita(200.00);

		
		cc.transfere(10.0, cp);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		
		cp.transfere(15, cc);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		cp.saca(55);
		cc.saca(47);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}
