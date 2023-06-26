package bytebank;

public class TestaBanco {
	public static void main(String[] args) { 
        ClientClient FelipeAugustoDaSilva = new ClientClient(); 
        FelipeAugustoDaSilva.nome = "Felipe Augusto Da Silva";
        FelipeAugustoDaSilva.cpf = "087.501.999-43";
        FelipeAugustoDaSilva.profissao = "programador";

        ContaClient contaDoFelipeAugustoDaSilva = new ContaClient(); 
        contaDoFelipeAugustoDaSilva.deposita(100);
    
	
	
        contaDoFelipeAugustoDaSilva.titular = FelipeAugustoDaSilva;
        System.out.println(contaDoFelipeAugustoDaSilva.titular.nome);
        System.out.println(contaDoFelipeAugustoDaSilva.titular);
        System.out.println(FelipeAugustoDaSilva);
	}
}
