public class Exercicio06{
    public static void main (String[] args){
	    
        int fibonacci = 0;
        int incremento = 1;
        while ( fibonacci<=144 ){
            System.out.println(fibonacci + "f");
            System.out.println(incremento + "i");
            fibonacci = fibonacci + incremento;
            incremento = incremento + fibonacci;
                      
        }
    }
}    
