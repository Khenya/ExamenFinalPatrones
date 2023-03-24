package examenfinal.e3;

public class Facebook implements ISocial {
    @Override
    public void integracion(IInscripciones inscripciones) {
        System.out.println("*** Integración con Facebook ***");
        System.out.println("Mostrando datos del sistema de control.- ");
        System.out.println("Nombre: "+inscripciones.getNombre());
        System.out.println("Capacidad: "+inscripciones.getCApacidad());
        System.out.println("Estudiantes: ");
        for(Estudiante estudiante : inscripciones.getEstudiantes()){
            System.out.println(estudiante.getNombre() + ", ");
        }
        System.out.println("Requisitos: "+inscripciones.getRegisito());
    }
}

