public abstract class AccesorioDecorator implements Auto {
    protected Auto auto;

    public AccesorioDecorator(Auto auto) {
        this.auto = auto;
    }

    @Override
    public String getDescripcion() {
        return auto.getDescripcion();
    }

    @Override
    public long getPrecio() {
        return auto.getPrecio();
    }
}