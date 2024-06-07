package model.DAO;

public class DAOFactory {

    public static FuncionarioDAO createFuncionarioDAO() {
        return new FuncionarioDAOJDBC();
    }

    public static DepartamentoDAO createDepartamentoDAO() {
        return new DepartamentoDAOJDBC();
    }
}
