public class TiroArrastre extends AccesorioDecorator {
    public TiroArrastre(Auto auto) { super(auto); }

    @Override
    public String getDescripcion() { return auto.getDescripcion() + " + Tiro de Arrastre"; }

    @Override
    public long getPrecio() { return auto.getPrecio() + 810000; }
}