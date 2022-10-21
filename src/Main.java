import java.util.Random;
public class Main {
    private static boolean todosMenores (int[]numeros){
        int contador = 0;
        for (int i = 0; i< numeros.length; i++){
            if (numeros[i] <= 5){
                contador++;
            }
        }
        if (contador == 10){
            return true;
        }
        return false;
    }
    private static void  maioresQue5 (int [] numeros){
        for (int i = 0; i< numeros.length; i++){
            if (numeros[i]>5){
                System.out.print("numero: ");
                System.out.println(numeros[i]);
                System.out.print("posicao: ");
                System.out.println(i);
                System.out.println("============");
            }
        }
    }
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int [] numeros = new int[10];
        for (int i = 0; i< numeros.length; i++){
            numeros[i]=aleatorio.nextInt(0, 7);
        }

        if (todosMenores(numeros)){
            System.out.println("nao possui numeros maiores que 5");

        } else{
            System.out.println("--Numeros maiores que 5--");
            System.out.println("============");
            maioresQue5(numeros);
        }

    }
}