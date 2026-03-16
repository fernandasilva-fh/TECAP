import java.io.IOException;
import java.util.Scanner;

public class main {
    
  public static void main(String[] args) throws IOException {

        int Hini, Hfinal, duracao;
        Scanner in = new Scanner(System.in);
        Hini = in.nextInt();
        Hfinal = in.nextInt();
        if (Hini < Hfinal)
        {
            duracao = Hfinal - Hini;
        } else if (Hini > Hfinal) 
            {
                duracao = (24 - Hini) + Hfinal;
            } else {
                duracao = 24;
            }
          System.out.println("O tempo de jogo foi " + duracao + " Horas");  
        
        } 
}
