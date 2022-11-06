package com.abesit.amritotsavabesit;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class LogoFragmentAdapter extends FragmentStateAdapter {
    public LogoFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    @Override
    public Fragment createFragment(int position) {
        if(position==0){
            return new logoquiz();
        }
        else{
            return new Deptquiz();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
