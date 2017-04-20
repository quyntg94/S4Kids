package quyntg94.techkids.vn.s4kids.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.applications.KidApplication;
import quyntg94.techkids.vn.s4kids.databases.KidsDatabase;
import quyntg94.techkids.vn.s4kids.models.Letter;
import quyntg94.techkids.vn.s4kids.viewholders.LearningViewHolder;

/**
 * Created by quyntg94 on 19/04/2017.
 */

public class LearningAdapter extends RecyclerView.Adapter<LearningViewHolder>{

    private KidsDatabase kidsDatabase = KidApplication.getInstance().getKidsDatabase();
    private List<Letter> letterList = kidsDatabase.loadAllLetter(); //lấy hết data ra và lưu vào 1 list

    //khai báo hàm onclick cho recycleview
    private View.OnClickListener onItemClickListener;

    public void setOnItemClickListener(View.OnClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public int getItemViewType(int position) {

        return position % 2;
    }

    @Override
    public LearningViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //set UI cho từng view nhỏ trong recycleview (item)
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView =  layoutInflater.inflate(R.layout.item_learning, parent, false);
        return new LearningViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(LearningViewHolder holder, int position) {
        holder.itemView.setOnClickListener(onItemClickListener); //set onclick cho từng view
        holder.setLetter(letterList.get(position)); //set data cho từng view
    }

    @Override
    public int getItemCount() {
        //set số lượng view theo số lương item trong list đã load
        return letterList.size();
    }


}
