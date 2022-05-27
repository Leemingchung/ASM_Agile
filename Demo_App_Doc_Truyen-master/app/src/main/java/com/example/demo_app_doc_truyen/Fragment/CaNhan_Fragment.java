package com.example.demo_app_doc_truyen.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.demo_app_doc_truyen.Adapter.TapAdapter;
import com.example.demo_app_doc_truyen.R;
import com.example.demo_app_doc_truyen.ThongTin_Activity;
import com.google.android.material.tabs.TabLayout;


public class CaNhan_Fragment extends Fragment {
    TabLayout tabLayout;
    ViewPager viewPager;
    ImageView iconThongTin;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ca_nhan_,container,false);
        tabLayout = view.findViewById(R.id.tap_layout);
        viewPager = view.findViewById(R.id.viewPage);
        iconThongTin = view.findViewById(R.id.iconThongTin);
        TapAdapter tapAdapter = new TapAdapter(getActivity().getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(tapAdapter);
        tabLayout.setupWithViewPager(viewPager);
        iconThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), ThongTin_Activity.class);
                startActivity(intent);
            }
        });
        return view;

    }
}