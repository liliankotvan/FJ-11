class AberturaConta{
    public static void main (String [] args){
        Conta C = new Conta(); //C variavel de referencia
        C.titular = "Ana";      
        C.saldo = 10000;

        Conta C1 = new Conta();
        C1.titular = "Hugo";
        C1.saldo = 10000;

        C1 = C;

        
        if (C == C1){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }

        Data data = new Data();
        C.dataDeAbertura = data;
        
    }

}

