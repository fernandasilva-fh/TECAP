package Pum;
import java.io.IOException;
import java.util.Scanner;

public class main {
    
  public static void main(String[] args) throws IOException {
    int N;
    Scanner in = new Scanner(System.in);
    N = in.nextInt();
    for (int i = 0; i <= N; i++){
        if (i % 4 == 0) {
            System.out.println("PUM"); 
        }
        else{
            System.out.println(i);  
        }
    }
}