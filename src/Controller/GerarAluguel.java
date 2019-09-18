package Controller;

import Model.AluguelDeAutomovel;
import Model.Automovel;
import Model.Cliente;
import Model.Diaria;
import Model.Mensal;

public class GerarAluguel {

    public AluguelDeAutomovel gerarAluguel(Cliente cliente, Automovel automovel, int tipo) {
        if (tipo == 1) {
            return new Diaria(cliente, automovel);
        }
        if (tipo == 2) {
            return new Mensal(cliente, automovel);
        }
        return null;
    }
   public void cadastraCliente(String nome, String cpf, Stringendereco, String email){
    

   }
   }

   
