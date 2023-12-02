package fr.tyrolium.maxime;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button play;
    private Button play2;
    private Button popup;
    private MainActivity myactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.play = (Button) findViewById(R.id.play);
        this.play2 = (Button) findViewById(R.id.play2);
        this.popup = (Button) findViewById(R.id.popup);
        this.myactivity = this;

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), CookieActivity.class);
                startActivities(new Intent[]{otherActivity});
                finish();
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity2 = new Intent(getApplicationContext(), SecondActivity.class);
                startActivities(new Intent[]{otherActivity2});
                finish();
            }
        });

        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder myPopup = new AlertDialog.Builder(myactivity);
                myPopup.setTitle("Coucou le titre");
                myPopup.setMessage("Salut je suis une descri");
                myPopup.setPositiveButton("OUI", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Vous avez cliquer sur Oui", Toast.LENGTH_SHORT).show();

                    }
                });
                myPopup.setNegativeButton("NON", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Vous n'etes pas d'accord ! ", Toast.LENGTH_SHORT).show();

                    }
                });

                myPopup.show();

            }
        });

    }
}