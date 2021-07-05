public class Carro{
  private String marca;
  private String modelo;
  private String cor;
  private String placa;
  private float kmRodados;
  private int capacidadeDoTanque;
  private float precoPorKilometro;

  public Carro(String marca, String modelo, String cor, String placa, float kmRodados, int capacidadeDoTanque, float precoPorKilometro){
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.placa = placa;
    this.kmRodados = kmRodados;
    this.capacidadeDoTanque = capacidadeDoTanque;
    this.precoPorKilometro = precoPorKilometro;
  }

  public void alugarParaCliente(Cliente cliente){

  }

  public float calcularPrecoLocacao(int diasDeLocacao){
    
    return precoLocacao;
  }

  public void carroDevolvido(){
    
  }
}