public class PernosSeguridad extends AccesorioDecorator {
    public PernosSeguridad(Auto auto) { super(auto); }

    @Override
    public String getDescripcion() { return auto.getDescripcion() + " + Pernos de Seguridad"; }

    @Override
    public long getPrecio() { return auto.getPrecio() + 156010; }
}