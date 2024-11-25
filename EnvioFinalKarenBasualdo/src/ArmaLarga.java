public class ArmaLarga extends Arma {
    private boolean tieneSello;
    private String descripcionUso; // Nueva descripción del uso del arma
    private int nivel;

    // Constructor con todos los atributos, incluida la descripción de uso
    public ArmaLarga(Policia policia, int municiones, int alcance, String marca, int calibre, String estado, boolean tieneSello, String descripcionUso, int nivel) {
        super(policia, municiones, alcance, marca, calibre, estado);
        this.tieneSello = tieneSello;
        this.descripcionUso = descripcionUso;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "ArmaLarga{" +
                "tieneSello=" + tieneSello +
                ", descripcionUso='" + descripcionUso + '\'' +
                ", nivel=" + nivel +
                ", " + super.toString() + // Llama al toString de la clase padre Arma
                '}';
    }

    // Métoodo para comparar niveles entre armas largas
    public int comparar(ArmaLarga otraArma) {
        return Integer.compare(this.nivel, otraArma.nivel);
    }

    // El Getters y setters para los atributos
    public boolean isTieneSello() {
        return tieneSello;
    }

    public void setTieneSello(boolean tieneSello) {
        this.tieneSello = tieneSello;
    }

    public String getDescripcionUso() {
        return descripcionUso;
    }

    public void setDescripcionUso(String descripcionUso) {
        this.descripcionUso = descripcionUso;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 1 && nivel <= 5) { // Validar que el nivel esté entre 1 y 5
            this.nivel = nivel;
        } else {
            throw new IllegalArgumentException("El nivel debe estar entre 1 y 5.");
        }
    }
}

