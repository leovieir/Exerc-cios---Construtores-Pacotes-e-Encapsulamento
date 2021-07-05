import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Turma{
  private String nome;
  private String turno;
  private String horario;
  private Disciplina disciplina;
  private List<Professor> professores = new ArrayList<Professor>();
  private List<Aluno> alunos = new ArrayList<Aluno>();

  public Turma(String nome, String turno, String horario, Disciplina disciplina){
    this.nome = nome;
    this.turno = turno;
    this.horario = horario;
    this.disciplina = disciplina;
  }

  public void adicionarAluno(Aluno aluno){

  }

  public void removerAluno(Aluno aluno){

  }

  public void adicionarProfessor(Professor professor){

  }

  public void removerProfessor(Professor professor){

  }

  public float calcularMediaDeAluno(Aluno aluno){

    return media;
  }

  public String obterHorarioDasAulas(){
    return horarios;
  }

  
}