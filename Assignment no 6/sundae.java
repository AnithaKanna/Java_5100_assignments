public class sundae extends icecream {

    String topping;
    float toppingPrice;

    public sundae(String name, float price,String topping,float toppingPrice) {
        super(name, price);
        this.topping=topping;
        this.toppingPrice=toppingPrice;
    }
    public float getcost(){
        float cost=price+toppingPrice;
        return cost;
    }
    @Override
    public String getname(){
        String printingline=topping+" with\n" +super.name;

        return printingline;
    }

}
