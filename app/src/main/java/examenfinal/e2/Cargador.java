package examenfinal.e2;

public class Cargador extends Funcionalidad{
    private int costo;
    private String marca;
    private int tamano;

    public Cargador(ICelulara celularBase, int costo, String marca, int tamano) {
        super(celularBase);
        this.costo = costo;
        this.marca = marca;
        this.tamano = tamano;
    }

    @Override
    public void agregar(){
        super.agregar();
        System.out.println("++++++++++++++ Agregando Audifonos al Celular ++++++++++++++");
        setPrecio(getPrecio()+costo);
        System.out.println("Costo: "+costo);
        System.out.println("Marca: "+marca);
        System.out.println("Tamaño: "+tamano);
        System.out.println("Precio actualizado: "+getPrecio()+" Bs.");
    }
}
