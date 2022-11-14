public class Estudiante extends Persona {
	private String asignaturaInscrita;

	//constructor Estudiante
	public Estudiante (String nombre, String run, String estadoCivil, String asignaturaInscrita){
		super(nombre, run, estadoCivil);
		this.asignaturaInscrita=asignaturaInscrita;
	}

	public String getAsignaturaInscrita() {
		return this.asignaturaInscrita;
	}

	public void setAsignaturaInscrita(String asignaturaInscrita) {
		this.asignaturaInscrita = asignaturaInscrita;
	}
}