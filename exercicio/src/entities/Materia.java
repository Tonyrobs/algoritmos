package entities;

public class Materia {
	private String titulo;
	private String professor;
	private String codigo;
	private boolean optativa;
	private int horario;
	private int cargaHoraria;

	//construtor
	public Materia(String titulo, String professor, String codigo, boolean optativa, int horario, int cargaHoraria) {
		this.titulo = titulo;
		this.professor = professor;
		this.codigo = codigo;
		this.optativa = optativa;
		this.horario = horario;
		this.cargaHoraria = cargaHoraria;
	}
	//getters
	public String getTitulo() {
		return titulo;
	}
	public String getProfessor() {
		return professor;
	}
	public String getCodigo() {
		return codigo;
	}
	public boolean getOptativa() {
		return optativa;
	}
	public int getHorario() {
		return horario;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	//Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setProfessor(String professor){
        this.professor = professor;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setOptativa(boolean optativa){
        this.optativa = optativa;
    }
    public void setHorario(int horario){
        this.horario = horario;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
	
}
