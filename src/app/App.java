package app;

import entidades.Departamento;
import entidades.Funcionario;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Departamento dep = new Departamento(1, "Vendas");
        Funcionario fun = new Funcionario(12, "Matheus", 1000.0, LocalDate.MIN, "Email", dep);
        
        System.out.println(fun);
    }    
}
