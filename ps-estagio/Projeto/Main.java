import java.util.*;

public class Main{
  public static void main(String args[]){

    Scanner input = new Scanner();
    Control controle = new Control();

    int choice; //Opção escolhida pelo usuário

    choice = menu();
    while(choice != 0){

      switch(choice){
        case 1:
          controle.adicionar();
          break;

        case 2:
          controle.finalizar();
          break;

        case 3:
          controle.visualizar();
          break;

        case 4:
          controle.excluir();
          break;

        default:
          System.out.println("Command number doesn't exist");
          break;
      }
    }


  }

  /*Mostrar lista de tarefas e opçoes que o usuário possui*/
  public static int menu(){
    Scanner input = new Scanner(System.in);
		System.out.println("+----------TAREFAS-------------+");
		System.out.println("|1 - Cadastrar receita         |");
		System.out.println("|2 - Criar ingrediente         |");
		System.out.println("|3 - Atualizar Estoque         |");
		System.out.println("|4 - Cria novo item de Estoque |");
		System.out.println("|5 - Monta Refeicao            |");
		System.out.println("|6 - Mostra lista de Receitas  |");
		System.out.println("|7 - Mostra items do Estoque   |");
		System.out.println("|0 - Para sair                 |");
		System.out.println("+------------------------------+");
		return (input.nextInt());
  }
}
