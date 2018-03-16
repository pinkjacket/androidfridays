package pinkjacket.swordslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity {
    @BindView(R.id.swordListView) ListView mSwordListView;
    private String[] swords = new String[] {"Moonlight Greatsword", "Buster Sword", "Brightkiller", "Swords of Night and Day", "Callandor", "Sword of Obedience", "Great Knife", "Orcrist", "Anduril", "Zirael", "Sihill", "Hrunting", "Swords of Blood and Fire", "Master Sword", "Shikomizue"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, swords);
        mSwordListView.setAdapter(adapter);
    }
}
