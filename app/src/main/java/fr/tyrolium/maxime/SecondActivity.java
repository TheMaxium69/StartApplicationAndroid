package fr.tyrolium.maxime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private LinearLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        this.myLayout = (LinearLayout) findViewById(R.id.myDynamicLayout);

        ImageView image = new ImageView(this);
        ViewGroup.LayoutParams params = new ActionBar.LayoutParams(400, 400);
        image.setLayoutParams(params);
        image.setBackgroundResource(R.drawable.logo);
        myLayout.addView(image);

        TextView text = new TextView(this);
        text.setText(getResources().getString(R.string.app_name));
        text.setTextColor(getResources().getColor(R.color.red));
        text.setTextSize(25);
        myLayout.addView(text);

        int textSize = 15;

        for (int i = 0; i < 6; i++){
            Button button = new Button(this);
            button.setText("Button " + 1);
            button.setTextSize(textSize);
            myLayout.addView(button);
            textSize += 5;

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent otherActivity = new Intent(getApplicationContext(), MainActivity.class);
                    startActivities(new Intent[]{otherActivity});
                    finish();
                }
            });
        }



    }
}