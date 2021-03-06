package zubair.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {
    private EditText mEditText1;
    private EditText mEditText2;
    private TextView mTextViewResult;
    private Button mButtonAdd;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        mEditText1 = findViewById(R.id.edittext_number_1);
        mEditText2 = findViewById(R.id.edittext_number_2);
        mTextViewResult = findViewById(R.id.textView_result);
        mButtonAdd = findViewById(R.id.button_add);
        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }
                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }
                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());
                int sum = num1 * num2;
                mTextViewResult.setText(String.valueOf(sum) + "kg-m/s");
            }
        });
    }
}