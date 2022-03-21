import java.util.Scanner;
public class Piloto
{
Scanner input = new Scanner(System.in);
private String nome;
private String CPF;

public Piloto(String nome, String CPF){
    this.nome = nome;
    this.CPF = CPF;

}
public Piloto(){
     
        System.out.println("informe seu nome: ");
        this.nome = input.nextLine();
        System.out.println("Informe o CPF: ");
        this.CPF = input.nextLine();
        

}
public void apresentar(int tamanho, int i){
        
    System.out.println(i + 1 + "º Piloto: " + this.getNome());
    System.out.println("Número do CPF: " + this.getCPF());
    System.out.println(" ");
    i++;
}

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getCPF() {
    return CPF;
}
public void setCPF(String cPF) {
    CPF = cPF;
}
}