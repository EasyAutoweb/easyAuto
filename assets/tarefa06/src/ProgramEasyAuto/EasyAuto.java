/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        
package ProgramEasyAuto;



import java.util.Scanner;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import EasyAutoProjeto.Usuario;
import EasyAutoProjeto.Endereco;
import EasyAutoProjeto.Pagamento;
import EasyAutoProjeto.Pedido;
import EasyAutoProjeto.Fornecedores;
import EasyAutoProjeto.Cliente;
import EasyAutoProjeto.Produto;
import EasyAutoProjeto.Estoque;


//import package "EasyAuto/EasyAutoProjeto"

/**
 *
 *
 */
public class EasyAuto {
 //instanciar todos objetos
    public static void main(String[] args){
        
       Scanner input = new Scanner(System.in);
       Usuario usuario = new Usuario();
       usuario.setIdUsuario(ThreadLocalRandom.current().nextInt());
       
       System.out.println("Entre com os dados de usuário.");
       System.out.println("Tipo: ");
       usuario.setTipoUsuario(input.next().charAt(0));
       System.out.println("Login: ");
       usuario.setLoginUsuario(input.next());
       System.out.println("Senha: ");
       usuario.setSenhaUsuario(input.nextInt());
       
       //Usuario usuario = new Usuario(ThreadLocalRandom.current().nextInt(),'C',123,"cliente01");
       
       if(usuario.cadastroUsuario())
       {
           System.out.println("Usuário cadastrado com sucesso!");
       }
       else{
           System.out.println("Erro ao cadastrar usuário.");
       }
       
       //Teste endereço
       Endereco endereco = new Endereco(ThreadLocalRandom.current().nextInt(),"Rua","Abc" ,"12","201A","Centro", "30000-00", "Belo Horizonte" );
       if(endereco.escolheEndereco())
       {
           System.out.println("Endereço cadastrado com sucesso!");
       }
       else{
           System.out.println("Erro ao cadastrar endereço.");
       }
              
       Pagamento pagamento = new Pagamento(ThreadLocalRandom.current().nextInt(),"Boleto Bancário",new Date(),1);
       if(pagamento.selecionaFormaPagamento())
       {
           System.out.println("Forma de pagamento selecionada com sucesso!");
       }
       else{
           System.out.println("Selecione a forma de pagamento: ");
       }
       if(pagamento.validaPagamento())
       {
           System.out.println("Pagamento validado!");
       }
       else{
           System.out.println("Pagamento não validado!");
       }
       if(pagamento.selecionaFormaPagamento())
       {
           System.out.println("Pagamento faturado!");
       }
       else{
           System.out.println("Pagamento não faturado!");
       }
    
       Pedido pedido = new Pedido(ThreadLocalRandom.current().nextInt(), 123,'R',new Date(),1.2f,1.3f);
       
       if(pedido.finalizaCompra())
       {
           System.out.println("Pagamento finalizado!");
       }
       else{
           System.out.println("Pagamento pendente!");
       }
       
       Fornecedores fornecedores = new Fornecedores (ThreadLocalRandom.current().nextInt(),"12A2",
               "Auto Peças 30", "00 000 000/0001 00", "31 3330 1000", "31 99922 0909", "autopecas@email.com");
               
       if(fornecedores.enviaPedido())
       {
           System.out.println("Pedido enviado!");
       }
       else{
           System.out.println("Pedido não enviado!");
       }
       
       Cliente cliente = new Cliente( ThreadLocalRandom.current().nextInt(),33,"Joao José", 
               "joao@email.com", "31 98765 4321", "123.321.123/45" );
       if(cliente.informaEndereco())
       {
           System.out.println("Endereço informado!");
       }
       else{
           System.out.println("Informe o endereço para entrega!");
       }
       
       Produto produto = new Produto (ThreadLocalRandom.current().nextInt(), 320900, "Escapamento", 
               "Produto de alta qualidade", 12.9f);
       if(produto.pesquisaProduto())
       {
           System.out.println("Produto encontrado!");
       }
       else{
           System.out.println("Produto não encontrado!");
       }
       
       Estoque estoque = new Estoque (ThreadLocalRandom.current().nextInt(),3, "Depósito A" );
       if(estoque.verificaProduto())
       {
           System.out.println("Estoque disponível!");
       }
       else{
           System.out.println("Produto esgostado!");
       }
  
    }
}
