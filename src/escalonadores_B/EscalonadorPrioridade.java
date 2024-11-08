package escalonadores_B;

import java.util.*;

public class EscalonadorPrioridade {
    private PriorityQueue<Processo> filaPrioridade;

    public EscalonadorPrioridade() {
        filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(Processo::getPrioridade).reversed());
    }

    public void adicionarProcesso(Processo processo) {
        filaPrioridade.add(processo);
    }

    public void executar() {
        while (!filaPrioridade.isEmpty()) {
            Processo processo = filaPrioridade.poll();
            System.out.println("Executando processo: " + processo.getNome());
            processo.decrementaTempoExecucao();
            if (!processo.isConcluido()) {
                filaPrioridade.add(processo);
            } else {
                System.out.println("escalonadores_B.Processo " + processo.getNome() + " concluído.");
            }
        }
    }
}
