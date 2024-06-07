package app;

import java.sql.Connection;
import entidades.Funcionario;
import model.DAO.DAOFactory;
import model.DAO.FuncionarioDAO;

public class App {

    public static void main(String[] args) {
        FuncionarioDAO fDAO = DAOFactory.createFuncionarioDAO();
        Funcionario f = fDAO.findById(3);
        
        if(f == null){
            System.out.println("Não existe funcionario com o ID " + 7);
        } else
            System.out.println(f);
        DB.DB.closeConnection();
    }    
}
