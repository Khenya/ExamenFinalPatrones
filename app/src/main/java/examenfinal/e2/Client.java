package examenfinal.e2;

public class Client {
    public static void main(String[] args) {
        ICelulara x = new Xiaomi("redmi",452,1.5,2, "la paz",11122,52.2);
        x = new Cargador(x,52,"Xiaomi",21);
        x = new Audifonos(x, 54,"Xiaomi");
        x = new RAM(x, 55, 50, "Xiaomi");
        x.agregar();
        
        ICelulara s = new Huawei("redmi",452,1.5,2, "la paz",11122,52.2);
        s = new Cargador(s,52,"Xiaomi",21);
        s = new Audifonos(s, 54,"Xiaomi");
        s = new RAM(x, 54,44,"huawei");
        s.agregar();
        
    }
}
