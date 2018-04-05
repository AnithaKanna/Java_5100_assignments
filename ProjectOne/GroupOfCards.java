import java.util.List;

public class GroupOfCards {
    List<Card> cards;

    int TopCard;
    GroupOfCards(int num){
        TopCard=-1;
        System.out.println("group of cards created");
    };

    void addCard(Card c){
        cards.add(c);
        TopCard++;

    };


    void discardAll(){
        cards.clear();
    };


    int getCurrentSize(){
        return cards.size();
    }


    void display(){
        for (int i=0;i<cards.size();i++){
            System.out.println("Cards are:"+cards.get(i).toString());

        }
    }


    Card deleteCard(){
        Card top = cards.get(TopCard);
        cards.remove(TopCard);
        TopCard--;
        System.out.println( " deleted");
        return top;
        }



}

