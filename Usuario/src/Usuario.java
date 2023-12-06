/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author convidado_
 */
public class Usuario {
//Declarar atributos
private String nome;
private String login;
private String senha;
    //Contrutor e inicializando valor vazio
    public Usuario() {
        this("","","");
    }

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    
    //Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }   
    public void Mensagem (){
        System.out.println("\nNome +"+ +"\nlogin"+ +"\nsenha"+);
        
    }    
    

}
