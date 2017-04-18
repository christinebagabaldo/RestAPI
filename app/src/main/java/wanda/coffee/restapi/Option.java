package wanda.coffee.restapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Christine on 4/18/2017.
 */

public class Option extends Activity {

    Button btnPost, btnGet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option);

        btnPost=(Button) findViewById(R.id.btnPost);
        btnGet=(Button) findViewById(R.id.btnGet);


        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Option.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Option.this, GetData.class);
                startActivity(intent);

            }
        });
    }
}