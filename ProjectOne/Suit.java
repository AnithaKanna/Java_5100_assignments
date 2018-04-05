public enum Suit {

        SPADES, HEARTS, CLUBS, DIAMONDS;

    public Suit[] getValue(){
            for(Suit e:Suit.values() ){
                System.out.println(e.toString());
            }
        return Suit.values();
    }

    }



