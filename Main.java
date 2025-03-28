public class Main {
    public static void main(String[] args) {
        Marca vw = new Marca("Volkswagen", "Alemania", 1937);
        Marca bmw = new Marca("BMW", "Alemania", 1916);
        
        Coche golf = new Coche(vw, "Golf GTI", 245);
        Coche m3 = new Coche(bmw, "M3 Competition", 510);
        
        System.out.println("=== COCHE 1 ===");
        golf.mostrarDetalles();
        golf.acelerar();
        
        System.out.println("\n=== COCHE 2 ===");
        m3.mostrarDetalles();
        m3.acelerar();
        m3.activarModoSport();
    }
}
