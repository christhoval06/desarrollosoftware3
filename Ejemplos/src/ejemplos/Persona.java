package ejemplos;

public class Persona {

    private String nombre, apellido, nombre2, apellido2;

    public void setApellido(String a) {
        apellido = a;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String n) {
        nombre = n;
        nombre2 = "";
    }
    
    public void setNombre(String n, String n2) {
        nombre = n;
        nombre2 = n2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}
