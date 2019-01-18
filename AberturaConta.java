class AberturaConta{
    public static void main (String [] args){
        Conta C = new Conta(); //C variavel de referencia
        C.setTitular("Ana");      
        C.setSaldo(10000);

        System.out.println(C.getSaldo());

	Conta C1 = new Conta("Maria");
	System.out.println(C1.getTitular());
	System.out.println(Conta.getIdentificador());
	Conta C2 = new Conta();
	C.recuperaDadosParaImpressao();

     
        
    }

}

