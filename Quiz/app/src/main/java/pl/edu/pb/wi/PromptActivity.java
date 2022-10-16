package pl.edu.pb.wi;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PromptActivity extends AppCompatActivity {

    private Button answerButton;
    private TextView answerConfirm;
    private TextView answerTextView;
    private boolean correctAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompt);
        answerButton = findViewById(R.id.answer_button);
        answerConfirm = findViewById(R.id.answer_confirm);
        answerTextView = findViewById(R.id.answer_text_view);
        correctAnswer = getIntent().getBooleanExtra(MainActivity.KEY_EXTRA_ANSWER, true);

        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int answer = correctAnswer ? R.string.button_true : R.string.button_false;
                answerTextView.setText(answer);
            }
        });
    }
}