package example.codeclan.com.puggy;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 30/06/2017.
 */

public class FruitMachine {

    Player player;
    Wheel barrel1;
    Wheel barrel2;
    Wheel barrel3;
    ArrayList<Symbol>spinResults;
    ArrayList<Symbol>barrel;
    int randomlySelectedIndex;


    public FruitMachine() throws Exception {
        this.player = new Player(5);
        this.barrel1 = new Wheel();
        this.barrel2 = new Wheel();
        this.barrel3 = new Wheel();
        spinWheels();


    }

    public void spinWheels(){
        this.barrel1.spin();
        this.barrel2.spin();
        this.barrel3.spin();
    }

//    public ArrayList<Symbol> allSpinResults() throws Exception{
//        spinResults.add(barrel1.getSpinResult());
//        spinResults.add(barrel2.getSpinResult());
//        spinResults.add(barrel3.getSpinResult());
//        return allSpinResults();
//    }

    public ArrayList<Symbol> allSpinResults() throws Exception{
        allSpinResults().add(barrel1.getSpinResult());
        allSpinResults().add(barrel2.getSpinResult());
        allSpinResults().add(barrel3.getSpinResult());
        return allSpinResults();
    }


}
