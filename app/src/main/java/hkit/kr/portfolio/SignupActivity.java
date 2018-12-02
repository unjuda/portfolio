package hkit.kr.portfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    Button check_signupbtn;
    CheckBox signup_checkbtn;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        check_signupbtn = (Button)findViewById(R.id.check_signupbtn);
        signup_checkbtn = (CheckBox)findViewById(R.id.signup_checkbtn);
        check_signupbtn.setOnClickListener(goclick);
    }
    @Override
    //메뉴와 연결(액션바사용)
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    //액션버튼동작구현

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.call) {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:0539520008"));
            startActivity(intent);
            return true;
        }if(id == R.id.logo){
            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    View.OnClickListener goclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(signup_checkbtn.isChecked()) {
                Intent intent = new Intent(getBaseContext(), GosignupActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(getBaseContext(), "개인정보보호를동의해주세요", Toast.LENGTH_LONG).show();

            }
        }
    };

}
