package model.DAO;

import entidades.Departamento;
import java.util.List;

public interface DepartamentoDAO {
    public void insert(Departamento departamento);
    public void update(Departamento departamento);
    public void deleteById(Integer id);
    public Departamento findById(Integer id);
    public List<Departamento> findAll();
}
