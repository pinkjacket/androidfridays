package pinkjacket.swordslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NoteActivity extends AppCompatActivity {
    @BindView(R.id.noteTextView) TextView mNoteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String note = intent.getStringExtra("note");
        mNoteTextView.setText("Note: " + note);
    }
}
