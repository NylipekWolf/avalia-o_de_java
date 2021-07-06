import java.util.*;

public class conta {
    Scanner sc = new Scanner (System.in); 

    String nome_titular;
    String agencia;
    int numero ;
    String data_de_abertura;
    double saldo;
    
    void cadastro (){
        System.out.println("perfeito!!" +
        "\nVamos continuar o seu cadastro , qual seria o seu nome ?");
        nome_titular = sc.next();
        data_de_abertura = "15/02/2021";
        numero = 550258047;
        System.out.println("Ok " + nome_titular + " a data de abertura do seu cartão é :" + data_de_abertura +
        "\nE o numero da sua conta é : " + numero + 
        "\nAgora que sua conta foi finalizada, voce pode começar o seu primeiro passo para sua liberdade financeira." +
        "\nDeseja fazer o seu primeiro deposito para aumentar o seu saldo ? \n1. Sim \n2. Não");
        int escolha2 = sc.nextInt();
        if(escolha2 == 1){
            System.out.println("Quanto gostaria de depositar ?");
            double deposito = sc.nextInt();
            Double saldo = 0.0;
            saldo += deposito;
            System.out.print("\nDeposito realizado com sucesso." +
            "\nO seu saldo atual é : " + saldo +
            "\nObrigado por utilizar o nosso Banco " + nome_titular);
            System.exit(0);
        }
        else {
            System.out.println("Obrigado por criar sua conta e esperamos te ver mais vezes");
        }
    }
    void login (){
        numero = 12072001;
        int tentativas = 3;
        System.out.println("Otimo saber disso" +
        "\nQual seria o numero da sua conta : ");
        while(tentativas > 0){
            int numero = sc.nextInt();

            if(numero == 12072001){
                nome_titular = "Kepilyn";
                Double saldo = 1000.0;
                System.out.print("Bem-vindo de volta " + nome_titular + " o Saldo da sua conta é : " + saldo);
                System.out.print("\nO que vamos fazer na sua conta hoje ? Escolha uma das opcoes:\n1. Saque\n2. Deposito\n3. Rendimento \n4. Sair \n");
                int opcao = sc.nextInt(); 
                if(opcao == 1){
                    System.out.print("\nInforme o valor para retirada: ");
					double retirada = sc.nextDouble();
                    if (retirada > 0 && retirada <= saldo){
                        saldo = saldo - retirada;
                        System.out.print("\nO saldo da sua conta agora e de: " + saldo +
                        "\nSaque realizado com sucesso." +
                        "\nObrigado por utilizar o nosso Banco " + nome_titular);
                        System.exit(0);
                    }
                    else if (retirada > saldo){
                        System.out.print("\nNao ha saldo suficiente na conta.");
                    }  
                    else{
                        System.out.print("\nSua conta nao foi movimentada." +
					    "\nObrigado por utilizar o nosso Banco " + nome_titular);
						System.exit(0);
                    }  
                }
                else if(opcao == 2){
                    System.out.print("\nPor favor, informe o valor para deposito: ");
					double deposito = sc.nextDouble(); 
                    saldo += deposito;
                    System.out.print("\nDeposito realizado com sucesso." +
					"\nObrigado por utilizar o nosso Banco " + nome_titular);
					System.exit(0);
                }
                else if(opcao == 3){
                    System.out.println("O rendimento da sua conta atualmente esta de 15%, desejar investir mais ?" +
                    "\n1. Sim " +
                    "\n2. Não");
                    int investir = sc.nextInt();
                    if(investir == 1){
                        System.out.println("De quanto seria o investimento ?");
                        double deposito = sc.nextDouble(); 
                        saldo += deposito;
                        System.out.println("Seu investimento foi realizado com sucesso" +
                        "\nO seu saldo atual é : " + saldo + "\nObrigado por utilizar o nosso Banco " + nome_titular);
                    }
                    else{
                        System.out.println("Esperamos conseguir fazer você mudar de ideia um dia " +
                        "\nObrigado por utilizar o nosso Banco " + nome_titular);
					    System.exit(0);
                    }
                }
                else{
                    System.out.println("Obrigado por utilizar o nosso Banco " + nome_titular);
                    System.exit(0);
                }
            }
            else{
                System.out.print("Numero da conta invalida\n");
                    tentativas -= 1;
                        
                if (tentativas > 0){
                    System.out.print("\nVoce possui "+ tentativas +" tentativa(s)");
                } else {
                    System.out.print("\nSeu acesso foi bloqueado.");
                    sc.close();
                }

            }

        }
        
    }
}