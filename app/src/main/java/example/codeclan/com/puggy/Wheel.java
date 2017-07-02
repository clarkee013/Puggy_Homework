package example.codeclan.com.puggy;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by user on 30/06/2017.
 */

public class Wheel {
    
    Symbol symbol;
    ArrayList<Symbol> wheel1;
    ArrayList<Symbol> wheel2;
    ArrayList<Symbol> wheel3;


    public Wheel() {
        wheel1 = new ArrayList<>();
        wheel2 = new ArrayList<>();
        wheel3 = new ArrayList<>();
        populate();
        ArrayList<Symbol> spinResult;
    }

    public ArrayList<Symbol> getwheel1() {
        return wheel1;
    }
    public ArrayList<Symbol> getWheel2(){
        return wheel2;
    }
    public ArrayList<Symbol> getWheel3(){
        return wheel3;
    }

    public int symbolValue() {
        return this.symbol.getValue();
    }

    public void populate() {
            wheel1.add(symbol);
            wheel2.add(symbol);
            wheel3.add(symbol);
        }

    public int getWheel1Size(){
        return wheel1.size();
    }

    public void spinWheel1(){
        Collections.shuffle(wheel1);
    }

    public Symbol getSpinResultWheel1(){
        return wheel1.get(0);
    }

    public int getWheel2Size(){
        return wheel2.size();
    }

    public void spinWheel2(){
        Collections.shuffle(wheel2);
    }

    public Symbol getSpinResultWheel2(){
        return wheel2.get(0);
    }

    public int getWheel3Size(){
        return wheel3.size();
    }

    public void spinWheel3(){
        Collections.shuffle(wheel3);
    }

    public Symbol getSpinResultWheel3(){
        return wheel3.get(0);
    }

    public ArrayList<Symbol> allSpinResult;{
        allSpinResult.add(getSpinResultWheel1());
        allSpinResult.add(getSpinResultWheel2());
        allSpinResult.add(getSpinResultWheel3());
    }

//    public static int getSpinResultSize()throws Exception{
//        return allSpinResult.size();
//    }
}