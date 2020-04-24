
package Agencia;

/**
 *
 * @author Dr.Furico
 */
public class Conta {
    private String nomeTitular;
    private String dataNascimento;
    private int numeroConta;
    protected double saldo;
    private String cpf;

    public Conta() {
    }

    public Conta(String nomeTitular, String dataNascimento, 
            int numeroConta, String cpf) {
        this.nomeTitular = nomeTitular;
        this.dataNascimento = dataNascimento;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.cpf = cpf;
    }
 
  public String getNomeTitular(){
      
      return nomeTitular;
  }
  
  public void setNomeTitular(String n){
      this.nomeTitular = n;
      
  }
  // 
  public String getDataNascimento(){
  
      return dataNascimento;
  
  }
  public void setDataNascimento(String d){
      this.dataNascimento = d;
  }
  
  public int getNumeroConta (){
      return numeroConta;
  }
  public void setNumeroConta(int c){
      this.numeroConta = c;
  }
  
  public double getSaldo(){
      return saldo;
  }
  
  public void setsaldo(double s){
      this.saldo = s;
  }
  public String getCpf(){
      return cpf;
  }
  public void setCpf(String cpf){
      this.cpf = cpf;
  }
    
  public boolean sacar(double valor){
      if(valor >= 0){
          if(this.saldo >= valor){
              this.saldo -= valor;
              return true;
          }
      }
     return false;
  }
  public boolean depositar(double valor){
      if(valor >= 0){
          this.saldo = valor;
          return true;
      }
      return false;
  }
}


