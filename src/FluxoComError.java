import java.util.Set;
import java.util.TreeSet;

public class FluxoComError  {

    public static void main(String[] args) {

        System.out.println("Inicio do main");
        try{
            metodo1();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");

    }

    private static void metodo2() {
        //Simulating the StackOverflowError
        System.out.println("Calling metodo 2");
    }


}
