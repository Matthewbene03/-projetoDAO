package app;

import entidades.Departamento;
import java.sql.Connection;
import entidades.Funcionario;
import java.util.List;
import model.DAO.DAOFactory;
import model.DAO.FuncionarioDAO;

public class App {

    public static void main(String[] args) {
        FuncionarioDAO fDAO = DAOFactory.createFuncionarioDAO();
        List<Funcionario> listF = fDAO.findAll();
        for (Funcionario funcionario : listF) {
            System.out.println(funcionario);
        }
    }    
}
