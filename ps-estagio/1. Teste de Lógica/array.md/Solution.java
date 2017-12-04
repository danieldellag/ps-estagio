public class Solution{
  public int solution(int[] A){

    int numberNotRepeated = -1; //Salva o número que não é repetido
    boolean repeated = false; //Flag para saber se o número repetiu ou não

    for(int i = 0; i < A.length; ++i){ //Anda do início ao fim, para comparar todos os números
      for(int j = 0; j < A.length; ++j){ //Anda do início até o fim para comparar todos os números
          if(i != j){ //Se não estou lendo o mesmo endereço
            if(A[i] == A[j])
              repeated = true;
          }
      }
      if(repeated == false)
        numberNotRepeated = A[i];
      else
        repeated = false;
    }
    return numberNotRepeated;
  }
}
