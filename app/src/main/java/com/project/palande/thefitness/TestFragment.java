package com.project.palande.thefitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by mane on 13/03/18.
 */

public class TestFragment extends Fragment {
    private CardView muscleBuildingCard;
    private CardView armsBuildingCard;
    private CardView absWorkoutCard;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState) {
        View view = inflater.inflate(R.layout.fragemnt_layout, container, false);

        muscleBuildingCard = (CardView) view.findViewById(R.id.muscle_card);
        muscleBuildingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = UpperBodyContentActivity.newIntent(getActivity());
                startActivity(intent);
            }
        });

        armsBuildingCard = (CardView) view.findViewById(R.id.arms_card);
        armsBuildingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = ScrollingArmsActivity.newIntent(getActivity());
                startActivity(intent);
            }
        });

        absWorkoutCard = (CardView) view.findViewById(R.id.abs_card);
        absWorkoutCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = ScrollingAbsActivity.newIntent(getActivity());
                startActivity(intent);
            }
        });

        return view;
    }

}
