package basic.java200.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardCase {

    private List<Card> cards = new ArrayList<>();

    public CardCase() {
        cards.clear();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public int count() {
        return cards.size();
    }

    public Card getCard(int idx) {
        return cards.get(idx);
    }

    public void make() {
        cards.clear();
        int suit = CardUtil.SUIT.length;
        int valu = CardUtil.VALU.length;
        int count = 0;

        while (count != (valu * suit)) {
            Card c = new Card();
            if (!cards.contains(c)) {
                cards.add(c);
                count ++;
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void print() {
        int valu = CardUtil.VALU.length;
        for (int i=0; i< cards.size(); i++) {
            Card c = cards.get(i);
            System.out.printf("%s ", c.toString());
            if ((i + 1 % valu) == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("========================== 1. 생성 ");
        CardCase cardCase = new CardCase();
        cardCase.make();
        cardCase.print();
        System.out.println("\n========================== 2. 섞기 ");
        cardCase.shuffle();
        cardCase.print();
        System.out.println("\n========================== 3. 또 섞기 ");
        cardCase.shuffle();
        cardCase.print();
    }
}
