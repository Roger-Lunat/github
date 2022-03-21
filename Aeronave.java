import java.util.Scanner;
public class Aeronave {
    Scanner input = new Scanner(System.in);

    private String modelo;
    private String placa;
    private int numChassi;

    public Aeronave(String placa, int numChassi){

        this.placa = placa;
        this.numChassi = numChassi;

    }
    public Aeronave(){
        System.out.println("Informe o moedelo da aeronave:: ");
        modelo = input.nextLine();
        System.out.println("Informe o número da placa: ");
        placa = input.nextLine();
        System.out.println("Informe o número do chassi: ");
        numChassi = input.nextInt();
    }
    public void apresentar(int tamanho, int i){
        System.out.println("AERONAVE: " + getModelo());
        System.out.println("PLACA: " + getPlaca());


    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getNumChassi() {
        return numChassi;
    }
    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }
    
}
