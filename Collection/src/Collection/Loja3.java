//3Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection 
//do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
//Armazenar dados da List
//Remover dados da list;
//Atualizar dados da list.
//Apresentar todos os dados da list.




package Collection;

import java.util.ArrayList;
import java.util.List;


public class Loja3 {
	
	
	
	public static void main(String[] args) {
		
		List<String> Mercadorias = new ArrayList<>();
		
		Mercadorias.add("Pudim");
		Mercadorias.add("Torta");
		Mercadorias.add("Bolo");
		Mercadorias.add("Brigadeiro");
		Mercadorias.add("Casadinho");
		Mercadorias.add("Beijinho");
		
		
		System.out.println(Mercadorias.toString());
		Mercadorias.remove(5);
		System.out.println(Mercadorias.toString());
		System.out.println("Terminou as mercadorias do armazenamento: " +Mercadorias.isEmpty());
		System.out.println("Tem Beijinho no armazenamento? "+Mercadorias.contains("Beijinho"));
		System.out.println("Variedades de mercadorias no armazenamento: "+Mercadorias.size()); 
		System.out.println("");
	}

}


