public abstract class Motor {
    protected String marca;
    protected String numSerie;
    protected double precioM;

    public Motor(String marca, String numSerie, double precioM) {
        this.marca = marca;
        this.numSerie = numSerie;
        this.precioM = precioM;
    }

    public abstract void setAlgo(float algo);
    public abstract String toString();

}