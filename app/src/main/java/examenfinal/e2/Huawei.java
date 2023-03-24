package examenfinal.e2;

public class Huawei implements ICelulara{
    private String modelo;
    private int precio;
    private double android;
    private int ram;
    private String store;
    private int numeroChips;
    private double buildVersion;

    public Huawei(String modelo, int precio, double android, int ram, String store, int numeroChips, double buildVersion) {
        this.modelo = modelo;
        this.precio = precio;
        this.android = android;
        this.ram = ram;
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
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getAndroidVersion() {
        return android;
    }

    public void setAndroidVersion(double android) {
        this.android = android;
    }

    @Override
    public int getRam() {
        return ram;
    }

    @Override
    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public void agregar() {
        System.out.println("++++++++++++++ caracteristicas ++++++++++++++");
        System.out.println("Modelo: "+getModelo());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Versión de android: "+getAndroidVersion());
        System.out.println("Memoria RAM: "+getRam());
        System.out.println("Store: "+getStore());
        System.out.println("Número de chips: "+getNumeroChips());
        System.out.println("Build Version: "+getBuildVersion());
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getNumeroChips() {
        return numeroChips;
    }

    public void setNumeroChips(int numeroChips) {
        this.numeroChips = numeroChips;
    }

    public double getBuildVersion() {
        return buildVersion;
    }

    public void setBuildVersion(double buildVersion) {
        this.buildVersion = buildVersion;
    }

}
