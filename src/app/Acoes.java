package app;

import entidades.Departamento;
import entidades.Funcionario;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.DAO.DAOFactory;
import model.DAO.DepartamentoDAO;
import model.DAO.FuncionarioDAO;

public class Acoes {

    private static Scanner sc = new Scanner(System.in);
    private static FuncionarioDAO fDAO = DAOFactory.createFuncionarioDAO();
    private static DepartamentoDAO dDAO = DAOFactory.createDepartamentoDAO();

    public static void acoesFuncionario(Integer respFun) throws ParseException {
        switch (respFun) {
            case 1:
                fDAO.insert(inicializarFuncionario());
                break;
            case 2:
                fDAO.update(atualizarFuncionario());
                break;
            case 3:
                System.out.print("Informe o ID: ");
                fDAO.deleteById(sc.nextInt());
                break;
            case 4:
                System.out.print("Informe o ID: ");
                System.out.println(fDAO.findById(sc.nextInt()));
                break;
            case 5:
                List<Funcionario> listFunTem = fDAO.findByDepartamento(inicializarDepartamento());
                for (Funcionario f : listFunTem) {
                    System.out.println(f);
                }
                break;
            case 6:
                listFunTem = fDAO.findAll();
                
                for (Funcionario f : listFunTem) {
                    System.out.println(f);
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void acoesDepartamento(Integer respDep) {
        switch (respDep) {
            case 1:
                dDAO.insert(inicializarDepartamento());
                break;
            case 2:
                dDAO.update(atualizarDepartamento());
                break;
            case 3:
                System.out.print("Informe o ID: ");
                dDAO.deleteById(sc.nextInt());
                break;
            case 4:
                System.out.print("Informe o ID: ");
                System.out.println(dDAO.findById(sc.nextInt()));
                
                break;
            case 5:
                List<Departamento> listDepTem = dDAO.findAll();
                for (Departamento departamento : listDepTem) {
                    System.out.println(departamento);
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    private static Funcionario inicializarFuncionario() throws ParseException {
        System.out.println("Informe os dados do funcionario: ");
        System.out.print("Nome: ");
        String nomeF = sc.nextLine();
        System.out.print("Email: ");
        String emailF = sc.nextLine();
        System.out.print("Salario: ");
        Double salarioF = sc.nextDouble();
        sc.nextLine();
//        System.out.print("Data de nascimento (dd/mm/yyyy): ");
//        String dataText = sc.nextLine();
//        Calendar c = Calendar.getInstance();
//        Date data = c.getTime();
//        DateFormat f = DateFormat.getDateInstance();
//        data = f.parse(dataText);
        System.out.print("Id do departamento: ");
        Integer idDep = sc.nextInt();
        Departamento dep = dDAO.findById(idDep);
        return new Funcionario(null, nomeF, salarioF, new Date(), emailF, dep);
    }
    
    private static Funcionario atualizarFuncionario(){
        System.out.print("Informe o ID do funcionario que será atualizado: ");
        Integer idFun = sc.nextInt();
        sc.nextLine();
        Funcionario f = fDAO.findById(idFun);
        
        System.out.println("Informe os dados do funcionario: ");
        System.out.print("Nome: ");
        f.setNomeFuncionario(sc.nextLine());
        System.out.print("Email: ");
        f.setEmail(sc.nextLine());
        System.out.print("Salario: ");
        f.setSalarioBase(sc.nextDouble());
        sc.nextLine();
//        System.out.print("Data de nascimento (dd/mm/yyyy): ");
//        String dataText = sc.nextLine();
//        Calendar c = Calendar.getInstance();
//        Date data = c.getTime();
//        DateFormat f = DateFormat.getDateInstance();
//        data = f.parse(dataText);
        System.out.print("Id do departamento: ");
        Integer idDep = sc.nextInt();
        Departamento dep = dDAO.findById(idDep);
        f.setDepartamento(dep);
        return f;
    }
    
    private static Departamento inicializarDepartamento() {
        System.out.println("Informe os dados do departamento: ");
        System.out.print("Nome do departamento: ");
        String nomeDep = sc.nextLine();
        return new Departamento(null, nomeDep);
    }
    
    private static Departamento atualizarDepartamento(){
        System.out.print("Informe o ID do departamento que será atualizado: ");
        Integer idDep = sc.nextInt();
        sc.nextLine();
        Departamento d = dDAO.findById(idDep);
        
        System.out.println("Informe os dados do departamento: ");
        System.out.print("Nome do departamento: ");
        d.setNomeDepartamento(sc.nextLine());
        return d;
    }
}
