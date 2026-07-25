
public class PalindromoAir {

    Ticket[] asientos = new Ticket[30];

    public int firstAvailable(int i) {
        if (i >= 30) {
            return -1;
        }
        if (asientos[i] == null) {
            return i;
        }
        return firstAvailable(i + 1);
    }

    public int searchPassenger(String name, int i) {
        if (i >= 30) {
            return -1;
        }
        if (asientos[i] != null && asientos[i].getNombre().equalsIgnoreCase(name)) {
            return i;
        }
        return searchPassenger(name, i + 1);
    }

    public Ticket[] getAsientos() {
        return asientos;
    }

    public boolean isPalindromo(String nombre, int iz, int der) {
        if (iz < nombre.length()) {
            if (nombre.toLowerCase().charAt(iz) == nombre.toLowerCase().charAt(der)) {
                if (iz == nombre.length() - 1) {
                    return true;
                }
                return isPalindromo(nombre, iz + 1, der - 1);
            }
        }
        return false;
    }

    public void printPassengers(int indice){
        if(indice >= 30){
            return;
        }
        if(asientos[indice] != null){
            asientos[indice].print();
        }
        printPassengers(indice+1);
    }

    public double income(int indice, double total) {
        if(indice >= 30){
            return total;
        }
        
        if(asientos[indice] != null){
            total += asientos[indice].getMontoFinal();
        }
        
        return income(indice+1,total);
    }

    public void reset(int indice) {
        if(indice >= 30){
            return;
        }
        asientos[indice] = null;
        reset(indice+1);
    }

    public void sellTicket(String nombre) {
        int asiento = firstAvailable(0);
        
        if(asiento == -1){
            
            return;
        }
        
        boolean esPalindromo = isPalindromo(nombre,0,nombre.length()-1);
        double original = 100;
        double pagoFinal = esPalindromo ? original*0.8 : original;
        Ticket t = new Ticket(nombre,original,pagoFinal, esPalindromo);
        asientos[asiento] = t;
    }

    public boolean cancelTicket(String nombre) {
        int posicion = searchPassenger(nombre,0);
        if(posicion == -1){
            return false;
        }
        asientos[posicion] = null;
        return true;
    }

    public double dispatch() {
        double total = income(0,0);
        reset(0);
        return total;
    }

}
