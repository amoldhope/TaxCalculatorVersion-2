package application;

public class Main {

    public static void main(String[] args) {
        int riceQuantity=2,chairQuantity=2;
        TaxCalulator t=new TaxCalulator(riceQuantity,chairQuantity);
        t.calculate();
        System.out.println(t);
    }
}
