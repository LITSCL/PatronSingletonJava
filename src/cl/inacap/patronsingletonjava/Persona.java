package cl.inacap.patronsingletonjava;

public class Persona {
	private static Persona persona;
	private String nombre = "Daniel";
	
	private Persona() {
		
	}
	
	public static Persona getInstance() {
		if (persona == null) {
			persona = new Persona();
		}
		return persona;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
