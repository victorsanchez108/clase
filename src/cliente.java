public class cliente {
    private   String DNI;
    private   String Nombre;
    private   String apellido1;
    private   String apellido2;
    private  double dinero;
    private String[] actividad;

    public cliente(){};

    public cliente(String DNI, String nombre, String apellido1, String apellido2, double dinero) {
        this.DNI = DNI;
        Nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dinero = dinero;

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String[] getActividad() {
        return actividad;
    }

    public void setActividad(String[] actividad) {
        this.actividad = actividad;
    }


}
