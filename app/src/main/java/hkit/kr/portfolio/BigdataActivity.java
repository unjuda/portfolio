package hkit.kr.portfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BigdataActivity extends AppCompatActivity {
    Button bigbatasingup_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigdata);
        bigbatasingup_btn = (Button)findViewById(R.id.bigbatasingup_btn);
        bigbatasingup_btn.setOnClickListener(click);
    }
    View.OnClickListener click = new View.OnClickListener() {
        @Override

        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(),SignupActivity.class);
            startActivity(intent);
        }
    };
}
