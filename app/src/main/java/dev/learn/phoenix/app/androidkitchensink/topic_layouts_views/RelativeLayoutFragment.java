package dev.learn.phoenix.app.androidkitchensink.topic_layouts_views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.learn.phoenix.app.androidkitchensink.R;

/**
 * Created by sudharti on 7/27/17.
 */
public class RelativeLayoutFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_relative_layout, container, false);
        return view;
    }
}
