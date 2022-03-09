package Animal;

public class Preguica {

	public static void main(String[] args) {
		
		Animal Preguica = new Animal();
		
		Preguica.getClass();
		Preguica.setNome( "Fonseca");
		Preguica.setIdade( 5 );
		
		{
			
			System.out.println(" _____hmmm----hmmm_____");
			System.out.println("O nome do bicho preguiça é: " +Preguica.getNome());
			System.out.println("A idade do bicho preguiça é: " +Preguica.getIdade());
			System.out.println("Este animal Deve subir em árvores.");
			
		}

	}

}
