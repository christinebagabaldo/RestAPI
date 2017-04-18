package wanda.coffee.restapi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Christine on 4/18/2017.
 */

public class MainActivity extends Activity {
    EditText edtName, edtPrice, edtQuantity;
    Button btnSubmit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        edtName=(EditText) findViewById(R.id.edtName);
        edtPrice=(EditText) findViewById(R.id.edtPrice);
        edtQuantity=(EditText) findViewById(R.id.edtQuantity);

        btnSubmit=(Button) findViewById(R.id.btnSubmit);




    }
}
