package example.codeclan.com.puggy;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 30/06/2017.
 */

public class FruitMachine {

    Player player;
    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;
    ArrayList<Symbol> wheel;



    public FruitMachine() throws Exception {
        this.player = new Player(5);
        this.wheel1 = new Wheel();
        this.wheel2 = new Wheel();
        this.wheel3 = new Wheel();
        spinWheels();


    }

    public void spinWheels(){
        this.wheel1.spinWheel1();
        this.wheel2.spinWheel2();
        this.wheel3.spinWheel3();
    }

//    public ArrayList<Symbol> allSpinResults() throws Exception{
//        spinResults.add(barrel1.getSpinResult());
//        spinResults.add(barrel2.getSpinResult());
//        spinResults.add(barrel3.getSpinResult());
//        return allSpinResults();
//    }
//
//    public ArrayList<Symbol> allSpinResults() throws Exception{
//        allSpinResults().add(barrel1.getSpinResult());
//        allSpinResults().add(barrel2.getSpinResult());
//        allSpinResults().add(barrel3.getSpinResult());
//        return allSpinResults();
//    }


}
