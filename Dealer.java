package kadai1;

public class Dealer {
    int sumCards = 0;
    Cards dealerCards = new Cards();

    Dealer() {
        dealerCards.addCard();
        dealerCards.addCard();
        sumCards = dealerCards.culSum();
    }

    boolean successHit() {
        if (sumCards <= 17) {
            hitOneCard();
            return true;
        } else {
            return false;
        }
    }

    void hitOneCard() {
        dealerCards.addCard();
        sumCards = dealerCards.culSum();
    }
}
