package quyntg94.techkids.vn.s4kids.fragments.resultsScreen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.events.EventTime;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorResultFragment extends Fragment {

    private TextView tvColorResult;
    private String time;

    public ColorResultFragment() {
        // Required empty public constructor
    }

    @Subscribe(sticky = true)
    public void receiveInfo(EventTime event) {
        this.time = event.getTime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_color_result, container, false);
        if(!EventBus.getDefault().isRegistered(this)){
            EventBus.getDefault().register(this);
        }
        tvColorResult = (TextView) view.findViewById(R.id.tv_color_result);
        tvColorResult.setText("Thời gian: " + time);
        return view;
    }

}
