class Coche {
    private Marca marca;
    private String modelo;
    private Motor motor;
    private boolean modoSport;
    
    public Coche(Marca marca, String modelo, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(potencia, 6500, "Gasolina", potencia * 10); // Relación simplificada
        this.modoSport = false;
    }
    
    public void acelerar() {
        System.out.println("Acelerando con " + motor.getInfoPotencia());
    }
    
    public void activarModoSport() {
        modoSport = true;
        System.out.println("¡Modo Sport activado!");
    }
    
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca.getInfoMarca());
        System.out.println("Modelo: " + modelo);
        System.out.println("Especificaciones: " + motor.getEspecificaciones());
    }
}