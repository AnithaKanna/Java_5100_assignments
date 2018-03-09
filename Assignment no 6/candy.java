public class candy extends desertItem{


    float weight;
    float price;



    public candy(String name, float weight, float price) {
       super(name);
        this.weight = weight;
        this.price = price;

    }

    public float getcost() {
        float cost = weight * price;
    return cost;

    }

    @Override
    public String getname() {
        String printingline=weight +" lbs.\t@ "+price+"/lb\n";
        printingline+=super.name;
        return printingline;
    }
}