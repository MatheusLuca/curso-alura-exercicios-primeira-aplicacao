import java.util.Scanner;

public class Desafios {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = """
                Digite o numero do exercicio para entrar: 
                (1) Exercicio - Média de duas notas decimais e exiba o resultado.
                (2) Exercicio - Faça o casting da variável double para int.
                (3) Exercicio - variável do tipo char (letra) variável do tipo String Atribua valores a essas variáveis e concatene-as em uma mensagem.
                (4) Exercicio - Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
                (5) Exercicio - Realize a conversão do valor em dólares para reais e imprima o resultado formatado.. 
                (6) Exercicio - Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.         
                """;
        System.out.println(menu);
        System.out.println("Digite o numero correspondente ao exercicio: ");
        int exercicioEscolhido = sc.nextInt();

        switch (exercicioEscolhido){
            case 1:
                System.out.println("Digite nota 1: ");
                double n1 = sc.nextDouble();
                System.out.println("Digite nota 2: ");
                double n2 = sc.nextDouble();
                double media = ( n1 + n2 ) / 2;
                System.out.printf("Media : %.2f", media );
            break;
            case 2:
                System.out.println("2");
                double v1 = 8.0;
                int v2 = (int) v1;
                System.out.println(v2);
                break;
            case 3:
                System.out.println("3");
                char letra = 'c';
                String texto = "asa";
                System.out.printf("%c%s", letra, texto);
                break;
            case 4:
                double preco = 10.56;
                int quantidade = 4;
                double precoFinal = preco * quantidade;
                System.out.printf("Preço final do produto: %.2f", precoFinal);
                break;
            case 5:
                double valorEmDolar = 50.00;
                double valorDolarEmReal = 4.94;
                double valorRealEmDolar = valorEmDolar * valorDolarEmReal;
                System.out.printf("Valor de %.2f dolares é correspondente a %.2f reais", valorEmDolar, valorRealEmDolar);
                break;
            case 6:
                double precoOriginal = 150.00;
                double percentualDesconto = 0.90;
                double precoFinalDesconto = precoOriginal * percentualDesconto;
                System.out.printf("Preco com desconto %.2f", precoFinalDesconto);
                break;
        }





    }
}
