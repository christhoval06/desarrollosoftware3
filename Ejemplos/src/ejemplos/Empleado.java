package ejemplos;

public class Empleado extends Persona {

    private double salario;
    private String puesto;
    private String turno;

    public void setSalario(double s) {
        salario = s;
    }

    public double getSalario() {
        return salario;
    }

    public void setPuesto(String p) {
        puesto = p;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalarioQuincenal() {
        return salario / 2;
    }

    public void setTurno(String t) {
        turno = t;
    }

    public String getTurno() {
        return turno;
    }
}
