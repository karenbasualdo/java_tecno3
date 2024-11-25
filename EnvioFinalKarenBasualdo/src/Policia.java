public class Policia {
    private String nombre;
    private String apellido;
    private int legajo;
    private String rango;

    public Policia(String nombre, String apellido, int legajo, String rango) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Policia{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                ", rango='" + rango + '\'' +
                '}';
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
}
