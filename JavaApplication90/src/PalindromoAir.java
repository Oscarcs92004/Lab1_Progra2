
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
        if (asientos[i] != null && asientos[i].getNombre().equals(name)) {
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

    public void printPassengers() {
    }

    public double income() {
        return 0;
    }

    public void reset() {

    }

    public void sellTicket() {

    }

    public boolean cancelTicket(String nombre) {
        return false;
    }

    public void dispatch() {

    }

}
