import java.io.IOException;
import java.util.Scanner;


public class Main{

 
    public static void main(String[] args) throws IOException {

        int a,b,c,d, soma1, soma2;
         Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        soma1 = c + d;
        soma2 = a + b;
        if (b > c && d > a && soma1 > soma2 && c > 0 && d > 0 && a % 2 == 0 ) {
         System.out.println("Valores aceitos");   

        } else { 
         System.out.println("Valores não aceitos");   


        }
        

        
        
    }
}
