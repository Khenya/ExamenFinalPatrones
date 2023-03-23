package examenfinal.e1;

public class Client {
    public static void main(String[] args) {
        Zona zona1 = new Zona("zona 1",14,1);
        Zona zona2 = new Zona("zona 2",14,1);
        Zona zona3 = new Zona("Zona 3",14,1);


        Composite urbanizacion1 = new Composite(">>>urbanizacion 1",45);
        urbanizacion1.add(zona1);
        urbanizacion1.add(zona2);
        urbanizacion1.add(zona3);

        Composite urbanizacion2 = new Composite(">>> urbanizacion 2",51);
        urbanizacion2.add(new Zona("zona 4",51,1));
        urbanizacion2.add(new Zona("zona 5",12,1));
        urbanizacion2.add(new Zona("zona 6",174,1));

        Composite departamento = new Composite(">> dpt1",1);
        departamento.add(urbanizacion1);
        departamento.add(urbanizacion2);

        Composite departamento2 = new Composite(">> dpt2",11);
        departamento2.add(urbanizacion1);
        departamento2.add(urbanizacion2);
       

        Composite pais = new Composite(">> pais",11);
        pais.add(departamento);
        pais.add(departamento2);

        pais.operation();
    }
}
