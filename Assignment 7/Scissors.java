public class Scissors extends Tool{

    public Scissors(double strength) {
         this.strength=strength;


    }



    @Override
    public double fight(Scissors s) {
        return strength;
    }

    @Override
    public double fight(Paper p) {

        double newStrength = 2 * super.strength;
        return strength;
    }
        public double fight(Rock r){
            double newStrength=(super.strength)/2;
            return newStrength;


    }


}

