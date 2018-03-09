public class cookie extends desertItem {

    int number;
    float price;


    public cookie(String name, int number, float price) {
        super(name);
        this.number = number;
        this.price = price;

    }


    public float getcost() {
        float cost = (number * price)/12;
       return cost;
    }

    @Override
    public String getname() {
        String printingline=number+" @\t"+(price/100)+"/dz\n";
        printingline+=super.name;
        return printingline;
    }
}