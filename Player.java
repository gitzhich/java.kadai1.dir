package kadai1;

public class Player {
    int sumCards = 0;
    Cards playerCards = new Cards();

    Player() {
        playerCards.addCard();
        playerCards.addCard();
        sumCards = playerCards.culSum();
    }

    void hitOneCard() {
        playerCards.addCard();
        sumCards = playerCards.culSum();
    }
}
