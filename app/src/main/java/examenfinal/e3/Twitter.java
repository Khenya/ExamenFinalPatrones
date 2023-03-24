package examenfinal.e3;

public class Twitter implements ISocial{
    @Override
    public void integracion(IInscripciones inscripciones) {
        System.out.println("*** Integración con Twitter ***");
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
