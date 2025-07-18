public class CadastroPessoa{
//Atributos
private String nome;
private String dataNascimento;
private String email;
private String tipoPessoa;
private String rua;
private String bairro;
private String pais;
private String estado;
private int cep;
private int cepf;
private int matricula;
private int numeroCelular;

//Metodos
//GET
public String getnome(){
    return this.nome;
}

public String getDataNascimento(){
    return this.dataNascimento;
}

public void pessoaFazendo(){
   System.out.println("Estou na faculdade");
}

public void vaiFazer(){
 System.out.println("Estou indo para a faculdade");
}

public void comoFoi(){
System.out.printl("A aula foi muito boa");
}
}