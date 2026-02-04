package entities;

public class Aluno {
    private String nome;
    private String email;
    private String status;
    private String dataNascimento;
    private Materia [] materiasMatriculadas;
    private int quantMaterias;

    //construtor
    public Aluno(String nome, String email, String status, String dataNascimento){
        this.nome = nome;
        this.email = email;
        this.status = status;
        this.dataNascimento = dataNascimento;
        this.materiasMatriculadas = new Materia[4];
        this.quantMaterias = 0;
    }
    //getters
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getStatus() { return status; }
    public String getDataNascimento() { return dataNascimento; }
    public int getMatriculas() {
        return quantMaterias;
    }

    public void matricularMateria(Materia materia){
        if(quantMaterias < materiasMatriculadas.length){
            materiasMatriculadas[quantMaterias] = materia;
            quantMaterias++;
        } else{
            System.out.println("Não é possível mais matrículas. ");
        }
    }
    public boolean verifMinimo(){
        return quantMaterias >=2;
    }

    //setters
        public void setNome(String nome){
            this.nome = nome;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public void setStatus(String status){
        this.status = status;
    }
    public void mostrarInformacao(){
        System.out.println("Nome: " + nome);
        System.out.println("Status: " + status);
        System.out.println("Matérias matriculadas: ");
        for(int i = 0 ; i < quantMaterias ; i++){
            System.out.print("- Matéria: " + materiasMatriculadas[i].getTitulo());
            System.out.print(" - Código: " + materiasMatriculadas[i].getCodigo());
            System.out.print(" - Professor(a): " + materiasMatriculadas[i].getProfessor());
            System.out.print(" - Horário: " + materiasMatriculadas[i].getHorario());
            System.out.print(" - Carga: " + materiasMatriculadas[i].getCargaHoraria() + " hora(s)");
            System.out.println();
        }
        if (!verifMinimo()) {
            System.out.println("Atenção: Aluno deve estar matriculado no mínimo em duas matérias.");
        }
    }
}
