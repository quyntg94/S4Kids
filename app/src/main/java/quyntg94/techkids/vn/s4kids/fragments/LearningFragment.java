package quyntg94.techkids.vn.s4kids.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.greenrobot.eventbus.EventBus;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.activities.MainActivity;
import quyntg94.techkids.vn.s4kids.adapters.LearningAdapter;
import quyntg94.techkids.vn.s4kids.events.EventLetter;
import quyntg94.techkids.vn.s4kids.models.Letter;

/**
 * A simple {@link Fragment} subclass.
 */
public class LearningFragment extends Fragment implements View.OnClickListener{

    private LearningAdapter learningAdapter;
    private RecyclerView rvLetter;
    private Letter letter;

    public LearningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_learning, container, false);
        rvLetter = (RecyclerView) view.findViewById(R.id.rv_letter);
        setupUI();
        return view;
    }

    private void setupUI() {
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rvLetter.setLayoutManager(layoutManager);

        loadData();
    }

    private void loadData() {
        learningAdapter = new LearningAdapter();
        learningAdapter.setOnItemClickListener(this);
        rvLetter.setAdapter(learningAdapter);
        learningAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        letter = (Letter) v.getTag();
        EventBus.getDefault().postSticky(new EventLetter(letter));
        changeFragment(new LetterFragment());
    }

    public void changeFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_sub_container, fragment);
        fragmentTransaction.commit();
    }
}
