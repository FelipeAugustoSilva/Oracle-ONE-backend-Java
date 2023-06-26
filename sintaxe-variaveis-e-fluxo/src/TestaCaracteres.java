
public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a'; //char e um tipo que so salva um caractere.
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1); //casting no char.
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";  // String não é uma palavra reservada.
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
