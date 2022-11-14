import java.util.ArrayList;

public class Asignatura {
	private String nombreAsignatura;
	private String codigoAsignatura;
	private ArrayList<Estudiante> estudianteInscrito = new ArrayList<Estudiante>();

	//constructor Asignatura
	public Asignatura (String nombreAsignatura, String codigoAsignatura){
		this.nombreAsignatura=nombreAsignatura;
		this.codigoAsignatura=codigoAsignatura;
	}

	public String getNombreAsignatura() {
		return this.nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getCodigoAsignatura() {
		return this.codigoAsignatura;
	}

	public void setCodigoAsignatura(String codigoAsignatura) {
		this.codigoAsignatura = codigoAsignatura;
	}
}