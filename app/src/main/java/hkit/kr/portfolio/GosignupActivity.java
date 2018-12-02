package hkit.kr.portfolio;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

public class GosignupActivity extends AppCompatActivity {
    NumberPicker year_picker_btn, month_picker_btn, day_picker_btn;
    Button email_btn;
    EditText name_btn, phone_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gosignup);
        year_picker_btn=findViewById(R.id.year_picker_btn);
        year_picker_btn.setOnValueChangedListener(year_picker_btn_click);
        month_picker_btn = findViewById(R.id.month_picker_btn);
        month_picker_btn.setOnValueChangedListener(month_picker_btn_click);
        day_picker_btn=findViewById(R.id.day_picker_btn);
        day_picker_btn.setOnValueChangedListener(day_picker_btn_click);
        email_btn = findViewById(R.id.email_btn);
        email_btn.setOnClickListener(email_btn_click);
        name_btn = findViewById(R.id.name_btn);
        phone_btn = findViewById(R.id.phone_btn);
    }

    @Override
    //메뉴와 연결(액션바사용)
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.call) {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:0539520008"));
            startActivity(intent);
        }if(id == R.id.logo){
            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    View.OnClickListener email_btn_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent email = new Intent(Intent.ACTION_SEND);
            String address = ""; //학원이메일주소값
            email.putExtra(Intent.EXTRA_EMAIL, address);
            email.putExtra(Intent.EXTRA_TEXT, name_btn.getText().toString());
            /*email.putExtra(Intent.EXTRA_TEXT, ) 체크박스 넘길 값*/
            /*  email.putExtra() 생년월일 보낼 값*/
            email.putExtra(Intent.EXTRA_TEXT, phone_btn.getText().toString());
            startActivity(email);

        }
    };
    NumberPicker.OnValueChangeListener year_picker_btn_click =  new NumberPicker.OnValueChangeListener() {
        @Override
        public void onValueChange(NumberPicker numberPicker, int i, int i1) {
            year_picker_btn.setMinValue(1100);
            year_picker_btn.setMaxValue(2030);
        }
    };
    NumberPicker.OnValueChangeListener month_picker_btn_click =  new NumberPicker.OnValueChangeListener() {
        @Override
        public void onValueChange(NumberPicker numberPicker, int i, int i1) {
            month_picker_btn.setMinValue(1);
            month_picker_btn.setMaxValue(12);
        }
    };
    NumberPicker.OnValueChangeListener day_picker_btn_click = new NumberPicker.OnValueChangeListener() {
        @Override
        public void onValueChange(NumberPicker numberPicker, int i, int i1) {
            day_picker_btn.setMinValue(1);
            day_picker_btn.setMaxValue(31);
        }
    };
}
