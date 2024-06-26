package model.DAO;

import entidades.Departamento;
import entidades.Funcionario;
import java.util.List;

public interface FuncionarioDAO {
    public void insert(Funcionario funcionario);
    public void update(Funcionario funcionario);
    public void deleteById(Integer id);
    public Funcionario findById(Integer id);
    public List<Funcionario> findAll();
    public List<Funcionario> findByDepartamento(Departamento departamento);
}
