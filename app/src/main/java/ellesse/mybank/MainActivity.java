package ellesse.mybank;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    EditText input_amount;
    Button deposit;
    Button withdraw;
    TextView balance;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final myBank myBank = new myBank();

        myBank.deposit(100);
        myBank.withdraw(20);
        myBank.status();

        balance= (TextView) findViewById(R.id.balance_display);
        balance.setText(myBank.status());


        input_amount=(EditText) findViewById(R.id.input_amount_field);
        deposit=(Button) findViewById(R.id.deposit_button);
        withdraw=(Button) findViewById(R.id.withdraw_button);

        deposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { myBank.deposit((int) input_amount.);
                balance.setText(myBank.status());

            }
        });

        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                public void onClick(View v) { myBank.withdraw((int) input_amount.getText().toString());
                    balance.setText(myBank.status());


                }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
