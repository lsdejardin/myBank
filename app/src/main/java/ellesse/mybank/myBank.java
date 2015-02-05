package ellesse.mybank;

import android.util.Log;

/**
 * Created by lsdejardin on 05/02/15.
 */
public class myBank {

    private int amount;


    public myBank(){
        amount=0;
        Log.d("myBank", "myBank initialized with 0$");}

    public void deposit(int input_amount){
        amount=amount+input_amount;
        Log.d("myBank", "myBank credited with "+input_amount);
    }

    public void withdraw(int input_amount){
        amount=amount-input_amount;
        Log.d("myBank", "myBank debited with "+input_amount);
    }

    public String status(){

        Log.d("myBank", "myBank current is "+ amount);
        return "Current: "+amount;
    }
}
