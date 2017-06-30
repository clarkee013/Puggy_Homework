package example.codeclan.com.puggy;

/**
 * Created by user on 30/06/2017.
 */

public enum Symbol {

    CHERRY(1),
    LEMON(2),
    BAR(3),
    BELL(4),
    SEVEN(5),
    DIAMOND(6),
    JACKPOT(7);

    int value;

    Symbol(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
