import javax.faces.bean.ManagedBean;

@ManagedBean
public class ClaseBean {

	private String solicitud;
	private String nombre;
	private String msj;
	
	public ClaseBean(){
		solicitud="Ingrese su nombre por favor";
	}
	
	public void saludar(){
		String mensaje="Hola "+getNombre()+" Bienvenido al sistema";
		setMsj(mensaje);
	}
	
	public String getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMsj() {
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}
}
