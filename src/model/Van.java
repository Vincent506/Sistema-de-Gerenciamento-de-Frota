package model;

public class Van extends Carros{

    private int capacidade;
    
    public Van(String modelo,String marca,String placa, int anofabrication, int dias, int capacidade){
        super(modelo, marca, placa, anofabrication, dias, capacidade);
        setAluguel(180);
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
