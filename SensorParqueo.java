public class SensorParqueo extends AccesorioDecorator {
    public SensorParqueo(Auto auto) { super(auto); }

    @Override
    public String getDescripcion() { return auto.getDescripcion() + " + Sensor de Parqueo"; }

    @Override
    public long getPrecio() { return auto.getPrecio() + 150000; }
}