package pinkjacket.swordslist;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.titleTextView) TextView mTitleTextView;
    @BindView(R.id.noteEditText) EditText mNoteEditText;
    @BindView(R.id.noteButton) Button mNoteButton;
    @BindView(R.id.listButton) Button mListButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface aquiline = Typeface.createFromAsset(getAssets(), "fonts/aquiline.ttf");
        mTitleTextView.setTypeface(aquiline);

        mNoteButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String note = mNoteEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, NoteActivity.class);
                intent.putExtra("note", note);
                startActivity(intent);
            }
        });

    }
}
