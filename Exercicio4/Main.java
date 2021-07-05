class Main {
  public static void main(String[] args) {
    Data data1 = new Data(1997, 5, 25);
    Data data2 = new Data(2001, 10, 27);

    Data data3 = new Data(1997, "Maio", 25);
    Data data4 = new Data(2001, "Outubro", 27);

    Data data5 = new Data(100, 1997);
    Data data6 = new Data(200, 2001);

    data1.imprimir();
    data2.imprimir();

    data3.imprimir();
    data4.imprimir();
    
    data5.imprimir();
    data6.imprimir();
  }
}