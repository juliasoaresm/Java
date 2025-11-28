package correcao;

import java.util.*;

public class SistemaNotas {

    public static void main(String[] args) {

        Sigaa sistema = new Sigaa();

        sistema.cadastrarAluno(new Aluno("2027010", "Ana Clara"));
        sistema.cadastrarAluno(new Aluno("2027011", "Lucas Lima"));

        sistema.cadastrarDisciplina(new Disciplina("IF400", "Inteligência Artificial", 4));
        sistema.cadastrarDisciplina(new Disciplina("MA220", "Estatística", 3));
        sistema.cadastrarDisciplina(new Disciplina("CS101", "Fundamentos de Computação", 2));

        sistema.matricularAluno("2027010", "IF400");
        sistema.matricularAluno("2027010", "MA220");
        sistema.matricularAluno("2027010", "CS101");

        sistema.lancarNota("2027010", "IF400", 9.0);
        sistema.lancarNota("2027010", "MA220", 7.5);
        sistema.lancarNota("2027010", "CS101", 8.0);

        sistema.exibirHistorico("2027010");
    }
}

// ================================================================

class Sigaa {

    private Map<String, Aluno> alunos = new HashMap<>();
    private Map<String, Disciplina> disciplinas = new HashMap<>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
    }

    public void cadastrarDisciplina(Disciplina d) {
        disciplinas.put(d.getCodigo(), d);
    }

    public void matricularAluno(String matricula, String codDisc) {
        Aluno aluno = alunos.get(matricula);
        Disciplina d = disciplinas.get(codDisc);

        if (aluno != null && d != null) {
            aluno.matricular(d);
        }
    }

    public void lancarNota(String matricula, String codDisc, double nota) {
        Aluno aluno = alunos.get(matricula);
        if (aluno != null) {
            aluno.receberNota(codDisc, nota);
        }
    }

    public void exibirHistorico(String matricula) {

        Aluno aluno = alunos.get(matricula);
        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.println("\n===== HISTÓRICO SIGAA – " + aluno.getNome() + " =====");

        List<Disciplina> list = aluno.getDisciplinas();

        if (list.isEmpty()) {
            System.out.println("Nenhuma disciplina matriculada.");
            return;
        }

        double somaNotas = 0;
        int totalCreditos = 0;

        for (Disciplina d : list) {

            Double nota = aluno.getNotas().get(d.getCodigo());

            System.out.println(
                d.getCodigo() + " - " + d.getNome() +
                " (" + d.getCreditos() + " cr) | Nota: " +
                (nota == null ? "N/A" : nota)
            );

            somaNotas += nota * d.getCreditos();
            totalCreditos += d.getCreditos();
        }

        double ira = somaNotas / totalCreditos;

        System.out.println("\nIRA Parcial: " + ira);
    }
}

// ================================================================

class Aluno {

    private String matricula;
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();
    private Map<String, Double> notas = new HashMap<>();

    public Aluno(String m, String n) {
        this.matricula = m;
        this.nome = n;
    }

    public void matricular(Disciplina d) {
        disciplinas.add(d);
    }

    public void receberNota(String codigo, double nota) {
        notas.put(codigo, nota);
    }

    public String getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public List<Disciplina> getDisciplinas() { return disciplinas; }
    public Map<String, Double> getNotas() { return notas; }
}

// ================================================================

class Disciplina {

    private String codigo;
    private String nome;
    private int creditos;

    public Disciplina(String c, String n, int cr) {
        this.codigo = c;
        this.nome = n;
        this.creditos = cr;
    }

    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public int getCreditos() { return creditos; }
}
