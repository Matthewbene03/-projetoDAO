package entidades;

import java.util.List;

public interface DepartamentoDAO {
    public void insert(Object departamento);
    public void update(Object departamento);
    public void deleteById(Integer id);
    public Departamento findById(Integer id);
    public List<Departamento> findAll();
}
