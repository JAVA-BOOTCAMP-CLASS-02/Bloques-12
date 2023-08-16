
public class Bloques {

	{
		System.out.println("Se creo una instancia de Bloques1");
	}
	{
		System.out.println("Se creo una instancia de Bloques2");
	}
	{
		System.out.println("Se creo una instancia de Bloques3");
		{
			System.out.println("Se creo una instancia de Bloques3-1");
		}
	}	
	
	public static void main(String[] args) {
		Bloques b1 = new Bloques();
		Bloques b2 = new Bloques();
		Bloques b3 = new Bloques();
		Bloques b4 = new Bloques();
		Bloques b5 = new Bloques();

	}

	static {
		System.out.println("Se cargo la clase Bloques");
	}
	
}
