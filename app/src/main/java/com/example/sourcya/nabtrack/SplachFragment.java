package com.example.sourcya.nabtrack;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by m-ismail on 04/01/18.
 */

public class SplachFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        RelativeLayout relativeLayout = (RelativeLayout) inflater.inflate(R.layout.splash_screen,container,false);

        ImageView imageView = relativeLayout.findViewById(R.id.homeIcon);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(getActivity(),
                R.animator.splach_screen);
        animatorSet.setTarget(imageView);
        animatorSet.start();


        return relativeLayout;
    }
}
