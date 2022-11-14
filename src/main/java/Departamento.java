import java.util.ArrayList;

public class Departamento {
	private String nombreDepartamento;
	private ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();

	//constructor Departamento
	public Departamento (String nombreDepartamento){
		this.nombreDepartamento=nombreDepartamento;
	}

	public String getNombreDepartamento() {
		return this.nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
}