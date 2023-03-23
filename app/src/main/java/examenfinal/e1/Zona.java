package examenfinal.e1;

public class Zona extends COmponent{

    @Override
    public String show() {
        return "nombre:" +getNombre() + " numero de Habitantes: " + getNumeroHabitantes() + " poa:" + getPoa();
    }

    public Zona(String nombre,  int poa,int numeroHabitantes) {
        super(nombre, poa);
    }

    @Override
    public void operation() {
        Help.getInstance().add(this.show());
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

    
}
