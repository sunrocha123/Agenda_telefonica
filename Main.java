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
            System.out.print("\n=============\n");
            System.out.print("MENU\n");
            System.out.print("=============\n");
            System.out.print("1. Criar agenda\n2. Adicionar novo contato\n3. Excluir contato\n");
            System.out.print("4. Atualizar contato existente\n5. Exibir lista telefônica\n");
    
            while (true) {
                try {
                    System.out.print("Digite uma opção (1-5): ");
                    int opcao = input.nextInt();
                    if (opcao == 1) {
                        System.out.print("Digite o tamanho da agenda: ");
                        int tAgenda = input.nextInt();
                        a.setTelefones(tAgenda);
                        a.criarAgenda();
                        System.out.print("Agenda criada com sucesso!\n");
                        break;
                    }
                    else if (opcao == 2) {
                        System.out.print("Digite o novo número: ");
                        String novoNumero = input.next();
                        long formatoCorreto = Long.parseLong(novoNumero);
                        a.setNovoNumero(formatoCorreto);
                        if (a.adicionarTelefoneLista() == 1) {
                            System.out.print("Telefone cadastrado com sucesso na agenda!\n");
                            System.out.print("Telefone cadastrado: " + a.getNovoNumero() + "\n");
                        } else {
                            System.out.print("Não há espaço disponível na agenda para registrar o telefone\n");
                            System.out.print("Por gentileza, verificar...\n");
                        }
                        break;
                    }
                    else if (opcao == 3){
                        a.mostraAgenda();
                        System.out.print("\nDigite o número que será excluído com DDD: ");
                        String numeroExcluido = input.next();
                        long formatoCorreto = Long.parseLong(numeroExcluido);
                        a.setRemoverTelefone(formatoCorreto);
                        if (a.removerTelefoneLista() == 1) {
                            System.out.print("Telefone removido com sucesso da agenda!\n");
                            System.out.print("Telefone removido: " + a.getRemoverTelefone() + "\n");
                        } else{
                            System.out.print("Telefone não localizado na agenda!");
                        }
                        break;
                    }
                    else if (opcao == 4){
                        a.mostraAgenda();
                        System.out.print("\nDigite o número que será alterado com DDD: ");
                        String numeroAlterado = input.next();
                        long formatoCorretoAlterado = Long.parseLong(numeroAlterado);
                        System.out.print("Digite o número atualizado com DDD: ");
                        String numeroAtualizado = input.next();
                        long formatoCorretoAtualizado = Long.parseLong(numeroAtualizado);
                        a.setAtualizarTelefone(formatoCorretoAtualizado);
                        if (a.atualizarTelefoneLista(formatoCorretoAlterado) == 1){
                            System.out.print("Telefone atualizado com sucesso na agenda!\n");
                            System.out.print("Telefone desatualizado: " + formatoCorretoAlterado + "\n");
                            System.out.print("Telefone atualizado: " + a.getAtualizarTelefone() + "\n");
                        } else {
                            System.out.print("Telefone não localizado na agenda!");
                        }
                        break;
                    }
                    else if (opcao == 5){
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