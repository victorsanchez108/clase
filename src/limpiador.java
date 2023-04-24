public class limpiador {
    private String DNI;
    private String nombre;
    double sueldo_base;
    double tarifaporcliente;

    public limpiador(){};

    public limpiador(String DNI, String nombre, double sueldo_base, double tarifaporcliente) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.sueldo_base = sueldo_base;
        this.tarifaporcliente = tarifaporcliente;
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

    public double getTarifaporcliente() {
        return tarifaporcliente;
    }

    public void setTarifaporcliente(double tarifaporcliente) {
        this.tarifaporcliente = tarifaporcliente;
    }
}
