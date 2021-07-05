public class Carro{
  private String marca;
  private String modelo;
  private String cor;
  private String placa;
  private float kmRodados;
  private int capacidadeDoTanque;
  private int preco;

  public Carro(String marca, String modelo, String cor, String placa, float kmRodados, int capacidadeDoTanque, int preco){
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.placa = placa;
    this.kmRodados = kmRodados;
    this.capacidadeDoTanque = capacidadeDoTanque;
    this.preco = preco;
  }

  public void venderParaCliente(Cliente cliente){

  }

  public void comprarDeCliente(Cliente cliente, int preco){
    
  }

}