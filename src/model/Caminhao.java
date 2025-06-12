package model;

public class Caminhao extends Van{
    
    private float peso;
    private int eixos;

    public float getPeso(){return peso;}
    
    public void setPeso(float peso){this.peso = peso;}

    public int getEixos(){return eixos;}
    
    public void setEixos(int eixos){this.eixos = eixos;}

    public Caminhao(String modelo,String marca,String placa, int anofabrication, int dias,int eixos, float peso){
        super(modelo, marca, placa, anofabrication, dias, 0);
        setPeso(peso);
        setEixos(eixos);
    }

    @Override
    public void mostrar() {
        String exibir = "Caminhão: "
        +"\nPlaca: "+getPlaca()
        +"\nMarca: "+getMarca()
        +"\nModelo: "+getModelo()
        +"\nAno: "+getAnoDeFabricação()
        +"\nCapacidade: "+getPeso()
        +"\nEixos: "+getEixos();

        System.out.println(exibir);
    }
    

}
