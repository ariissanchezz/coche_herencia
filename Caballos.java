class Caballos {
    private int potencia;
    private int rpmMax;
    
    public Caballos(int potencia, int rpmMax) {
        this.potencia = potencia;
        this.rpmMax = rpmMax;
    }
    
    public double convertirAKW() {
        return potencia * 0.7355;
    }
    
    public String getInfoPotencia() {
        return potencia + " CV (" + convertirAKW() + " kW) @ " + rpmMax + " rpm";
    }
}
