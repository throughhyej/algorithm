package basic.java200.card;

import java.util.Objects;

public class Card {

    private String cardVal;

    public Card() {
        int deck = (int) (Math.random() * CardUtil.SUIT.length); // 2
        int suit = (int) (Math.random() * CardUtil.VALU.length); // 10
        cardVal = CardUtil.SUIT[deck] + CardUtil.VALU[suit];
    };
    public Card(String cardVal) {
        this.cardVal = cardVal;
    }

    public Card(Card c) {
        this(c.getCardVal());
    }

    public String getCardVal() {
        return cardVal;
    }

    public void setCardVal(String cardVal) {
        this.cardVal = cardVal;
    }

    @Override
    public String toString() {
        return "[" + cardVal + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cardVal, card.cardVal);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cardVal == null) ? 0 : cardVal.hashCode());
        return result;
    }
}
