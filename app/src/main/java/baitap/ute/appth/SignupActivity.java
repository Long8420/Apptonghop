package baitap.ute.appth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btn = findViewById(R.id.dnhap);
    }

    public void gotoback(View view) {

        Intent in = new Intent(SignupActivity.this, MainActivity.class);
        startActivity(in);
    }
}


