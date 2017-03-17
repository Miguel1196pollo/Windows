package mx.edu.utng.windows;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Toshiba on 12/01/2017.
 */
public class SecondActivity extends AppCompatActivity {
    private TextView txvSayHello;
    private Button btnGoesEnd;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        txvSayHello = (TextView)findViewById(R.id.txv_say_hello);
        btnGoesEnd = (Button) findViewById(R.id.btn_goes_end);
        Bundle bundle = getIntent().getExtras();
        txvSayHello.setText("Hello "+bundle.getString("name")+"!");
        btnGoesEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, TirthActivity.class));
                finish();
            }
        });
    }
}
