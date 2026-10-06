public class Portabicicletas extends AccesorioDecorator {
    public Portabicicletas(Auto auto) { super(auto); }

    @Override
    public String getDescripcion() { return auto.getDescripcion() + " + Portabicicletas"; }

    @Override
    public long getPrecio() { return auto.getPrecio() + 910000; }
}