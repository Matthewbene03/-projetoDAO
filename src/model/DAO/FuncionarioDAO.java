package model.DAO;

import entidades.Funcionario;
import java.util.List;

public interface FuncionarioDAO {
    public void insert(Object funcionario);
    public void update(Object funcionario);
    public void deleteById(Integer id);
    public Funcionario findById(Integer id);
    public List<Funcionario> findAll();
}
