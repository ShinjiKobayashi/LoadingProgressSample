package com.kobashin.android.sample.loadinganimationsample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import hugo.weaving.DebugLog;


public class LoadingFragment extends Fragment {

    public LoadingFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_loading, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @DebugLog
    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        if(transit == FragmentTransaction.TRANSIT_FRAGMENT_OPEN){
            if(enter){
                return AnimationUtils.loadAnimation(getActivity(), android.R.anim.fade_in);
            }else{
                return AnimationUtils.loadAnimation(getActivity(), android.R.anim.fade_out);
            }
        }
        return super.onCreateAnimation(transit, enter, nextAnim);
    }
}
