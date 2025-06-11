package model;

public class Van extends Carros{

    private int capacidade;
    
    public Van(String modelo,String marca,String placa, int anofabrication, int dias, int especifico){
        super(modelo, marca, placa, anofabrication, dias, especifico);
        setAluguel(180);
        setCapacidade(especifico);
    }

    public void setCapacidade(int capacidade){this.capacidade = capacidade;}

    public int getCapacidade(){return capacidade;}

    @Override
    public double calcularValorAluguel(int dias) {
        return precoaluguel*dias;
    }

    @Override
    public void mostrar() {
        String exibir = "Van: "
        +"\nPlaca: "+getPlaca()
        +"\nMarca: "+getMarca()
        +"\nModelo: "+getModelo()
        +"\nAno: "+getAnoDeFabricação()
        +"\nCapacidade de passageiros: ";

        System.out.println(exibir);
    }

}
