package ellesse.mybank;

import android.util.Log;

/**
 * Created by lsdejardin on 05/02/15.
 */
public class myBank {

    private double balance;


    public myBank(){
        balance=0;
        Log.d("myBank", "myBank initialized with 0$");}

    public void deposit(double input_amount){
        balance=balance+input_amount;
        Log.d("myBank", "myBank credited with "+input_amount);
    }

    public void withdraw(double input_amount){
        balance=balance-input_amount;
        Log.d("myBank", "myBank debited with "+input_amount);
    }

    public double status(){

        Log.d("myBank", "myBank current is "+ balance);
        return balance;
    }
}
