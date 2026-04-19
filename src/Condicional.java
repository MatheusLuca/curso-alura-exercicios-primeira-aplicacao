public class Condicional {
    static void main(String[] args) {
        int anoDeLancamento = 1998;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if(anoDeLancamento > 2022){
            System.out.println("Lançamento que os clientes estão curtindo!!");
        } else{
            System.out.println("Filme retro vale a pena assistir!");
        }

        if(incluidoNoPlano == true || tipoPlano.equalsIgnoreCase("plus")){
            System.out.println("Filme Liberado!");
        } else{
            System.out.println("Deve pagar locação!");
        }
    }
}
