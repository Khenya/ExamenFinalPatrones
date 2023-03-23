package examenfinal.e1;

import java.util.ArrayList;
import java.util.List;

public class Composite extends COmponent {
    private List<COmponent> componentList = new ArrayList<>();

    public Composite(String nombre, int numeroHabitantes, int poa) {
        
        super(nombre, numeroHabitantes, poa);
    }

    @Override
    public void operation() {
        System.out.println("Composite>   nombre:" +getNombre());
        System.out.println("Composite>    numero de Habitantes: " + getNumeroHabitantes());
        System.out.println("Composite>    poa:" + getPoa());
        for (COmponent component:componentList) {
            component.operation();
        }
    }


    @Override
    public COmponent get(int position) {
        return componentList.get(position);
    }

    @Override
    public void add(COmponent composite) {
        componentList.add(composite);
    }

    @Override
    public void remove(COmponent composite) {
        componentList.remove(composite);
    }
}
