package zubair.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//https://github.com/zubairvo/TravelList
public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = (EditText)findViewById(R.id.loginName);
        Password = (EditText)findViewById(R.id.LoginPassword);
        Login = (Button)findViewById(R.id.LoginBtn);

        Login.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                validate( Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate (String userName, String userPassword){
        if((userName.equals("Admin")) && (userPassword.equals("123"))){
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(MainActivity.this, "Invalid Login, Please try again", Toast.LENGTH_SHORT).show();
        }
    }
}