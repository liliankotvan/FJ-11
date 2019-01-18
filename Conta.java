class Conta{
	private String titular; // variaveis de instancia (de objeto)
	private String agencia;
    private String dataAbertura;
    private int numero;
    private double saldo;
    private static int identificador=0;

    Conta(){
        Conta.identificador++;
    }

    Conta(String titular){
        this();
        this.titular = titular;
    }

    String getTitular(){
        return this.titular;
    }

    void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    static int getIdentificador(){
        return Conta.identificador;
    }

    void setTitular(String titular){
        this.titular = titular;
    }

    void setAgencia(String agencia){
        this.agencia = agencia;
    }
        
    String getAgencia(){
        return this.agencia;
    }

    String getDataAbertura(){
        return this.dataAbertura;
    }
    
    void setDatabertura(String dataAbertura){
        this.dataAbertura = dataAbertura;
    }

    void setNumero (int numero){
        this.numero = numero;
    }

    int getNumero (){
        return this.numero;
    }

    void setSaldo( double saldo){
        this.saldo = saldo;
    }

    double getSaldo(){
        return this.saldo;
    }

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
        "\n Saldo: " + this.saldo +
        "\n Número de contas: " + Conta.identificador);
    }

}  

class Data{
    int dia;
    int mes;
    int ano;
} 
