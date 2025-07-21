public class SistemaFaculdade
    public static void main(String[] args){

        /*Pessoa */
        Pessoa pessoa = new Pessoa();
         pessoa.setNome("Laura");
         pessoa.setDataNascimento("07/03/2005");
         pessoa.setEmail("teste@gmail.com");
         pessoa.setTipoPessoa("Aluno/Professor");
         pessoa.setrRua("Uruguaiana");
         pessoa.setBairro("Jardim Iririu");
         pessoa.setPai("Brasil");
         pessoa.setEstado("Santa Catarina");
         pessoa.setCep("1654164");
         pessoa.setCpf(1313156);
         pessoa.setNumeroCelular("+55 (47) 5146546");

        pessoa.pessoaFazendo();
        pessoa.aiFazer();
        pessoa.comoFoi();

        String mensagem = "\nNome: "+pessoa.getNome()+
                          "\nData de Nascimento: "+pessoa.getDataNascimento()+
                          "\nEmail: "+pessoa.getTipoPessoa()+
                          "\nRua: "+pessoa.getRua()+
                          "\nBairro: "+pessoa.getBairro()+
                          "\nPais: "+pessoa.getPais()+
                          "\nEstado: "+pessoa.getEstado()+
                          "\nCep: "pessoa.getCep()+
                          "\nCpf: "pessoa.getCpf()+
                          "\nNumero de celular: "pessoa.getNumeroCelular;
    
    System.out.printl("Pessoa: "+mensagem);

   


    }