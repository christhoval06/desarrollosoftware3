package ejemplos;
public class Ejemplo3 {

	public static void main(String[] args) {
		Empleado empleado = new Empleado();
		empleado.setNombre("Juan");
		empleado.setApellido("Perez");
		empleado.setPuesto("Captador de Datos");
		empleado.setSalario(350.00);
  empleado.setTurno("Diurno");
		
		System.out.println("Nombre Completo: "+ empleado.getNombreCompleto());
		System.out.println("Nombre: "+ empleado.getNombre());
		System.out.println("Apellido: "+ empleado.getApellido());
		System.out.println("Puesto: "+ empleado.getPuesto());
		System.out.println("Salario: "+ empleado.getSalario());
		System.out.println("Salario Quincenal: "+ empleado.getSalarioQuincenal());
  System.out.println("Turno: "+ empleado.getTurno());
	}
}
