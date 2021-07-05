public class Data{
  private int tipo;

  private int ano;
  private int dia;
  private int mes;
  private String mesExtenso;

  public Data(int ano, int mes, int dia){
    if ((ano > 0) && (mes > 0) && (mes < 13) && (dia > 0) && (dia < 32)){
      this.ano = ano;
      this.mes = mes;
      this.dia = dia;

      this.tipo = 0;
    }
  }

  public Data(int ano, String mesExtenso, int dia){
    if ((ano > 0) && (dia > 0) && (dia < 32)){
      this.ano = ano;
      this.mesExtenso = mesExtenso;
      this.dia = dia;

      this.tipo = 1;
    }
  }

  public Data(int dia, int ano){
    if ((ano > 0) && (dia > 0) && (dia < 367)){
      this.ano = ano;
      this.dia = dia;

      this.tipo = 2;
    }
  }

  public void imprimir(){
    if (this.tipo == 0){
      this.imprimirDMA();
    }
    else if (this.tipo == 1){
      this.imprimirExtenso();
    }
    else if (this.tipo == 2){
      this.imprimirDiaEAno();
    }
  }

  private void imprimirDMA(){
    System.out.println("" + this.dia + "/" + this.mes + "/" + this.ano);
  }

  private void imprimirExtenso(){
    System.out.println("" + this.mesExtenso + " " + this.dia + ", " + this.ano);
  }

  private void imprimirDiaEAno(){
    System.out.println("" + this.dia + " " + this.ano);
  }
}