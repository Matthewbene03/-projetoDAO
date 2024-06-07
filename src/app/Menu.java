package app;

public class Menu {

    public static void menuPrincipal() {
        System.out.println("Olá, seja bem vindo. Qual setor você quer mexer?");
        System.out.println("[1] Funcionarios");
        System.out.println("[2] Departamentos");
        System.out.print("Resposta: ");
//
//        System.out.println("[1] Inserir departamento.");
//        System.out.println("[2] Atualizar um departamento.");
//        System.out.println("[3] deletar um departamento.");
//        System.out.println("[4] Procurar por um ID.");
//        System.out.println("[5] Procurar todos os departamentos.");
    }

    public static void menuFuncionario() {
        System.out.println("O que deseja fazer? ");
        System.out.println("[1] Inserir funcionario.");
        System.out.println("[2] Atualizar um funcionario.");
        System.out.println("[3] deletar um funcionario.");
        System.out.println("[4] Procurar por um ID.");
        System.out.println("[5] Procurar por um departamento.");
        System.out.println("[6] Procurar todos os funcionarios.");
        System.out.print("Resposta: ");
    }

    public static void menuDepartamento() {
        System.out.println("[1] Inserir departamento.");
        System.out.println("[2] Atualizar um departamento.");
        System.out.println("[3] deletar um departamento.");
        System.out.println("[4] Procurar por um ID.");
        System.out.println("[5] Procurar todos os departamentos.");
        System.out.print("Resposta: ");
    }
}
