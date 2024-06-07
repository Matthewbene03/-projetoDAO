package app;

import entidades.Departamento;
import entidades.Funcionario;
import model.DAO.DAOFactory;
import model.DAO.DepartamentoDAO;
import model.DAO.FuncionarioDAO;

public class Acoes {

    public static void acoesFuncionario(Integer respFun) {
        FuncionarioDAO fDAO = DAOFactory.createFuncionarioDAO();
        switch (respFun) {
            case 1:
                fDAO.insert(new Funcionario());
                break;
            case 2:
                fDAO.update(new Funcionario());
                break;
            case 3:
                fDAO.deleteById(Integer.MAX_VALUE);
                break;
            case 4:
                fDAO.findById(Integer.MIN_VALUE);
                break;
            case 5: 
                fDAO.findByDepartamento(new Departamento());
                break;
            case 6:
                fDAO.findAll();
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void acoesDepartamento(Integer respDep) {
        DepartamentoDAO dDAO = DAOFactory.createDepartamentoDAO();
        switch (respDep) {
            case 1:
                dDAO.insert(new Departamento());
                break;
            case 2:
                dDAO.update(new Departamento());
                break;
            case 3:
                dDAO.deleteById(Integer.MAX_VALUE);
                break;
            case 4:
                dDAO.findById(Integer.MIN_VALUE);
                break;
            case 5: 
                dDAO.findAll();
                break;
            default:
                throw new AssertionError();
        }
    }
}
