package examenfinal.e2;

public class RAM extends Funcionalidad{
    private int costo;
    private String marca;
    private int capacidad;

    public RAM(ICelulara celularBase, int capacidad,int costo, String marca) {
        super(celularBase);
        this.costo = costo;
        this.marca = marca;
        this.capacidad= capacidad;
    }

    @Override
    public void agregar(){
        super.agregar();
        System.out.println("++++++++++++++ Agregando Audifonos al Celular ++++++++++++++");
        setPrecio(getPrecio()+costo);
        setRam(getRam()+capacidad);
        System.out.println("Costo: "+costo);
        System.out.println("Marca: "+marca);
        System.out.println("Capacidad: "+capacidad);
        System.out.println("Precio actualizado: "+getPrecio()+" Bs.");
    }
}
