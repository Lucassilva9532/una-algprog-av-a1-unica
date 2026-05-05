import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nome do profissional: ");
        String nome = scanner.nextLine();

        System.out.print("Cargo (Cientista, Engenheiro, Zelador, Administrativo): ");
        String cargo = scanner.nextLine();

        System.out.print("Nível de acesso (1 a 10): ");
        int nivelAcesso = scanner.nextInt();

        System.out.print("Nível de sigilo da área (1 a 10): ");
        int nivelSigilo = scanner.nextInt();

        System.out.println("\n--- RELATÓRIO DE ACESSO ---");

        
        if (nivelAcesso < 1 || nivelAcesso > 10) {
            System.out.println("Erro: Nível de acesso inválido.");
        } else {
            
            System.out.println("Profissional: " + nome);
            System.out.println("Cargo: " + cargo);

            
            boolean permitido = nivelAcesso >= nivelSigilo;

            if (permitido) {
                System.out.println("Resultado: ACESSO PERMITIDO");
                
                System.out.println("Nível de autoridade: " + (nivelAcesso - nivelSigilo));
            } else {
                System.out.println("Resultado: ACESSO NEGADO");
            }

            
            if (nivelAcesso < 3 && nivelSigilo > 7) {
                System.out.println("ALERTA: Tentativa de acesso indevida detectada!");
            }
        }

        scanner.close();
    }
}

