public abstract class Arma {
    private Policia policia;
    private int municiones;
    private int alcance;
    private String marca;
    private int calibre;
    private String estado;

    @Override
    public String toString() {
        return "Arma{" +
                "policia=" + policia +
                ", municiones=" + municiones +
                ", alcance=" + alcance +
                ", marca='" + marca + '\'' +
                ", calibre=" + calibre +
                ", estado='" + estado + '\'' +
                '}';
    }


    public Arma(Policia policia, int municiones, int alcance, String marca, int calibre, String estado) {
        this.policia = policia;
        this.municiones = municiones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public boolean enCondiciones() {
        return "EN USO".equalsIgnoreCase(estado) && calibre >= 9;
    }

    public Policia getPolicia() {
        return policia;
    }

    public int getMuniciones() {
        return municiones;
    }

    public int getAlcance() {
        return alcance;
    }

    public String getMarca() {
        return marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
