import java.util.Scanner;
public class App 
{
    static Scanner input = new Scanner(System.in);
    static int tamanho = 2;
    static Piloto piloto[] = new Piloto[tamanho];
    static Aeronave aeronave[] = new Aeronave[tamanho];
    public static void main(String[] args)
    {

        inicio();
        
    }
    public static void menu(){
        System.out.println("O que você deseja fazer");
        System.out.println("");
        System.out.println("[0] - MENU");
        System.out.println("[1] - CADASTRAR");
        System.out.println("[2] - LISTAR");
        System.out.println("[3] - AUMENTAR TAMANHO");

    }
    
    public static void inicio()
    {
        menu();
        interacao();

    }
    
    public static void interacao()
    {
        int escolhaMenu;
        escolhaMenu = input.nextInt();

        if (escolhaMenu == 0) 
        {
            limpaTela();
            inicio();

        }
         else if (escolhaMenu == 1) 
        {
            limpaTela();
            System.out.println("Informe o que você deseja cadastrar: ");
            System.out.println("[1] - PILOTO");
            System.out.println("[2] - AERONAVE");
            int escolhaIndice = input.nextInt();
            if (escolhaIndice == 1) 
            {
                limpaTela();
                for (int i = 0; i < tamanho; i++) 
                {

                    piloto[i] = new Piloto();
                }
            } else if (escolhaIndice == 2)
            {
                limpaTela();
                for (int i = 0; i < tamanho; i++) 
                {
                    aeronave[i] = new Aeronave();
                }
            }
        } else if (escolhaMenu == 2) 
        {
        System.out.println("INFORME O QUE VOCÊ DESEJA LISTAR: ");
        System.out.println("[1] - PILOTO");
        System.out.println("[2] - AERONAVE");
        System.out.println("[3] - PILOTO E AERONAVE");
        int escolhaIndice = input.nextInt();

            if (escolhaIndice == 1) 
            {
                for (int i = 0; i < tamanho; i++) 
                {    
                    piloto[i].apresentar(tamanho, i);
                    imprimeLinha();
                }
    
            } 
            else if (escolhaIndice == 2) 
            {
                for (int i = 0; i < tamanho; i++) 
                {
                    aeronave[i].apresentar(tamanho, i);
                    imprimeLinha();
                }
    
            } 
            else if (escolhaIndice == 3)
            {
                for (int i = 0; i < tamanho; i++) 
                {
                    piloto[i].apresentar(tamanho, i);
                    imprimeLinha();
                    aeronave[i].apresentar(tamanho, i);
                    imprimeLinha();
                }
            } 
            else
            {
                inicio();
            }

        } else if ( escolhaMenu == 3)
        {

        System.out.println("Informe o novo tamanho: ");
        int novoTamanho = input.nextInt();
            tamanho = novoTamanho;
            limpaTela();
            System.out.println("Novo tamanho alterado com sucesso!!");
        } else 
        {
            inicio();
        }
        inicio();
    }
 
    public static void limpaTela()
    {
        for (int i = 0; i < 50; i++) 
        {
            System.out.println(" ");
            
        }
    }
    
    public static void imprimeLinha(){
        System.out.println("---------------");
    }
}
