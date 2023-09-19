import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        System.out.println("-------------------Desafio Controle de fluxo---------------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int segundoNumero = sc.nextInt();

        try{
            contar(parametro1, parametro2);
        }catch (ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }



        public static void contar(int parametroUm, int parametroDois); throws ParametrosInvalidosException {
            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException();
            }else {
                int diferenca = parametroDois - parametroUm;
                for (int i = 1; i <= diferenca; ++i) {
                    System.out.println("Imprimindo a " + i + "ª interação: " + i);
                }
            }
        }


    }
}

