public class Solution{
  public int solution(int[] A){

    int count = 1; //Considerando que já existe no mínimo um numero no vetor  
    int atual, j;
    /*Algoritmo de ordenacao: Insertion Sort*/
    for(int i = 0; i < A.length; ++i){
      atual = A[i];
      for(j = i - 1; (j >= 0) && (atual < A[j]); --j){
        A[j+1] = A[j];
      }
      A[j+1] = atual;
    }
	/******/

    for(int i = 0; i < A.length-1; ++i){
      if(A[i] != A[i+1])
        ++count;
    }
    return count;
  }
}
