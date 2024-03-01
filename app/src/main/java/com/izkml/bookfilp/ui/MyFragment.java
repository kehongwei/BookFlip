package com.izkml.bookfilp.ui;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.izkml.bookfilp.anim.SimulationPageAnim;
import com.izkml.bookfilp.databinding.FragmentMyBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyFragment extends Fragment {

    private FragmentMyBinding binding;

    private static final String ARG_PARAM1 = "position";

    private int position;

    public MyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MyFragment.
     */
    public static MyFragment newInstance(int position) {
        MyFragment fragment = new MyFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(ARG_PARAM1);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.tvPage.setText(String.valueOf(position));

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMyBinding.inflate(inflater);
        binding.getRoot().setBackgroundColor(getRandomColor());
        return binding.getRoot();
    }

    private int getRandomColor() {
        // 生成随机颜色
        return Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }
}