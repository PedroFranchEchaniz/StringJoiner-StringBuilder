package ejemploPractico;

import java.util.List;

public interface GenerarCorreo {
	public String acortarNombre(int index);
	public String acortarApellido(int index);
	public List<String> generarCorreo(int anio,String extension);
	public void agregarCorreo(List<String> correos);
}
