
package Agencia;

import java.util.ArrayList;

/**
 *
 * @author Dr.Furico
 */
public interface Dados {
    
    ArrayList<Conta> listaContatos = new ArrayList();

    public static void setConta(Conta c){
        listaContatos.add(c);
        
    }
    
    public static Conta getConta(int numConta){
        for(Conta conta :listaContatos ){
            if(conta.getNumeroConta() == numConta){
                return conta;
            }
        }
      return null;
    }
    public static Conta getContaCpf( String cpf){
        for(Conta conta :listaContatos ){
            if(conta.getCpf().equals(cpf)){
                return conta;
            }
        }
      return null;
    }

}
