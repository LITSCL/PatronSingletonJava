package cl.inacap.patronsingletonjava;

public class Start {

	public static void main(String[] args) {
		Persona persona1 = Persona.getInstance();
		Persona persona2 = Persona.getInstance();
		
		persona1.setNombre("Esteban");
		
		System.out.println(persona2.getNombre());
	}
}
