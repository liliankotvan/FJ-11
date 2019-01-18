class Funcionario{
    private String nome, sobrenome;
    private double salario; // encapsulamento (private)
	private double comissao;
    private static double premio;      // variavel de classe(global) - está associado à classe(static)
    static int identificador = 0;

    Funcionario (double salario){
        this();
        setSalario(salario);
    }

    Funcionario (String nome){   //construtor - garante que add o funcionario com nome
        this(); 
        this.nome = nome;
    }

    Funcionario();{
        identificador++;
 }  //para flexibilizar - aceita nome ou não

    Funcionario (String nome, double salario){   // construtor nao tem retorno - nao é metodo
        this(nome);               //um construtor chamando outro-como ja chama constr nao coloca this()
        this.setSalario(salario);   
    }

    Funcionario (double salario, String nome){  //parecido com outro construtor mas ordem diferente
        this(nome);
        this.setSalario(salario);       //nao pode chamar 2 construtores
    }
    void setComissao(double comissao){
        this.comissao = comissao;
    }

    double getComissao(){
        return this.comissao;
    }

    void setNome (String nome){
        this.nome = nome;
    }

    String getNome(){
        return nome;
    }

    void setSalario (double salario){
        this.salario = salario;
    }

    double getSalario(){
        return salario;
    }

    static void setPremio (double valor){
        Funcionario.premio += valor; //não pode usar this - usa nome da classe
    }

