package examenfinal.e2;

public class Android implements ICelulara{
    private String modelo;
    private int precio;
    private double androidVersion;
    private int memoriaRam;
    private String store;
    private int numeroChips;
    private double buildVersion;

    public Android(String modelo, int precio, double androidVersion, int memoriaRam, String store, int numeroChips, double buildVersion) {
        this.modelo = modelo;
        this.precio = precio;
        this.androidVersion = androidVersion;
        this.memoriaRam = memoriaRam;
        this.store = store;
        this.numeroChips = numeroChips;
        this.buildVersion = buildVersion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void agregar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getPrecio() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getRam() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setRam() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void stePrecio() {
        // TODO Auto-generated method stub
        
    }
    
}
