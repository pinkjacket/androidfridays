package pinkjacket.swordslist;

import android.content.Context;
import android.widget.ArrayAdapter;

public class SwordsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mSwords;
    private String[] mSwordFacts;

    public SwordsArrayAdapter(Context mContext, int resource, String[] mSwords, String[] mSwordFacts){
        super(mContext, resource);
        this.mContext = mContext;
        this.mSwords = mSwords;
        this.mSwordFacts = mSwordFacts;
    }

    @Override
    public Object getItem(int position){
        String sword = mSwords[position];
        String swordFact = mSwordFacts[position];
        return String.format("%s \nFact: %s", sword, swordFact);
    }

    @Override
    public int getCount(){
        return mSwords.length;
    }
}
