public class BotonEncendido extends AccesorioDecorator {
    public BotonEncendido(Auto auto) { super(auto); }

    @Override
    public String getDescripcion() { return auto.getDescripcion() + " + Botón de Encendido"; }

    @Override
    public long getPrecio() { return auto.getPrecio() + 1500000; }
}