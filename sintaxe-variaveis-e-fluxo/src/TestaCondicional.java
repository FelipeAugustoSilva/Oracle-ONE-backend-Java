
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais!");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voce é maior de idade.");
		} else if (quantidadePessoas >= 2) {
			System.out.println("Voce esta acomanhado, pode entrar.");
		} else {
			System.out.println("Voce não pode entrar!");
		}
	}
}
