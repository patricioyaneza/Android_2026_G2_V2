
public interface Operaciones {
// declarar constantes
	static int IVA = 19;
	static double IVA_DECIMAL = .19;
	
	static String ACCESO_BODEGA = "bodega.html";
	
	static int CODIGO_TIPO_USUARIO_ADMINISTRADOR = 1;
	static int CODIGO_TIPO_USUARIO_CAJERO = 2;
	static int CODIGO_TIPO_USUARIO_SUPERVISOR = 3;
	
// declara metodos
	boolean guardar(); 
	boolean eliminar(); 
	boolean modificar();
}
