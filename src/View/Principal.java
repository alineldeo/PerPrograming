/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.AluguelDeAutomovel;
import Model.Automovel;
import Model.Pessoa;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String arg[]) {
        ArrayList<Pessoa> Funcionarios = new ArrayList<Pessoa>();
        ArrayList<Pessoa> Clientes = new ArrayList<Pessoa>();
        ArrayList<Automovel> automoveis = new ArrayList<Automovel>();
        ArrayList<AluguelDeAutomovel> alugueis = new ArrayList<AluguelDeAutomovel>();
      
        
           String[] choices = { "1. Cadastrar Funcionário", "2. Cadastrar Cliente", "3. Cadastrar Automóvel", "4. Criar Aluguel", "5. Sair"};
    String input = (String) JOptionPane.showInputDialog(null, "O que deseja fazer?","The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]); // Initial choice
    System.out.println(input);
    }

}
