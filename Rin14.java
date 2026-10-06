public class Rin14 extends AccesorioDecorator {
    public Rin14(Auto auto) { super(auto); }

    @Override
    public String getDescripcion() { return auto.getDescripcion() + " + Rin 14"; }

    @Override
    public long getPrecio() { return auto.getPrecio() + 500000; }
}