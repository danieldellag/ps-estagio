import java.util.*;

public class Main{
  public static void main(String args[]){

    Scanner input = new Scanner(System.in);

    int numberNotRepeated, n;
    Solution resultado = new Solution();

    System.out.print("Enter the size of the vector to be typed: ");
    n = input.nextInt();

    if(n % 2 != 0){
      int[] vetor = new int[n];

      for(int i = 0; i < vetor.length; ++i){
        vetor[i] = input.nextInt();
      }

      numberNotRepeated = resultado.solution(vetor);

      System.out.println(numberNotRepeated);
    }
    else
        System.out.println("Vector size should be odd. Retry!!");
  }
}
