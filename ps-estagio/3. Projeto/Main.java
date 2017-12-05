import java.util.*;

public class Main{
  public static void main(String args[]){

    Scanner input = new Scanner(System.in);
    Control controle = new Control();

    int n = 0;
    String[][] tabelaTarefas = new String[n][2];

    int choice; //Opção escolhida pelo usuário

    choice = menu(tabelaTarefas);
    while(choice != 0){

      switch(choice){
        case 1:
          controle.adicionar(tabelaTarefas);
          break;

        case 2:
          controle.finalizar(tabelaTarefas);
          break;

        case 3:
          controle.visualizar(tabelaTarefas);
          break;

        case 4:
          controle.excluir(tabelaTarefas);
          break;

        default:
          System.out.println("Command number doesn't exist");
          break;
      }
    }


  }

  /*Mostrar lista de tarefas e opçoes que o usuário possui*/
  public static int menu(String[][] tabelaTarefas){
    Scanner input = new Scanner(System.in);
		System.out.println("+----------TAREFAS-------------+");
    for(int i = 0; i < tabelaTarefas.length; ++i){
        System.out.println(" | " + i + "                   | ");
		    System.out.println(" | " + tabelaTarefas[i][0] + " | ");
        System.out.println(" | " + tabelaTarefas[i][1] + " | ");
    }
    System.out.println("+------------------------------+");
    System.out.println("+----------COMANDOS------------+");
    System.out.println("+ 1: Adicionar Tarefa          +");
    System.out.println("+ 2: Finalizar Tarefa          +");
    System.out.println("+ 3: Visualizar Tarefa         +");
    System.out.println("+ 4: Excluir Tarefa            +");
    System.out.println("+ 0: Finalizar Opções          +");
    System.out.println("+------------------------------+");
		return (input.nextInt());
  }
}
