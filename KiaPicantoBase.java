public class KiaPicantoBase implements Auto {
    private String version;
    private long precio;

    public KiaPicantoBase(String version, long precio) {
        this.version = version;
        this.precio = precio;
    }

    @Override
    public String getDescripcion() {
        return "Kia Picanto Versión " + version;
    }

    @Override
    public long getPrecio() {
        return precio;
    }
}