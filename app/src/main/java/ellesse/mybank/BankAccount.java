package ellesse.mybank;

import android.util.Log;

/**
 * Created by lsdejardin on 05/02/15.
 */
public class BankAccount {


    private static final String TAG="BankAccount";

    private double mBalance;
    // do not rely on instantiation: static
    public static final double OVERDRAFT_FEE =30;


    public BankAccount(){
        mBalance =0;
        Log.d(TAG, "BankAccount initialized with 0$");}

    public void deposit(double input_amount){
        mBalance +=input_amount;
        Log.d(TAG, "BankAccount credited with "+input_amount);
    }

    public void withdraw(double input_amount){
        mBalance -=input_amount;
        if(mBalance<0){mBalance-=30;}
        Log.d(TAG, "BankAccount debited with "+input_amount);
    }

    public double status(){

        Log.d(TAG, "BankAccount current is "+ mBalance);
        return mBalance;
    }
}
