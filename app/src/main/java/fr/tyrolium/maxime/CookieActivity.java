package fr.tyrolium.maxime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CookieActivity extends AppCompatActivity {

    private Button back;
    private TextView points;
    private ImageView cookie;
    private int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);

        this.points = (TextView) findViewById(R.id.points);
        this.cookie = (ImageView) findViewById(R.id.cookie);
        this.back = (Button) findViewById(R.id.back);

        cookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                points.setText("Points : "+ clicks);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivities(new Intent[]{otherActivity});
                finish();
            }
        });

    }
}