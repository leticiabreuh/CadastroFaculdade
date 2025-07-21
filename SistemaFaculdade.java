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
         professor.setFormacaoAcademica(" ");
         professor.setExperienciaProfissional(" ");
         professor.setAreaAtuacao(" ");

        

        String mensagem2 = "\nNome: "+professor.getNome()+
                          "\nData de Nascimento: "+professor.getDataNascimento()+
                          "\nEmail: "+professor.getTipoPessoa()+
                          "\nRua: "+professor.getRua()+
                          "\nBairro: "+professor.getBairro()+
                          "\nPais: "+professor.getPais()+
                          "\nEstado: "+professor.getEstado()+
                          "\nCep: "+professor.getCep()+
                          "\nCpf: "+professor.getCpf()+
                          "\nNumero de celular: "+professor.getNumeroCelular()+
                          "\nFormacao academica: "+professor.getFormacaoAcademica()+
                          "\nExperiencia: "+professor.getExperienciaProfissional()+
                          "\nArea de atuacao: "+professor.getAreaAtuacao();
    
   
        System.out.println("Professor: "+mensagem2);
        professor.pessoaFazendo();
        professor.vaiFazer();
        professor.comoFoi();

         System.out.println(" ");


        /*Aluno */
        Aluno aluno = new Aluno();
         aluno.setNome("Laura");
         aluno.setDataNascimento("07/03/2005");
         aluno.setEmail("teste@gmail.com");
         aluno.setTipoPessoa("Aluno/Professor");
         aluno.setRua("Uruguaiana");
         aluno.setBairro("Jardim Iririu");
         aluno.setPais("Brasil");
         aluno.setEstado("Santa Catarina");
         aluno.setCep("1654164");
         aluno.setCpf("1313156");
         aluno.setNumeroCelular("+55 (47) 5146546");
         aluno.setDataIngresso("3/02/2025");
         aluno.setCurso("Medicina");
         aluno.setNivelEscolar("Ensino medio completo ");
         aluno.setNumeroMatricula("525146514");
         aluno.setStatus("Cursando");
         aluno.setTurno("Matutino ");
         aluno.setPagamentoCurso("Em dia");

       
        String mensagem3 = "\nNome: "+aluno.getNome()+
                          "\nData de Nascimento: "+aluno.getDataNascimento()+
                          "\nEmail: "+aluno.getTipoPessoa()+
                          "\nRua: "+aluno.getRua()+
                          "\nBairro: "+aluno.getBairro()+
                          "\nPais: "+aluno.getPais()+
                          "\nEstado: "+aluno.getEstado()+
                          "\nCep: "+aluno.getCep()+
                          "\nCpf: "+aluno.getCpf()+
                          "\nNumero de celular: "+aluno.getNumeroCelular()+
                          "\nData de ingresso: "+aluno.getDataIngresso()+
                          "\nCurso: "+aluno.getCurso()+
                          "\nNivel Escolar: "+aluno.getNivelEscolar()+
                          "\nNumero da matricula: "+aluno.getNumeroMatricula()+
                          "\nStatus: "+aluno.getStatus()+
                          "\nTurno: "+aluno.getTurno()+
                          "\nPagamento do curso: "+aluno.getPagamentoCurso();
    
   
        System.out.println("Aluno: "+mensagem3);
         aluno.pessoaFazendo();
         aluno.vaiFazer();
         aluno.comoFoi();

    

   


    }
}