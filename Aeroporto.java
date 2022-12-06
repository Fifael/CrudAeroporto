import java.util.Scanner;

public class Aeroporto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Aeroporto");
        System.out.println("Bem vindo ao Aeroporto dos FORGET");

        do {
            System.out.println("||||||||||||||||||||||||||||||||");
            System.out.println("||   O que deseja fazer?      ||");
            System.out.println("||  1 - Cadastrar Aeronave    ||");
            System.out.println("||  2 - Cadastrar Pista       ||");
            System.out.println("||  3 - Cadastrar Voo         ||");
            System.out.println("||  4 - Cadastrar Companhia   ||");
            System.out.println("||  5 - Cadastrar Hangar      ||");
            System.out.println("||  6 - Listar Aeronave       ||");
            System.out.println("||  7 - Listar Pista          ||");
            System.out.println("||  8 - Listar Companhia      ||");
            System.out.println("||  9 - Listar Hangar         ||");
            System.out.println("||  10 - Remover Aviao        ||");
            System.out.println("||  11 - Remover Jato         ||");
            System.out.println("||  12 - Remover Helicoptero  ||");
            System.out.println("||  13 - Remover Pista        ||");
            System.out.println("||  14 - Remover Voo          ||");
            System.out.println("||  15 - Remover Companhia    ||");
            System.out.println("||  16 - Remover Hangar       ||");           
            System.out.println("||  17 - Sair                 ||");
            System.out.println("||||||||||||||||||||||||||||||||");
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
        } while (opcao != 17);
    }

    public static void cadastrarAeronave(Scanner scanner) {
        System.out.println("Cadastrar Aeronave");
        System.out.println("Digite a marca da Aeronave: ");
        String marca = scanner.next();
        System.out.println("Digite o modelo da Aeronave: ");
        String modelo = scanner.next();
        System.out.println("Digite o tipo: ([A] Avião; [J] Jato; [H] Helicoptero) ");
        String tipo = scanner.next().toUpperCase().trim().substring(0, 1);
        switch (tipo) {
            case "A":
                System.out.println("Informe o prefixo:");
                String prefixo = scanner.next();
                System.out.println("Informe a capacidade:");
                int capacidade = scanner.nextInt();
                System.out.println("Digite o id da Companhia Para cadastrar um aviao la: ");
                int idCampanhia = scanner.nextInt();
                Campanhia campanhia;
                try {
                    campanhia = Campanhia.getCampanhia(idCampanhia);
                    Aviao aviao = new Aviao(marca, modelo, prefixo, capacidade, campanhia);
                    System.out.println("\nAviao cadastrado com sucesso!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

            case "J":
                System.out.println("Informe a cor do Jato:");
                String cor = scanner.next();
                System.out.println("Informe a velocidade do Jato:");
                int velocidade = scanner.nextInt();
                Jato jato = new Jato(marca, modelo, cor, velocidade);
                System.out.println("\nJato cadastrado com sucesso!");
                break;

            case "H":
                System.out.println("Informe a cor:");
                String corH = scanner.next();
                System.out.println("Informe a capacidade:");
                int capacidadeH = scanner.nextInt();
                Helicoptero helicoptero = new Helicoptero(marca, modelo, corH, capacidadeH);
                System.out.println("\nHelicoptero cadastrado com sucesso!");
                break;
        }
    }

    public static void cadastrarPista(Scanner scanner){
        try {
        System.out.println("Cadastrar Pista");
        System.out.println("Digite a numero da Pista: ");
        String numero = scanner.next();
        Pista pista = new Pista(numero);
        System.out.println("Pista cadastrada com sucesso!");
        System.out.println(pista);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }

    public static void cadastrarVoo(Scanner scanner){
        
    }

    public static void cadastrarCompanhia(Scanner scanner){
        try {
        System.out.println("Cadastrar Companhia\n");
        System.out.println("Digite o nome da Companhia: ");
        String nome = scanner.next();
        System.out.println("Digite o cnpj da Companhia: ");
        String cnpj = scanner.next();
        Campanhia campanhia = new Campanhia(nome, cnpj);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    }

    public static void cadastrarHangar(Scanner scanner){

    }

    public static void listarAeronave() {

        System.out.println("Listar Aviao");
        for (Aviao aviao : Aviao.getAviaos()) {
            System.out.println(aviao);
        }

        System.out.println("Listar Moto");
        for (Jato jato : Jato.getJatos()) {
            System.out.println(jato);
        }
        System.out.println("Listar Bicicleta");
        for (Helicoptero helicoptero : Helicoptero.getHelicopteros()) {
            System.out.println(helicoptero);
        }
    }

    public static void listarPista() {

        try {
            System.out.println("Listar Pista");
            for (Pista pista : Pista.getPistas()) {
                System.out.println(pista);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar pista. " + e.getMessage());
        }

    }

    public static void listarCompanhia() {

        try {
            System.out.println("Listar Campanhia");
            for (Campanhia campanhia : Campanhia.getCampanhias()) {
                System.out.println(campanhia);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar companhia. " + e.getMessage());
        }

    }

    public static void listarHangar() {

        try {
            System.out.println("Listar Hangar");
            for (Hangar hangar : Hangar.getHangares()) {
                System.out.println(hangar);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar Hangar. " + e.getMessage());
        }

    }

    public static void removerAviao(Scanner scanner) {
        try {
            System.out.println("Digite o id: ");
            int id = scanner.nextInt();
            Aviao.removeAviao(id);
        } catch (Exception e) {
            System.out.println("Erro ao excluir Aeronave. " + e.getMessage());
        }
    }

    public static void removerJato(Scanner scanner) {
        try {
            System.out.println("Digite o id: ");
            int id = scanner.nextInt();
            Jato.removeJato(id);
        } catch (Exception e) {
            System.out.println("Erro ao excluir Aeronave. " + e.getMessage());
        }
    }

    public static void removerHelicoptero(Scanner scanner) {
        try {
            System.out.println("Digite o id: ");
            int id = scanner.nextInt();
            Helicoptero.excluirHeli(id);
        } catch (Exception e) {
            System.out.println("Erro ao excluir Aeronave. " + e.getMessage());
        }
    }    

    public static void removerPista(Scanner scanner) {
        try {
            System.out.println("Digite o id: ");
            int id = scanner.nextInt();
            Pista.removePista(id);
        } catch (Exception e) {
            System.out.println("Erro ao excluir Pista. " + e.getMessage());
        }
    }

    public static void removerVoo(Scanner scanner) {
        try {
            System.out.println("Digite o id: ");
            int id = scanner.nextInt();
            Voo.removeVoo(id);
        } catch (Exception e) {
            System.out.println("Erro ao excluir Voo " + e.getMessage());
        }
    }

    public static void removerCompanhia(Scanner scanner) {
        try {
            System.out.println("Digite o id: ");
            int id = scanner.nextInt();
            Campanhia.removeCampanhia(id);
        } catch (Exception e) {
            System.out.println("Erro ao excluir Companhia. " + e.getMessage());
        }
    }

    public static void removerHangar(Scanner scanner) {
        try {
            System.out.println("Digite o id: ");
            int id = scanner.nextInt();
            Hangar.removeHangar(id);
        } catch (Exception e) {
            System.out.println("Erro ao excluir Hangar. " + e.getMessage());
        }
    }

    public static void sair() {
        System.out.println("Saindo...");
        System.exit(0);
    }

}
