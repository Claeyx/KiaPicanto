public class Tapetes extends AccesorioDecorator {
    public Tapetes(Auto auto) { super(auto); }

    @Override
    public String getDescripcion() { return auto.getDescripcion() + " + Tapetes"; }

    @Override
    public long getPrecio() { return auto.getPrecio() + 92000; }
}