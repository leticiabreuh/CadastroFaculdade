public class Aluno extends Pessoa{
    //Atributo
    private String dataIngresso;
    private String curso;
    private String nivelEscolar;
    private String numeroMatricula;
    private String status;
    private String turno;
    private String pagamentoCurso;

    //Métodos
    //GET
    public String getDataIngresso(){
        return dataIngresso;
    }
    public String getCurso(){
        return curso;
    }
    public String getNivelEscolar(){
        return nivelEscolar;
    }
    public String getNumeroMatricula(){
        return numeroMatricula;
    }
    public String getStatus(){
        return status;
    }
    public String getTurno(){
        return turno;
    }
    public String getPagamentoCurso(){
        return pagamentoCurso;
    }
    
    //SET
    public void setDataIngresso(String dataNascimento){
        this.dataIngresso=dataIngresso;
    }
    public void setCurso(String curso){
         this.curso=curso;
    }
    public void setNivelEscolar(String nivelEscolar){
       this.nivelEscolar=nivelEscolar;
    }
    public void setNumeroMatricula(String numeroMatricula){
        this.numeroMatricula=numeroMatricula;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public void setTurno(String turno){
        this.turno=turno;
    }
    public void setPagamentoCurso(String pagamentoCurso){
        this.pagamentoCurso=pagamentoCurso;
    }

    @Override
    public void pessoaFazendo(){
    System.out.println("Estou na aula da faculdade");
    }
    @Override
    public void vaiFazer(){
    System.out.println("Estou indo para a faculdade estudar");
    }
    @Override
    public void comoFoi(){
    System.out.println("A aula que o professor deu, foi muito boa");
    }
 }
 