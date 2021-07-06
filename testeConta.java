import java.util.*;

public class testeConta {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in); 

        conta conta1 = new conta();

        System.out.println("Bem vindo a Nubank" +
        "\nHoje é aniversario da Nubank, quem fizer a sua conta hoje vai pode ganhar 200 reais de credito" +
        "\nVoce gostaria de fazer uma conta ? \n1. Sim \n2. Não \n3. Ja tenho uma");
        int escolha = sc.nextInt();

        if (escolha == 1){
            conta1.cadastro();
        }
        else if (escolha == 2){
            System.out.println("Esperamos conseguir fazer você mudar de ideia um dia " +
            "\nObrigado pela atenção, a Nubank agradece ");
			System.exit(0);
        }
        else if (escolha == 3){
            conta1.login();
        }
    }    
}
