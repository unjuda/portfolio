package hkit.kr.portfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class selfdrivingActivity extends AppCompatActivity {
    Button singup_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfdriving);
        singup_btn = findViewById(R.id.singup_btn);
        singup_btn.setOnClickListener(singup_btn_click);
    }

    @Override
    //메뉴와 연결(액션바사용)
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //전화다이얼연결
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.call) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:0539520008"));
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    };
    View.OnClickListener singup_btn_click =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), SignupActivity.class);
            startActivity(intent);
        }
    };
}
