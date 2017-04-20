package quyntg94.techkids.vn.s4kids.viewholders;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.models.Letter;

/**
 * Created by quyntg94 on 19/04/2017.
 */

public class LearningViewHolder extends ViewHolder{

    TextView tvLetter;

    public LearningViewHolder(View itemView) {
        super(itemView);
        tvLetter = (TextView) itemView.findViewById(R.id.tv_letter);
    }

    public void setLetter(Letter letter){
        tvLetter.setText(letter.getName());
        itemView.setTag(letter);

    }
}
