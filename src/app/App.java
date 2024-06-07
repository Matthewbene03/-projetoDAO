package app;

import entidades.Departamento;
import java.sql.Connection;
import entidades.Funcionario;
import java.util.Date;
import java.util.List;
import model.DAO.DAOFactory;
import model.DAO.FuncionarioDAO;

public class App {

    public static void main(String[] args) {
        FuncionarioDAO fDAO = DAOFactory.createFuncionarioDAO();
        fDAO.deleteById(29);
        fDAO.deleteById(30);
        fDAO.deleteById(31);

    }
}
