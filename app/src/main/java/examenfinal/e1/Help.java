package examenfinal.e1;

import java.util.Stack;

public class Help {
    private Stack<String> imprimir = new Stack<>();
    private int numeroHabitantesT = 0;

    private static Help instance;

    private Help() {}

    public static Help getInstance() {
        if (instance == null){
            instance = new Help();
        }
        return instance;
    }

    public void add(String info) {
        imprimir.push(info);
    }
    public void show(){
        while (!imprimir.isEmpty()){
            System.out.println(imprimir.pop());
        }
    }

    public int getNumeroHabitantesGlobal(){
        return numeroHabitantesT;
    }

    public void setNumeroHabitantesT(int numeroHabitantesT){
        this.numeroHabitantesT = numeroHabitantesT;
    }
}
