public class Professor extends Pessoa{
    //Atributos
    private String formacaoAcademica;
    private String experienciaProfissional;
    private String areaAtuacao;

    //Métodos
    //GET
    public String getFormacaoAcademica(){
        return this.formacaoAcademica;
    }

    public String getExperienciaProfissional(){
        return this.experienciaProfissional;
    }

    public String  getAreaAtuacao(){
       return this.areaAtuacao;

    }

    //SET
    public void setFormacaoAcademica(String formacaoAcademica){
      this.formacaoAcademica=formacaoAcademica;
    }

    public void setExperienciaProfissional(String experienciaProfissional){
        this.experienciaProfissional=experienciaProfissional;
    }

    public void setAreaAtuacao(String areaAtuacao){
        this.areaAtuacao=areaAtuacao;

    }

    @Override
    public void pessoaFazendo(){
    System.out.println("Estou na faculdade, corrigindo as provas e montando as aulas pros proximos dias");
    }
    @Override
    public void vaiFazer(){
    System.out.println("Estou indo para a faculdade dar aula");
    }
    @Override
    public void comoFoi(){
    System.out.println("A aula que eu dei, foi muito boa");
    }

}