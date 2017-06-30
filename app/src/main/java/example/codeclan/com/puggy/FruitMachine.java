package example.codeclan.com.puggy;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by user on 30/06/2017.
 */

public class FruitMachine {

    private int money;
    Player player;
    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;
    private int jackpot;

    public FruitMachine(Player player, Wheel wheel){
        this.player = new Player;
        this.wheel1 = new Wheel();
        this.wheel2 = new Wheel();
        this.wheel3 = new Wheel();
        spinWheels();
    }

    public void spinWheels(){
        this.wheel1.spin();
        this.wheel2.spin();
        this.wheel3.spin();
    }



}
