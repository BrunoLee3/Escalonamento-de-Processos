package escalonadores_B;

public class Main {
    public static void main(String[] args) {
        // Simulação do escalonamento de prioridade
        System.out.println("Escalonamento de prioridade:");
        EscalonadorPrioridade escalonadorPrioridade = new EscalonadorPrioridade();
        escalonadorPrioridade.adicionarProcesso(new Processo("P1", 3, 5));
        escalonadorPrioridade.adicionarProcesso(new Processo("P2", 1, 3));
        escalonadorPrioridade.adicionarProcesso(new Processo("P3", 2, 4));
        escalonadorPrioridade.executar();

        // Simulação do escalonamento round robin
        System.out.println("\nEscalonamento Round Robin:");
        EscalonadorRoundRobin escalonadorRoundRobin = new EscalonadorRoundRobin(2);
        escalonadorRoundRobin.adicionarProcesso(new Processo("P1", 0, 5));
        escalonadorRoundRobin.adicionarProcesso(new Processo("P2", 0, 3));
        escalonadorRoundRobin.adicionarProcesso(new Processo("P3", 0, 4));
        escalonadorRoundRobin.executar();
    }
}
