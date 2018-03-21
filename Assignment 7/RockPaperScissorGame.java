public class RockPaperScissorGame {
    public static void main(String args[]){
        Scissors s=new Scissors(25);
        Rock r=new Rock(10);
        Paper p=new Paper(15);
        System.out.println(s.fight(p)+" , "+s.fight(r));
        System.out.println(r.fight(p)+" , "+ r.fight(s));
        System.out.println(p.fight(r)+" , "+ p.fight(s));

    }
}
