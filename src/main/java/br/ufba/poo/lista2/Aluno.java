import java.util.Objects;
public class Aluno {
    private final String matricula;
    private String nome;
    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;  
    }
    public String getMatricula() {
        return matricula;
    }
   @Override  
    public boolean equals(Object outroAluno) {
        if (this == outroAluno)
            return true;
        if (outroAluno == null || getClass() != outroAluno.getClass())
            return false;
        Aluno aluno = (Aluno) outroAluno;
        return Obejects.equals(this.matricula, aluno.matricula);
    }
}
