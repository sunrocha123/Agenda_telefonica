public class Agenda {
    private long telefones[];
    private long novoNumero;
    private long removerTelefone;
    private long atualizarTelefone;

    public Agenda(){};

    public void setRemoverTelefone(long rt){
        this.removerTelefone = rt;
    }

    public void setAtualizarTelefone(long at){
        this.atualizarTelefone = at;
    }

    public void setTelefones(int n){
        this.telefones = new long[n];
    }

    public void setNovoNumero(long nn){
        this.novoNumero = nn;
    }

    public long getNovoNumero(){
        return this.novoNumero;
    }

    public long[] getTelefones(){
        return this.telefones;
    }

    public long getRemoverTelefone(){
        return this.removerTelefone;
    }

    public long getAtualizarTelefone(){
        return this.atualizarTelefone;
    }

    public void criarAgenda(){
        for(int i = 0; i < this.telefones.length; i++){
            this.telefones[i] = 0;
        }
    }

    public int adicionarTelefoneLista(){
        for(int i = 0; i < this.telefones.length; i++){
            if (this.telefones[i] == 0) {
                this.telefones[i] = this.novoNumero;
                return 1;
            }
        }
        return 0;
    }

    public int removerTelefoneLista(){
        for(int i = 0; i < this.telefones.length; i++){
            if (this.telefones[i] == this.removerTelefone) {
                this.telefones[i] = 0;
                return 1;
            }
        }
        return 0;
    } 

    public int atualizarTelefoneLista(long numeroAlteracao){
        for(int i = 0; i < this.telefones.length; i++){
            if (this.telefones[i] == numeroAlteracao) {
                this.telefones[i] = this.atualizarTelefone;
                return 1;
            }
        }
        return 0;
    }

    public void mostraAgenda(){
        long agendaOrdenada[] = ordenarAgenda();
        int contador = 0;
        System.out.print("\n=========================\nLista Telefônica\n=========================\n");
        for(int i = 0; i < agendaOrdenada.length; i++){
            if (agendaOrdenada[i] != 0) {
                System.out.print((contador + 1) + ". " + agendaOrdenada[i] + "\n");
                contador += 1;
            }
        }
        System.out.print("Total de contatos: " + contador + "\n");
    }

    public long [] ordenarAgenda(){
        long agenda[] = this.telefones;
        int j;
        long key;
        int i;

        for (j = 0; j < agenda.length; j++){
            key = agenda[j];
            for (i = j - 1; (i >= 0) && (agenda[i] > key); i--){
                agenda[i + 1] = agenda[i];
            }
            agenda[i + 1] = key;
        }
        return agenda;
    }
}
