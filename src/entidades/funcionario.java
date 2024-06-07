package entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Funcionario implements Serializable{
    private Integer idFuncionario;
    private String nomeFuncionario;
    private Double salarioBase;
    private LocalDate dataNascimento;
    private String email;
    
    private Departamento departamento;

    public Funcionario() {}

    public Funcionario(Integer idFuncionario, String nomeFuncionario, Double salarioBase, LocalDate dataNascimento, String email, Departamento departamento) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioBase = salarioBase;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idFuncionario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        return Objects.equals(this.idFuncionario, other.idFuncionario);
    }

    @Override
    public String toString() {
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", nomeFuncionario=" + nomeFuncionario + ", salarioBase=" + salarioBase + ", dataNascimento=" + dataNascimento + ", email=" + email + ", departamento=" + departamento + '}';
    }
    
}
