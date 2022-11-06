package com.abesit.amritotsavabesit;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CodeFragmentAdapter extends FragmentStateAdapter {
    public CodeFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    @Override
    public Fragment createFragment(int position) {
        if(position==0){
            return new C_code();
        }
        else if(position==1){
            return new Java_code();
        }
        else{
            return new Python_code();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
