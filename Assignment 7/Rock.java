 public class Rock extends Tool {

    public Rock(double strength) {

        this.strength=strength;


    }



    @Override
    public double fight(Scissors s) {

            double newStrength = 2 * super.strength;
            return newStrength;
        }
        public double fight(Paper p){
            double newStrength=super.strength/2;
            return newStrength;
        }

     @Override
     public double fight(Rock r) {
         return strength;
     }

 }
