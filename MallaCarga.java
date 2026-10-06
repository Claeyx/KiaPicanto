public class MallaCarga extends AccesorioDecorator {
    public MallaCarga(Auto auto) { super(auto); }

    @Override
    public String getDescripcion() { return auto.getDescripcion() + " + Malla de Carga"; }

    @Override
    public long getPrecio() { return auto.getPrecio() + 110000; }
}