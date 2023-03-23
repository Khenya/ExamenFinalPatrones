package examenfinal.e1;

public class Client {
    public static void main(String[] args) {
        Zona zona1 = new Zona("zona 1",1,5);
        Zona zona2 = new Zona("zona 2",1,5);
        Zona zona3 = new Zona("Zona 3",1,4);


        Composite urbanizacion1 = new Composite(">>>urbanizacion 1",1,45);
        urbanizacion1.add(zona1);
        urbanizacion1.add(zona2);
        urbanizacion1.add(zona3);

        Composite urbanizacion2 = new Composite(">>> urbanizacion 2",50000,4);
        urbanizacion2.add(new Zona("zona 4",1,4));
        urbanizacion2.add(new Zona("zona 5",1,52));
        urbanizacion2.add(new Zona("zona 6",1,5));

        Composite departamento = new Composite(">> dpt1",1,1);
        departamento.add(urbanizacion1);
        departamento.add(urbanizacion2);

        Composite departamento2 = new Composite(">> dpt2",1,1);
        departamento2.add(urbanizacion1);
        departamento2.add(urbanizacion2);
       

        Composite pais = new Composite(">> pais",1,1);
        pais.add(departamento);
        pais.add(departamento2);

        pais.operation();
    }
}
