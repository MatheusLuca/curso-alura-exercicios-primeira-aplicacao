import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroRandom = new Random().nextInt(100);
        int tentativas = 5;

        while(tentativas > 0){
        System.out.println("Digite um numero");
        int numeroDigitado = sc.nextInt();

                if(numeroDigitado == numeroRandom){
                    System.out.println("Voce acertou faltando tentativas " + tentativas);
                    break;
                }
                if(numeroDigitado > numeroRandom) {
                    System.out.println("Numero digitado é maior");
                    --tentativas;
                }else{
                    System.out.println("Numero digitado é menor");
                    --tentativas;
                }
            System.out.println("Voce ainda possui: " + tentativas);
        }



    }
}
