import java.util.Scanner;

public class Aeroporto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Aeroporto");
        System.out.println("Bem vindo ao Aeroporto dos FORGET");

        do {
            System.out.println(" O que deseja fazer???");
            System.out.println("1 - Cadastrar Aeronave");
            System.out.println("2 - Cadastrar Pista");
            System.out.println("3 - Cadastrar Voo");
            System.out.println("4 - Cadastrar Companhia");
            System.out.println("5 - Cadastrar Hangar");
            System.out.println("6 - Listar Aeronave");
            System.out.println("7 - Listar Pista");
            System.out.println("8 - Listar Companhia");
            System.out.println("9 - Listar Hangar");
            System.out.println("10 - Remover Aviao");
            System.out.println("11 - Remover Jato");
            System.out.println("12 - Remover Helicoptero");
            System.out.println("13 - Remover Pista");
            System.out.println("14 - Remover Voo");
            System.out.println("15 - Remover Companhia");
            System.out.println("16 - Remover Hangar");
            System.out.println("17 - Sair");
            System.out.print("Opção: ");
            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                opcao = 0;
            }
            switch (opcao) {
                case 1:
                cadastrarAeronave(scanner);
                break;
                case 2:
                cadastrarPista(scanner);
                break;
                case 3:
                cadastrarVoo(scanner);
                break;
                case 4:
                cadastrarCompanhia(scanner);
                break;
                case 5:
                cadastrarHangar(scanner);
                break;
                case 6:
                listarAeronave();
                break;
                case 7:
                listarPista();
                break;
                case 8:
                listarCompanhia();
                break;
                case 9:
                listarHangar();
                break;
                case 10:
                removerAviao(scanner);
                break;
                case 11:
                removerJato(scanner);
                break;
                case 12:
                removerHelicoptero(scanner);
                break;
                case 13:
                removerPista(scanner);
                break;
                case 14:
                removerVoo(scanner);
                break;
                case 15:
                removerCompanhia(scanner);
                break;
                case 16:
                removerHangar(scanner);
                break;
                case 17:
                    sair();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 12);
    }

    public static void cadastrarAeronave(Scanner scanner){
        System.out.println("Cadastrar Aeronave");
        System.out.println("Digite a marca da Aeronave: ");
        String marca = scanner.next();
        System.out.println("Digite o modelo da Aeronave: ");
        String modelo = scanner.next();
        System.out.println("Digite o tipo: ([A] Avião; [J] Jato; [H] Helicoptero) ");
        String tipo = scanner.next().toUpperCase().trim().substring(0, 1);
        switch (tipo) {
            case "C":
                System.out.println("Informe o prefixo:");
                String prefixo = scanner.next();
                System.out.println("Informe a capacidade:");
                String capacidade = scanner.next();

    }



    public static void sair() {
        System.out.println("Saindo...");
        System.exit(0);
    }

}
