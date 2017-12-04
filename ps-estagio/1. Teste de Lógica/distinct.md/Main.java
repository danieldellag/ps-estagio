import java.util.*;

public class Main{
  public static void main(String args[]){

    Scanner input = new Scanner(System.in);

    int numerosDistintos, n;
    Solution resultado = new Solution();

    System.out.print("Enter the size of the vector: ");
    n = input.nextInt();

    System.out.println();

    int[] vetor = new int[n];

    for(int i = 0; i < vetor.length; ++i){
      vetor[i] = input.nextInt();
    }

    numerosDistintos = resultado.solution(vetor);

    System.out.println(numerosDistintos);
  }
}
