import java.util.*;

public class Control{

  public void adicionar(String[][] tabelaTarefas){
    /*Scanner input = new Scanner(System.in);
    String tarefaEscolhida
    System.out.print("Digite o nome da tarefa a ser adicionada: ");
    tarefaEscolhida = input.next();
    System.out.print("Digite a situacao da tarefa: ");
    tarefaEscolhida = input.next();
    */

  }

  public void finalizar(String[][] tabelaTarefas){
    Scanner input = new Scanner(System.in);
    int tarefaEscolhida;
    System.out.print("Digite o numero da tarefa a ser finalizada: ");
    tarefaEscolhida = input.nextInt();

    tabelaTarefas[tarefaEscolhida][2] = "finalizado";
  }

  public void visualizar(String[][] tabelaTarefas){
    Scanner input = new Scanner(System.in);
    int tarefaEscolhida;
    System.out.print("Digite o numero da tarefa a ser visualizada: ");
    tarefaEscolhida = input.nextInt();

    System.out.print(tabelaTarefas[tarefaEscolhida][0] + " | ");
    System.out.println(tabelaTarefas[tarefaEscolhida][1]);
    System.out.println();
  }

  public void excluir(String[][] tabelaTarefas){
    Scanner input = new Scanner(System.in);
    int tarefaEscolhida;
    String choice;
    System.out.print("Digite o numero da tarefa a ser excluida: ");
    tarefaEscolhida = input.nextInt();

    System.out.print("Tem certeza de sua escolha? (y/n) ");
    choice = input.next();
    if(choice == "y"){
      for(int i = tarefaEscolhida; i < tabelaTarefas.length; ++i){
        tarefaEscolhida[i][0] = tarefaEscolhida[i+1][0];
        tarefaEscolhida[i][1] = tarefaEscolhida[i+1][1];
      }
    }
    else if(choice == "n")
      break;
  }
}
