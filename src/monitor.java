public class monitor {
    private String DNI;
    private String nombre;
    double sueldo_base;
    double tarifaporactividad;

    public monitor(){};

    public monitor(String DNI, String nombre, double sueldo_base, double tarifaporactividad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.sueldo_base = sueldo_base;
        this.tarifaporactividad = tarifaporactividad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getTarifaporactividad() {
        return tarifaporactividad;
    }

    public void setTarifaporactividad(double tarifaporactividad) {
        this.tarifaporactividad = tarifaporactividad;
    }



}
