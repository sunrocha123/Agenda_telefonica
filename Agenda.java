import java.util.Scanner;

public class Agenda {
    private long telefones[];
    private long removerTelefone;
    private long atualizarTelefone;

    public Agenda(){};

    public Agenda(long rt, long at){
        this.atualizarTelefone = at;
        this.removerTelefone = rt;
    }

    public void setRemoverTelefone(long rt){
        this.removerTelefone = rt;
    }

    public void setAtualizarTelefone(long at){
        this.atualizarTelefone = at;
    }

    public long getRemoverTelefone(){
        return this.removerTelefone;
    }

    public long getAtualizarTelefone(){
        return this.atualizarTelefone;
    }

    public void adicionarTelefoneLista(int n){
        Scanner input = new Scanner(System.in);

        telefones = new long[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite o " + (i + 1) + "º número com DDD: ");
            String numero = input.next();
            long formatoCorreto = Long.parseLong(numero);
            telefones[i] = formatoCorreto;
        }
    }

    public int removerTelefoneLista(){
        for(int i = 0; i <= telefones.length; i++){
            if (telefones[i] == this.removerTelefone) {
                telefones[i] = 0;
                System.out.print("Removido!");
                return 1;
            }
        }
        return 0;
    } 

    public int atualizarTelefoneLista(long numeroAlteracao){
        for(int i = 0; i < telefones.length; i++){
            if (telefones[i] == numeroAlteracao) {
                telefones[i] = this.atualizarTelefone;
                return 1;
            }
        }
        return 0;
    }

    public void mostraAgenda(){
        long agendaOrdenada[] = ordenarAgenda();
        System.out.print("\n=========================\nLista Telefônica\n=========================\n");
        for(int i = 0; i < agendaOrdenada.length; i++){
            if (agendaOrdenada[i] != 0) {
                System.out.print(agendaOrdenada[i] + "\n");
            }
        }
    }

    public long [] ordenarAgenda(){
        long agenda[] = telefones;
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
