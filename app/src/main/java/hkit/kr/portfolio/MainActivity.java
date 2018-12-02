package hkit.kr.portfolio;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button electronic_btn, bigdata_btn,block_btn,infomation_btn,medical_btn,block1_btn,
            virtualization_btn,selfdriving_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        electronic_btn = findViewById(R.id.electronic_btn);
        electronic_btn.setOnClickListener(click);
        bigdata_btn = findViewById(R.id.bigbata_btn);
        bigdata_btn.setOnClickListener(click0);
        block_btn = findViewById(R.id.block_btn);
        block_btn.setOnClickListener(clcik0);
        infomation_btn=findViewById(R.id.infomation_btn);
        infomation_btn.setOnClickListener(infomation_btn_click);
        medical_btn = findViewById(R.id.medical_btn);
        medical_btn.setOnClickListener(medical_btn_click);
        block1_btn = findViewById(R.id.block1_btn);
        block1_btn.setOnClickListener(block1_btn_click);
        virtualization_btn = findViewById(R.id.virtualization_btn);
        virtualization_btn.setOnClickListener(virtualization_btn_click);
        selfdriving_btn = findViewById(R.id.selfdriving_btn);
        selfdriving_btn.setOnClickListener(selfdriving_btn_click);
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

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), ElectronicActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener click0 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), BigdataActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener clcik0 =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), blockActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener infomation_btn_click =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), InfomationActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener medical_btn_click =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), MedicalActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener block1_btn_click =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), block1Activity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener virtualization_btn_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), VirtualizationActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener selfdriving_btn_click =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), selfdrivingActivity.class);
            startActivity(intent);
        }
    };
}
