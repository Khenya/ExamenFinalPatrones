package examenfinal.e2;

public class Funcionalidad implements ICelulara{
    private ICelulara celulara;

    public Funcionalidad(ICelulara celulara) {
        this.celulara = celulara;
    }

    @Override
    public int getPrecio() {
        return celulara.getPrecio();
    }

    @Override
    public void setPrecio(int precio) {
        celulara.setPrecio(precio);
    }

    @Override
    public int getRam() {
        return celulara.getRam();
    }

    @Override
    public void setRam(int ram) {
        celulara.setRam(ram);
    }

    @Override
    public void agregar() {
        celulara.agregar();
    }
}
