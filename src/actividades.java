public class actividades {
    private  String codigo;
    private double precio;
    private String nombre;
    private int maximoClientesPermitidas;
    private String monitorenc;

    public actividades() {}

    public actividades(String codigo, double precio, String nombre, int maximoClientesPermitidas, String monitorenc) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.maximoClientesPermitidas = maximoClientesPermitidas;
        this.monitorenc = monitorenc;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMaximoClientesPermitidas() {
        return maximoClientesPermitidas;
    }

    public void setMaximoClientesPermitidas(int maximoClientesPermitidas) {
        this.maximoClientesPermitidas = maximoClientesPermitidas;
    }

    public String getMonitorenc() {
        return monitorenc;
    }

    public void setMonitorenc(String monitorenc) {
        this.monitorenc = monitorenc;
    }



    public void mostraractividades(){
        System.out.println("¿Que actividad quieres?");
        System.out.println("1. BODYPUMP");
        System.out.println("2. CROSSFIT");
        System.out.println("3. LIBRE");
        System.out.println("4. NATACION");
    }
}
