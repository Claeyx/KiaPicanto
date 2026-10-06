void main() {

    IO.println("CLIENTE 1");
    Auto cliente1 = new KiaPicantoBase("Vibrant", 57990000);
    cliente1 = new Tapetes(cliente1);
    cliente1 = new SensorParqueo(cliente1);
    cliente1 = new PernosSeguridad(cliente1);

    IO.println("Detalle: " + cliente1.getDescripcion());
    IO.println("Precio Total: $" + cliente1.getPrecio());

    IO.println("CLIENTE 2");
    Auto cliente2 = new KiaPicantoBase("GT Line", 72990000);
    cliente2 = new BotonEncendido(cliente2);
    cliente2 = new Portabicicletas(cliente2);
    cliente2 = new Rin14(cliente2);

    IO.println("Detalle: " + cliente2.getDescripcion());
    IO.println("Precio Total: $" + cliente2.getPrecio());
}