 public class Paper extends  Tool {
    public Paper(double strength) {

        this.strength=strength;


    }



    @Override
    public double fight(Rock r) {

            double newStrength = 2 * super.strength;
            return newStrength;
        }
       public double fight(Scissors s){
            double newStrength=super.strength/2;
            return newStrength;
        }

     @Override
     public double fight(Paper p) {
         return strength;
     }

 }


