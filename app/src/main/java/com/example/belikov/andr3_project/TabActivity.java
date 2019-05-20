package com.example.belikov.andr3_project;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.belikov.andr3_project.fragments.Fragment1;
import com.example.belikov.andr3_project.fragments.Fragment2;
import com.example.belikov.andr3_project.fragments.Fragment3;
import com.example.belikov.andr3_project.tabs.FragmentAdapter;

public class TabActivity extends AppCompatActivity {

    private int themeNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        themeNumber = getIntent().getIntExtra(SecondActivity.THEME, 0);

        switch (themeNumber){
            case 0:
                setTheme(R.style.AppTheme_NoActionBar);
                break;
            case 1:
                setTheme(R.style.AppTheme_NoActionBar_Theme1);
                break;
            case 2:
                setTheme(R.style.AppTheme_NoActionBar_Theme2);
                break;
        }

        setContentView(R.layout.activity_tab2);

        Fragment fragment1 = Fragment1.newInstance(null);
        Fragment fragment2 = Fragment2.newInstance(null);
        Fragment fragment3 = Fragment3.newInstance(null);

        FragmentAdapter fragmentAdapter= new FragmentAdapter(getSupportFragmentManager());

        fragmentAdapter.addFragment(fragment1, "image 1");
        fragmentAdapter.addFragment(fragment2, "image 2");
        fragmentAdapter.addFragment(fragment3, "image 3");

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(fragmentAdapter);
        TabLayout tab = findViewById(R.id.tab);
        tab.setupWithViewPager(viewPager);
    }
}
