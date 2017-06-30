package example.codeclan.com.puggy;

import java.util.ArrayList;
import java.util.Collections;

import static android.media.CamcorderProfile.get;

/**
 * Created by user on 30/06/2017.
 */

public class Wheel {

    Symbol symbol;
    ArrayList<Symbol> barrel;


    public Wheel() {
        barrel = new ArrayList<Symbol>();
        populate();
    }

    public ArrayList<Symbol> getBarrel() {
        return barrel;
    }

    public int symbolValue() {
        return this.symbol.getValue();
    }

    public void populate() {
        for (Symbol symbol : Symbol.values()) {
            barrel.add(symbol);
        }
    }

    public int getBarrelSize(){
        return barrel.size();
    }

    public void spin(){
        Collections.shuffle(barrel);
    }

    public Symbol getSpinResult(){
        return barrel.get(0);
    }



}