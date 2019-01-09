class Conta{
	String titular; // variaveis de instancia (de objeto)
	String agencia;
    String dataAbertura;
    int numero;
    double saldo;

    void saca(double valor){  //método (jeito de fazer)
        saldo -= valor;       //todo método tem um retorno      
    }  
    void deposita(double valor){
        saldo += valor;
    }
    double calculaRendimento(){
       return this.saldo * 0.1;
    }
    double mostraSaldo(){
        return saldo;
    }
    void transfere(double valor, Conta conta){
        this.saldo -= valor;    //ou: this.saca(valor); - this representa o objeto
        conta.saldo += valor;
    } 
    void recuperaDadosParaImpressao(){
      
       System.out.println("Titular: "+ this.titular  +
        "\n Agência: " + this.agencia +
        "\n Número: " + this.numero +
        "\n Data da Abertura: " + this.dataAbertura +
        "\n Saldo: " + this.saldo);
    }

}  

class Data{
    int dia;
    int mes;
    int ano;
} 
