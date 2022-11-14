public class Personal_Contratado extends Persona {
	private String sueldo;
	private String estadoContrato;

	//constructor Personal Contratado
	public Personal_Contratado (String nombre, String run, String estadoCivil, String sueldo, String estadoContrato){
		super(nombre, run, estadoCivil);
		this.sueldo=sueldo;
		this.estadoContrato=estadoContrato;
	}

	public String getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}

	public String getEstadoContrato() {
		return this.estadoContrato;
	}

	public void setEstadoContrato(String estadoContrato) {
		this.estadoContrato = estadoContrato;
	}
}