import java.text.DecimalFormat;
import java.util.ArrayList;

import static java.lang.String.format;

public class checkout {

    ArrayList<desertItem> DI;
    public checkout() {
        DI = new ArrayList<desertItem>();

    }

    public float tot;




    public  void enterItem(desertItem a) {
        DI.add(a);
    }

    public int numberOfItems() {
        return DI.size();

    }

    public void clear() {
        DI.clear();
    }

    public float totalcost() {
        tot=0;
        for (int counter = 0; counter < DI.size(); counter++) {

            desertItem temp = DI.get(counter);
            tot += temp.getcost();

        }
        return tot;


    }

    public float TotalTax() {
        float Tax = (tot * 6.5f) / 100;
        return Tax;
    }

    @Override
    public String toString() {

        System.out.println ("\n M & M Desert Shoppee"+"\n -------------------");

        for (int i = 0; i < DI.size(); i++) {
            desertItem temp = DI.get(i);
            String fs;
            fs  = format(temp.getname() +"\t\t\t\t\t\t"+new DecimalFormat("#.00").format(temp.getcost()/100));
            System.out.println(fs);


        }
       return ("\nTax: \t\t\t\t"+ new DecimalFormat("#.00").format(TotalTax()/100)+"\nTotal cost:\t\t\t"+new DecimalFormat("#.00").format( (totalcost()+TotalTax())/100) );


    }
}
