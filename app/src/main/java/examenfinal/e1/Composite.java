package examenfinal.e1;

import java.util.ArrayList;
import java.util.List;

public class Composite extends COmponent {
    private List<COmponent> componentList = new ArrayList<>();

    public Composite(String nombre, int poa) {
        
        super(nombre, poa);
    }

    @Override
    public void operation() {
        for (COmponent component:componentList) {
            component.operation();
            this.setNumeroHabitantes(getNumeroHabitantes() + component.getNumeroHabitantes());
        }
        Help.getInstance().show();

    }



    @Override
    public void add(COmponent composite) {
        componentList.add(composite);
    }

    @Override
    public void remove(COmponent composite) {
        componentList.remove(composite);
    }

    @Override
    public String show() {
        
        return "Nombre: " + getNombre()+" Numreo de habitantes: " + getNumeroHabitantes()+" Poa: " + getPoa() ;
    }

    
}
