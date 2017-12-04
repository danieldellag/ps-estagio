import java.util.*;

public class Main{
  public static void main(String args[]){

    Scanner input = new Scanner(System.in);

    int N, M;
    int chocolatesEated;
    Solution resultado = new Solution();

    N = input.nextInt();
    M = input.nextInt();

    chocolatesEated = resultado.solution(N, M);

    System.out.println(chocolatesEated);
  }
}
