package ejemplos;

public class Prueba4 {

    public static void main(String[] args) {
        Cajero cajero = new Cajero();
        cajero.setCaja("Caja 5");
        cajero.setNombre("Juan", "Carlos");
        cajero.setApellido("Perez");
        cajero.setPuesto("Captador de Datos");
        cajero.setSalario(900.00);
        cajero.setTurno("Diurno");

        System.out.println("Nombre Completo: " + cajero.getNombreCompleto());
        System.out.println("Nombre: " + cajero.getNombre());
        System.out.println("Apellido: " + cajero.getApellido());
        System.out.println("Puesto: " + cajero.getPuesto());
        System.out.println("Salario: " + cajero.getSalario());
        System.out.println("Salario Quincenal: " + cajero.getSalarioQuincenal());
        System.out.println("Caja: " + cajero.getCaja());
    }
}