package escalonadores_B;

public class Processo {
    private String nome;
    private int prioridade;
    private int tempoExecucao;

    public Processo(String nome, int prioridade, int tempoExecucao) {
        this.nome = nome;
        this.prioridade = prioridade;
        this.tempoExecucao = tempoExecucao;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    public void decrementaTempoExecucao() {
        tempoExecucao--;
    }

    public boolean isConcluido() {
        return tempoExecucao <= 0;
    }
}
