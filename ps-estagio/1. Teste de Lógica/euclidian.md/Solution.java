public class Solution{
  public int solution(int N, int M){

    int numberChocolatesEated;

    if(N == M)
      return 1;
    else{
      if(N % 2 == 0){ //N é par
        if(M == N/2) //M é metade de N, sendo M par ou impar
          return 2;
        else if(M % 2 == 0) //N é par e M é par (M != N/2)
          return N/2;
        else //N é par e M é impar
            return N;
      }
      else{ //N é impar
        if(mdc(N, M) == 1) //N e M não tem divisor em comum
          return N;
        else //N e M tem divisor em comum
          return N/(mdc(N, M));
      }
    }
  }
  //Método que calcula o mdc de 2 números
  public int mdc(int N, int M){
    int rest;
    while (M != 0) {
       rest = N % M;
       N = M;
       M = rest;
   }
   return N;
  }
}
