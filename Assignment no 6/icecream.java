public class icecream extends desertItem {

    float price;

    public icecream(String name,float price){
        super(name);
        this.price=price;
    }
    public float getcost(){
        float cost=price;
        return cost;
    }

    @Override
    public String getname() {
       String printingline=super.name;
        return printingline;
    }
}
