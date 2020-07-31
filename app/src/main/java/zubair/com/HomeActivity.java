package zubair.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private EditText User;
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        User = (EditText)findViewById(R.id.userName);
        Submit = (Button)findViewById(R.id.btnNext);



        Submit.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                getUser( User.getText().toString());
            }
        });
    }

    private void getUser (String appUser){
        if((appUser.equals(""))){
            Toast.makeText(HomeActivity.this, "Please enter a Valid Username", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent(HomeActivity.this, MenuActivity.class);
            intent.putExtra("UserWelcome", User.getText().toString());
            startActivity(intent);
        }
    }
}