package app;

import entidades.Departamento;
import java.util.List;
import java.util.Scanner;
import model.DAO.DAOFactory;
import model.DAO.DepartamentoDAO;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu.menuPrincipal();
        Integer respSetor = sc.nextInt();
        
        if(respSetor == 1){
            Menu.menuFuncionario();
            Integer respFun = sc.nextInt();
            Acoes.acoesFuncionario(respFun);
        } else if(respSetor == 2){
            Menu.menuDepartamento();
            Integer respDep = sc.nextInt();
            Acoes.acoesDepartamento(respDep);
        } else{
            System.out.println("Digitou errado!!!");
        }
    }
}
