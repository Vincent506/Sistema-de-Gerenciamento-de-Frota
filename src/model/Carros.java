package model;

public class Carros implements Alugavel{
    private int numberportas;
    protected String placa;
    protected String modelo;
    protected String marca;
    protected int anofabrication;
    protected double precoaluguel;
    protected int dias;

    public Carros(String modelo,String marca, String placa, int anofabrication, int dias, int especifico){
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.anofabrication = anofabrication;
        this.precoaluguel = 120;
        this.dias = dias;
        setNumberPortas(especifico);
    }

    public void setMarca(String marca){this.marca = marca;}

    public String getMarca(){return marca;}

    public void setModelo(String modelo){this.modelo = modelo;}

    public String getModelo(){return modelo;}

    public void setPlaca(String placa){this.placa = placa;}

    public String getPlaca(){return placa;}

    public void setAnoDeFabricação(int anofabrication){this.anofabrication = anofabrication;}

    public int getAnoDeFabricação(){return anofabrication;}

    public void setNumberPortas(int numberportas){this.numberportas = numberportas;}

    public int getNumberPortas(){return numberportas;}

    public void setDias(int dias){this.dias = dias;}

    public int getDias(){return dias;}

    public void setAluguel(double precoaluguel){this.precoaluguel = precoaluguel;}

    public double getAluguel(){return precoaluguel;}

    @Override
    public double calcularValorAluguel(int dias) {
        return precoaluguel*dias;
    }

    public void mostrar() {
        String exibir = "Carro: "
        +"\nPlaca: "+getPlaca()
        +"\nMarca: "+getMarca()
        +"\nModelo: "+getModelo()
        +"\nAno: "+getAnoDeFabricação()
        +"\nPortas: "+getNumberPortas();

        System.out.println(exibir);

    }
}
