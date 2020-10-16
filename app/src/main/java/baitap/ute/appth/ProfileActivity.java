package baitap.ute.appth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        btn = findViewById(R.id.btlv);
    }

    public void gotolist(View view) {

        Intent in = new Intent(ProfileActivity.this,List.class);
        startActivity(in);
    }
}
