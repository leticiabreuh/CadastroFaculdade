import java.util.Scanner;
public class SistemaFaculdade{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*Pessoa */
        Pessoa pessoa = new Pessoa();
         pessoa.setNome("Laura");
         pessoa.setDataNascimento("07/03/2005");
         pessoa.setEmail("teste@gmail.com");
         pessoa.setTipoPessoa("Aluno/Professor");
         pessoa.setRua("Uruguaiana");
         pessoa.setBairro("Jardim Iririu");
         pessoa.setPais("Brasil");
         pessoa.setEstado("Santa Catarina");
         pessoa.setCep("1654164");
         pessoa.setCpf("1313156");
         pessoa.setNumeroCelular("+55 (47) 5146546");

       
        String mensagem = "\nNome: "+pessoa.getNome()+
                          "\nData de Nascimento: "+pessoa.getDataNascimento()+
                          "\nEmail: "+pessoa.getTipoPessoa()+
                          "\nRua: "+pessoa.getRua()+
                          "\nBairro: "+pessoa.getBairro()+
                          "\nPais: "+pessoa.getPais()+
                          "\nEstado: "+pessoa.getEstado()+
                          "\nCep: "+pessoa.getCep()+
                          "\nCpf: "+pessoa.getCpf()+
                          "\nNumero de celular: "+pessoa.getNumeroCelular();
    
   
        System.out.println("Pessoa: "+mensagem);
         pessoa.pessoaFazendo();
        pessoa.vaiFazer();
        pessoa.comoFoi();

        


        System.out.println(" ");

        /*Professor */
        Professor professor = new Professor();
         professor.setNome("Laura");
         professor.setDataNascimento("07/03/2005");
         professor.setEmail("teste@gmail.com");
         professor.setTipoPessoa("Aluno/Professor");
         professor.setRua("Uruguaiana");
         professor.setBairro("Jardim Iririu");
         professor.setPais("Brasil");
         professor.setEstado("Santa Catarina");
         professor.setCep("1654164");
         professor.setCpf("1313156");
         professor.setNumeroCelular("+55 (47) 5146546");

      

        

        String mensagem2 = "\nNome: "+professor.getNome()+
                          "\nData de Nascimento: "+professor.getDataNascimento()+
                          "\nEmail: "+professor.getTipoPessoa()+
                          "\nRua: "+professor.getRua()+
                          "\nBairro: "+professor.getBairro()+
                          "\nPais: "+professor.getPais()+
                          "\nEstado: "+professor.getEstado()+
                          "\nCep: "+professor.getCep()+
                          "\nCpf: "+professor.getCpf()+
                          "\nNumero de celular: "+professor.getNumeroCelular();
    
   
        System.out.println("Professor: "+mensagem2);
        professor.pessoaFazendo();
        professor.vaiFazer();
        professor.comoFoi();


    

   


    }
}