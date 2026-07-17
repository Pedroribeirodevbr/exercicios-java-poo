package Dominio;

public class Celular {
    private String marca;
    private String modelo;
    private int armazenamentoGB;
    private double preço;

    public Celular(String marca, String modelo, int armazenamentoGB, double preço) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamentoGB = armazenamentoGB;
        this.preço = preço;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamentoGB() {
        return armazenamentoGB;
    }

    public void setArmazenamentoGB(int armazenamentoGB) {
        this.armazenamentoGB = armazenamentoGB;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void exibirInfo() {
        System.out.println("Informações do Dispositivo");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Armazenamento :" + this.armazenamentoGB + "GB");
        System.out.println("Preço: " + this.preço);
    }
}
