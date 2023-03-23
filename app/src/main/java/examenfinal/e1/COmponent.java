package examenfinal.e1;

public abstract class COmponent {
    private String nombre;
    private int numeroHabitantes;
    private int poa;

   

   

    public COmponent(String nombre, int poa) {
        this.nombre = nombre;
        this.poa = poa;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }
    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
    public int getPoa() {
        return poa;
    }
    public void setPoa(int poa) {
        this.poa = poa;
    }
    public abstract void operation();
    public abstract void add(COmponent composite);
    public abstract void remove(COmponent composite);
    public abstract String show();
}
