package zubair.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

        private TextView UserWelcome;
        private String Username;
        private Button AboutBtn;
        private Button DevBtn;
        private Button CalcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            Username = extras.getString( "UserWelcome");
            TextView UserWelcome = (TextView) findViewById(R.id.userWelcome);
            UserWelcome.setText( Username +"," + " " + "Welcome to the Momentum App" );
        }



        Button homeBtn = (Button) findViewById(R.id.btnHome);
        homeBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                homePage();
            }
        });

        CalcBtn = (Button)findViewById(R.id.btnCalc);
        CalcBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                calcPage();
            }
        });

        DevBtn = (Button)findViewById(R.id.btnProfile);
        DevBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                devPage();
            }
        });

        AboutBtn = (Button)findViewById(R.id.btnAbout);
        AboutBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                aboutPage();
            }
        });

    }

    public void homePage(){
        Intent intent = new Intent(MenuActivity.this, HomeActivity.class);
        startActivity(intent);
    }

    public void calcPage(){
        Intent intent = new Intent(MenuActivity.this, CalcActivity.class);
        startActivity(intent);
    }

    public void aboutPage(){
        Intent intent = new Intent(MenuActivity.this, AboutMeActivity.class);
        startActivity(intent);
    }

    public void devPage(){
        Intent intent = new Intent(MenuActivity.this, DevProfileActivity.class);
        startActivity(intent);
    }
}