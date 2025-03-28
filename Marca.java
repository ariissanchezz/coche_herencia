class Marca {
    private String nombre;
    private String pais;
    private int fundacion;
    
    public Marca(String nombre, String pais, int fundacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.fundacion = fundacion;
    }
    
    public String getInfoMarca() {
        return nombre + " (" + pais + ", " + fundacion + ")";
    }
}