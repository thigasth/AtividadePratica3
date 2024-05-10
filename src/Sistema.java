import Classses.Desenvolvedor;
import Classses.Estagiario;
import Classses.Funcionario;
import Classses.Gerente;
import Classses.Folha;

public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nFUNCIONÁRIO SYSTEM");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Desenvolvedor");
        System.out.println("3) Cadastrar Estagiário");
        System.out.println("4) Procurar Funcionário");
        System.out.println("5) Listar Todos");
        System.out.println("6) Excluir Cadastro Específico");
        System.out.println("7) Excluir Todos os Cadastros");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");

    }

    private static void excluirCadastro() {
        System.out.println("\nExcluir Cadastro:");
        System.out.print("Matricula do cadastro a ser excluído: ");
        int matricula = Console.lerInt();

        boolean removido = Cadastro.remover(matricula);
        if (removido) {
            System.out.println("\nCadastro removido com sucesso!");
        } else {
            System.out.println("\nCadastro com Matricula " + matricula + " não encontrado.");
        }
    }

    private static void excluirTodosCadastro() {
        Cadastro.limparLista();
        System.out.println("\nTodos os registros foram excluídos.");
    }

    private static void verificarOpcao(int op) {

        int matricula;
        float horas;
        float Bonus;

        String dominio;
        String equipe;
        String supervisor;
        String nome;
        
        Folha f1 = new Folha(0, 0, 0);

        switch (op) {
            case 1:

                System.out.println("\nNovo Gerente:");

                System.out.print("\nMatricula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("equipe: ");
                equipe = Console.lerString();

                System.out.print("Bonus: ");
                Bonus = Console.lerFloat();

                System.out.print("Horas trabalhadas: ");
                f1.setHora(Console.lerFloat());

                System.out.print("valor por hora trabalhada: ");
                f1.setValorHora(Console.lerFloat());

                Gerente g = new Gerente(f1, nome, matricula, Bonus, equipe);

                Cadastro.cadastrar(g);

                System.out.println("\nGerente cadastrado com sucesso!");

                break;

            case 2:

                System.out.println("\nNovo Desenvolvedor:");

                System.out.print("\nMatricula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("dominio: ");
                dominio = Console.lerString();

                System.out.print("Horas trabalhadas: ");
                f1.setHora(Console.lerFloat());
                
                System.out.print("valor por hora trabalhada: ");
                f1.setValorHora(Console.lerFloat());
                
                Desenvolvedor d = new Desenvolvedor(f1, nome, matricula, dominio);

                Cadastro.cadastrar(d);

                System.out.println("\nDesenvolvedor cadastrado com sucesso!");

                break;

            case 3:

                System.out.println("\nNovo Estagiario:");

                System.out.print("\nMatricula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("supervisor: ");
                supervisor = Console.lerString();

                System.out.print("Horas: ");
                horas = Console.lerFloat();
                f1.setHora(horas);

                System.out.print("valor por hora trabalhada: ");
                f1.setValorHora(Console.lerFloat());
                
                Estagiario e = new Estagiario(f1, nome, matricula, horas, supervisor);

                Cadastro.cadastrar(e);

                System.out.println("\nEstagiário cadastrado com sucesso!");

                break;


            case 4:

                System.out.println("\nProcurar Funcionário:");

                System.out.print("\nMatricula: ");
                matricula = Console.lerInt();

                Funcionario f = Cadastro.buscar(matricula);

                if (f != null) {

                    System.out.println("\nFuncionário Localizado:");
                    System.out.println(f.toString());
                    return;
                }

                System.out.println("\nFuncionário " + matricula + " não foi encontrado.");

                break;

            case 5:

                System.out.println("\nTodos os funcionarios cadastrados:");

                if (Cadastro.getListaFuncionarios() == null || Cadastro.getListaFuncionarios().isEmpty()) {

                    System.out.println("\nNão há funcionarios cadastrados...");
                    return;

                }

                for (Funcionario temp : Cadastro.getListaFuncionarios()) {

                    System.out.println(temp.toString());

                }

                break;

            case 6:

                excluirCadastro();
                break;

            case 7:

                excluirTodosCadastro();
                break;

            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;

        }

    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
