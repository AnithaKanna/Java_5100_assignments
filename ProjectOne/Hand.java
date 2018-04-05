public class Hand extends GroupOfCards {

    class HandValue {
        int  count;
        boolean soft;
    }


    private HandValue curValue;

    Hand(){
        super(10);
    }



    HandValue getHandValue(){
        curValue.count =0;
        boolean hasAce = false;
        int val=0;
        for(int i =0;i<super.getCurrentSize();i++)
        {
            val +=   cards.get(i).getSpot().getValue();
            if(cards.get(i).getSpot().getValue()==1)
                hasAce = true;
        }
        if(hasAce && val<21)
        {
            if(val-1+11<=21){
                curValue.soft=true;
                val+= 10   ;
            }
        }
        curValue.count=val;
        return curValue;

    }


}

