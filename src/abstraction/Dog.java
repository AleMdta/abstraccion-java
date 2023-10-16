package abstraction;



public class Dog extends Animal { //Mi clase Perro hereda los métodos de mi clase Animal

		// Polimorfear o sobreescribir el método heredado
		//Uso el método que está en mi clase animal, ya que lo hereda, pero necesito agregar el override, para que cambie la acción y se especificque para mi clase perro
		
	@Override //Con esto le decimos que hacersonido se va a sobre escribir
		public void hacerSonido() {
			System.out.println("El perro ladra y hace GUAU");
			
		}
	public static void main(String[] args) {
		
		//Generar instancia de mi perrito
		Animal chilaquil = new Dog();
		//Primero hago referencia a la clase padre y lo igualo con el new y usando la clase hija
		//Chilaquil corresponde a la clase Perro y también es un Animal
	
		chilaquil.hacerSonido();
	} 

	

}
