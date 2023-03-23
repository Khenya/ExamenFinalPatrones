package examenfinal.e1;

public class Zona extends COmponent{

    public Zona(String nombre, int numeroHabitantes, int poa) {
        super(nombre, numeroHabitantes, poa);
    }

    @Override
    public void operation() {
        System.out.println("nombre:" +getNombre());
        System.out.println("numero de Habitantes: " + getNumeroHabitantes());
        System.out.println("poa:" + getPoa());
    }

    @Override
    public void add(COmponent composite) {
        // no se pone nada
        System.out.println("Este es el objeto simple no puede agregar a otros");
    }

    @Override
    public void remove(COmponent composite) {
        // no se pone nada
        System.out.println("Este es el objeto simple no puede agregar a otros");

    }

    @Override
    public COmponent get(int position) {
        // no se pone nada
        System.out.println("Este es el objeto simple no puede agregar a otros");
        return null;
    }
}
