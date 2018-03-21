public abstract class Tool {
    double strength;
    Character type;


    //public abstract int getStrength();
   // public abstract int fight();



    public void setStrength(int st) {
        if (st<50){
            strength=st;
        }
    }

    public abstract double fight(Scissors s);

    public abstract double fight(Paper p);
    public abstract double fight(Rock r);
}
