package application;

public class TaxCalulator {

    private final int riceQuantity;
    private final int chairQuantity;
    private int totalAmount=0;
    Food food=new Food();
    Furniture furniture=new Furniture();
    private int gst=0;

    public TaxCalulator(int riceQuantity, int chairQuantity) {
        this.riceQuantity=riceQuantity;
        this.chairQuantity=chairQuantity;
    }

     void calculate(){
        totalAmount=riceQuantity*food.getPrice()+chairQuantity*furniture.getPrice();
        gst=riceQuantity*food.getTax()*food.getPrice()/100+ chairQuantity*furniture.getPrice()*furniture.getTax()/100;

    }


    @Override
    public String toString() {
        return "totalAmount=" + totalAmount +
                "\ngst=" + gst + "\nAMountWithGst= "+(totalAmount+gst)
                ;
    }
}
