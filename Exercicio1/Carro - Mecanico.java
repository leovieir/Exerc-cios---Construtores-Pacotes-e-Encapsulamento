import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Carro{
  private String marca;
  private String modelo;
  private String cor;
  private String placa;
  private float kmRodados;
  private int capacidadeDoTanque;
  private List<Dano> danos = new ArrayList<Dano>();

  public Carro(String marca, String modelo, String cor, String placa, float kmRodados, int capacidadeDoTanque){
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.placa = placa;
    this.kmRodados = kmRodados;
    this.capacidadeDoTanque = capacidadeDoTanque;
  }

  public void adicionarDano(Dano dano){

  }

  public float calcularCustoConserto(){
    return custoTotal;
  }

}