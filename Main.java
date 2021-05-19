import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Agenda a = new Agenda();

        System.out.print("================================\n");
        System.out.print("CONTROLE DE AGENDA TELEFÔNICA\n");
        System.out.print("================================\n");
        System.out.print("\nPonto de atenção!\nDigite os números no padrão DDD + número (sem traço e ponto)\n");

        while (true) {
            System.out.print("\nMENU\n1. Adicionar novo contato\n2. Excluir contato\n");
            System.out.print("3. Atualizar contato existente\n4. Exibir lista telefônica\n");
    
            while (true) {
                try {
                    System.out.print("Digite uma opção (1-4): ");
                    int opcao = input.nextInt();
                    if (opcao == 1) {
                        System.out.print("Digite a quantidade de números que serão cadastrados: ");
                        int qtNumeros = input.nextInt();
                        a.adicionarTelefoneLista(qtNumeros);
                        System.out.print("Telefone(s) cadastrado(s) com sucesso na agenda!\n");
                        break;
                    }
                    else if (opcao == 2){
                        System.out.print("Digite o número com DDD: ");
                        String numeroExcluido = input.next();
                        long formatoCorreto = Long.parseLong(numeroExcluido);
                        a.setRemoverTelefone(formatoCorreto);
                        if (a.removerTelefoneLista() == 1) {
                            System.out.print("Telefone removido com sucesso da agenda!\n");
                            System.out.print("Telefone removido: " + a.getRemoverTelefone());
                        } else{
                            System.out.print("Telefone não localizado na agenda!");
                        }
                        break;
                    }
                    else if (opcao == 3){
                        System.out.print("Digite o número que será alterado com DDD: ");
                        String numeroAlterado = input.next();
                        long formatoCorretoAlterado = Long.parseLong(numeroAlterado);
                        System.out.print("Digite o número atualizado com DDD: ");
                        String numeroAtualizado = input.next();
                        long formatoCorretoAtualizado = Long.parseLong(numeroAtualizado);
                        a.setAtualizarTelefone(formatoCorretoAtualizado);
                        if (a.atualizarTelefoneLista(formatoCorretoAlterado) == 1){
                            System.out.print("Telefone atualizado com sucesso na agenda!\n");
                            System.out.print("Telefone desatualizado: " + formatoCorretoAlterado + "\n");
                            System.out.print("Telefone atualizado: " + a.getAtualizarTelefone());
                        } else {
                            System.out.print("Telefone não localizado na agenda!");
                        }
                        break;
                    }
                    else if (opcao == 4){
                        a.mostraAgenda();
                        break;
                    } else{
                        System.out.print("Opção inválida! Digite novamente...\n");
                    }
                } catch (Exception e) {
                    System.out.print("Opção inválida! Digite novamente...\n");
                }
            }
            System.out.print("\nDigite 1 para novas operações ou 2 para sair do programa\n");
            int opcao;
            while (true){
                try {
                    System.out.print("Opção: ");
                    opcao = input.nextInt();
                    if (opcao == 1 || opcao == 2) {
                        break;
                    } else {
                        System.out.print("Opção inválida! Digite novamente...\n");
                    }
                } catch (Exception e) {
                    System.out.print("Opção inválida! Digite novamente...\n");
                }
            }
            if (opcao == 2) {
                System.out.print("Obrigado por usar nosso programa!");
                break;
            }
        }
    }
}