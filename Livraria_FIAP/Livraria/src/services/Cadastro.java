package services;

import models.Cliente;
import views.MenuInicial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {

    List<Cliente> clientes = new ArrayList<>();
    MenuInicial menu = new MenuInicial(); //Instanciei o menu Iniciar

    public void cadastrarCliente() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("==== Cadastrar models.Cliente ====");

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o login: ");
        String login = entrada.nextLine();

        System.out.print("Digite a senha: ");
        int senha = entrada.nextInt();
        entrada.nextLine();// consome a linha

        System.out.print("Digite o CPF: ");
        long cpf = entrada.nextLong(); entrada.nextLine();

        // Criando o models.Cliente com os dados.
        Cliente novoCliente = new Cliente(nome, login, senha, cpf);

        clientes.add(novoCliente); // adiciona na lista
        System.out.println("models.Cliente adicionado com sucesso!");

        fazerLogin(); // chama a tela de login
    }


    public void fazerLogin() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu login cadastrado: ");
        String loginValido = entrada.nextLine();

        System.out.println("Digite sua senha cadastrada: ");
        int senhaValida = entrada.nextInt();
        entrada.nextLine();

        if (clientes == null) {
            //Trata caso o objeto seja (null)
            throw new IllegalArgumentException("O objeto não pode ser nulo");
        } else {
            for (Cliente cliente : clientes) {
                if (cliente.getLoginUsuario().equals(loginValido) && cliente.getSenhaUsuario() == senhaValida) {
                    System.out.println("Login bem sucedido! \nAgurade um momento que você sera redirecionado a tela de (Menu)");
                    menu.menuExibir();
                    break;
                }else {
                    System.out.println("Usuario não encontrado! Tente novamente");
                }

            }
        }

        entrada.close();

    }

}
