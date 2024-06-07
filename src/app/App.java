package app;

import entidades.Departamento;
import java.util.List;
import java.util.Scanner;
import model.DAO.DAOFactory;
import model.DAO.DepartamentoDAO;

public class App {

    public static void main(String[] args) {
        DepartamentoDAO dDAO = DAOFactory.createDepartamentoDAO();
        List<Departamento> listDep = dDAO.findAll();
        for (Departamento departamento : listDep) {
            System.out.println(departamento);
        }
    }
}
