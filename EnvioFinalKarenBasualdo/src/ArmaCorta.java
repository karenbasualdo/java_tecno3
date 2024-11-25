public class ArmaCorta extends Arma {
    private boolean esAutomatica;

    @Override
    public String toString() {
        return "ArmaCorta{" +
                "esAutomatica=" + esAutomatica +
                ", " + super.toString() + // Llama al toString de la clase padre Arma
                '}';
    }


    public ArmaCorta(Policia policia, int municiones, int alcance, String marca, int calibre, String estado, boolean esAutomatica) {
        super(policia, municiones, alcance, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public boolean puedeDispararALargaDistancia() {
        if (!enCondiciones()) { // Verificar si el arma está en condiciones
            System.out.println("El arma no está en condiciones de ser usada.");
            return false;
        }
        return getAlcance() > 200;
    }

    public boolean isAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }
}
