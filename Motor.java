class Motor extends Caballos {
    private String tipo;
    private int cilindrada;
    
    public Motor(int potencia, int rpmMax, String tipo, int cilindrada) {
        super(potencia, rpmMax);
        this.tipo = tipo;
        this.cilindrada = cilindrada;
    }
    
    public String getEspecificaciones() {
        return "Motor " + tipo + " " + cilindrada + "cc | " + getInfoPotencia();
    }
}