package pinkjacket.swordslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity {
    @BindView(R.id.swordListView) ListView mSwordListView;
    private String[] swords = new String[] {"Moonlight Greatsword", "Buster Sword", "Brightkiller", "Swords of Night and Day", "Callandor", "Sword of Obedience", "Great Knife", "Orcrist", "Caladbolg", "Zirael", "Sihill", "Hrunting", "Swords of Blood and Fire", "Master Sword", "Shikomizue"};
    private String[] swordFacts = new String[] {"Recurring weapon in Dark Souls", "Cloud Strife's signature weapon", "The Christ-blade", "Wielded by Skilgannon the Damned", "The Sword that is not a Sword", "Restrains ghosts", "Used by Pyramid Head", "Kills orcs", "This one's Welsh!", "One of Geralt's swords", "Geralt's other sword", "Beowulf's sword", "Better than the Swords of Night and Day", "From Zelda! (Link's the one who uses it though)", "Blind hero's katana"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);

        SwordsArrayAdapter adapter = new SwordsArrayAdapter(this, android.R.layout.simple_list_item_1, swords, swordFacts);
        mSwordListView.setAdapter(adapter);
    }
}
