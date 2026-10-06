public class Rin13 extends AccesorioDecorator {
    public Rin13(Auto auto) { super(auto); }

    @Override
    public String getDescripcion() { return auto.getDescripcion() + " + Rin 13"; }

    @Override
    public long getPrecio() { return auto.getPrecio() + 350000; }
}