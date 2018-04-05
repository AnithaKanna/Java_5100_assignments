import java.util.Random;

public class Deck extends GroupOfCards {

        final int DeckSize = 52;



        Deck(){
            super(52);
            Suit[] a = {Suit.SPADES,Suit.CLUBS,Suit.DIAMONDS,Suit.HEARTS};
            Spot[] b ={Spot.TWO,Spot.THREE,Spot.FOUR,Spot.FIVE,Spot.SIX,Spot.SEVEN,Spot.EIGHT,Spot.NINE,Spot.TEN,Spot.JACK,Spot.QUEEN,Spot.KING,Spot.ACE};
            for (int i=0;i<4;i++){
                for(int j=0;j<13;j++){
                    super.addCard(new Card(b[j],a[i]));
                }

            }
        }


        void reset(){
            super.discardAll();
            Suit[] a = {Suit.SPADES,Suit.CLUBS,Suit.DIAMONDS,Suit.HEARTS};
            Spot[] b ={Spot.TWO,Spot.THREE};
            for (int i=0;i<4;i++){
                for(int j=0;j<13;j++){
                    super.addCard(new Card(b[j],a[i]));
                }
        }
        }


        void shuffleOnce(int n){

            Card[] arr = (Card[])cards.toArray();
            for(int i=0;i<n;i++){
                Card temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;

            }
            super.discardAll();
            for(int i=0;i<arr.length;i++)
            {
                super.addCard(arr[i]);
            }

        }


        void shuffle(int times){
            Random r = new Random();
            for(int i =0;i<times;i++){
                int b = r.nextInt(26)+13;
                shuffleOnce(b);
                System.out.println("Deck is shuffled");
            }
        }


        Card deal() throws Exception{
            if(super.getCurrentSize()>0){
                return super.deleteCard();
            }
            else{
                reset();
                throw new Exception("Deck empty");

            }

        }


        int cardsLeft(){
            return super.getCurrentSize();
        }


    }

