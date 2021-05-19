package sg.edu.rp.c346.id20022678.demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String q = intentReceived.getStringExtra("Question");
        String a = intentReceived.getStringExtra("Answer");
        tvAnswer.setText(q + " answer is: " + a);
    }
}