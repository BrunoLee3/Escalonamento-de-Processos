package escalonadores_B;

import java.util.*;

public class EscalonadorRoundRobin {
    private Queue<Processo> filaProcessos;
    private int quantum;

    public EscalonadorRoundRobin(int quantum) {
        filaProcessos = new LinkedList<>();
        this.quantum = quantum;
    }

    public void adicionarProcesso(Processo processo) {
        filaProcessos.add(processo);
    }

    public void executar() {
        while (!filaProcessos.isEmpty()) {
            Processo processo = filaProcessos.poll();
            System.out.println("Executando processo: " + processo.getNome());
            int tempoRestante = processo.getTempoExecucao() - quantum;
            if (tempoRestante > 0) {
                processo.decrementaTempoExecucao();
                filaProcessos.add(processo);
                System.out.println("escalonadores_B.Processo " + processo.getNome() + " interrompido.");
            } else {
                System.out.println("escalonadores_B.Processo " + processo.getNome() + " concluído.");
            }
        }
    }
}
