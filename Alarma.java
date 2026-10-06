public class Alarma extends AccesorioDecorator {
    public Alarma(Auto auto) { super(auto); }

    @Override
    public String getDescripcion() { return auto.getDescripcion() + " + Alarma"; }

    @Override
    public long getPrecio() { return auto.getPrecio() + 205000; }
}