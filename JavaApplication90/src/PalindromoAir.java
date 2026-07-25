public class PalindromoAir {

    Ticket[] asientos = new Ticket[30];

    public int firstAvailable(int i) {
        if (i >= 30) return -1;
        if (asientos[i] == null) return i;
        return firstAvailable(i + 1);
    }

    public int searchPassenger(String name, int i) {
        if (i >= 30) return -1;
        if (asientos[i] != null && asientos[i].getNombre().equals(name)) return i;
        return searchPassenger(name, i + 1);
    }

    public Ticket[] getAsientos() {
        return asientos;
    }
}
