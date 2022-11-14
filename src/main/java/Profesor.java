import java.util.ArrayList;

public class Profesor extends Personal_Contratado {

	//constructor Profesor
	public Profesor (String nombre, String run, String estadoCivil, String sueldo, String estadoContrato) {
		super(nombre, run, estadoCivil,sueldo, estadoContrato);
	}

	private ArrayList<Asignatura> asignaturaImpartida = new ArrayList<Asignatura>();
	private Departamento departamento;
}