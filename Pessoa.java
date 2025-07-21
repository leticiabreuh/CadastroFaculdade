public class Pessoa{
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
private int cpf;
private String numeroCelular;

//Metodos
//GET
public String getNome(){
    return this.nome;
}
public String getDataNascimento(){
    return this.dataNascimento;
}
public String getEmail(){
    return this.email;
}
public String getTipoPessoa(){
    return this.tipoPessoa;
}

public String getRua(){
    return this.rua;
}
public String getBairro(){
    return this.bairro;
}
public String getPais(){
    return this.pais;
}
public String getEstado(){
    return this.estado;
}
public String getCep(){
    return this.cep;
}
public String getCpf(){
    return this.cpf;
}
public String getNumeroCelular(){
    return this.numeroCelular;
}

//SET
public void setNome(String nome){
    this.nome=nome;
}
public void setDataNascimento(String dataNascimento){
   this.dataNascimento=dataNascimento;
}
public void setEmail(String email){
  this.email=email;
}
public void setTipoPessoa(String tipoPessoa){
     this.tipoPessoa=pessoa;
}

public String setRua(String rua){
    this.rua=rua;
}
public void  setBairro(String bairro){
     this.bairro=bairro;
}
public void setPais(String pais){
   this.pais=pais;
}
public void setEstado(String estado){
   this.estado=estado;
}
public void setCep(String cep){
     this.cep=cep;
}
public void setCpf(String cpf){
    return this.cpf;
}
public void setNumeroCelular(String numeroCelular){
   this.numeroCelular=numeroCelular;
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