package com.cookandroid.waterappex;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    // FrameLayout에 각 메뉴의 Fragment를 바꿔 줌
    private FragmentManager fragmentManager = getSupportFragmentManager();
    // 4개의 메뉴에 들어갈 Fragment들
    private AlarmFragment alarmFragment = new AlarmFragment();
    private MainFragment mainFragment = new MainFragment();
    private TodaysFragment todaysFragment = new TodaysFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        // 첫 화면 지정
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, alarmFragment).commitAllowingStateLoss();

        // bottomNavigationView의 아이템이 선택될 때 호출될 리스너 등록
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (item.getItemId()) {
                    case R.id.menuitem_bottombar_Alarm: {
                        transaction.replace(R.id.frame_layout, alarmFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.menuitem_bottombar_Main: {
                        transaction.replace(R.id.frame_layout, mainFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.menuitem_bottombar_Todays: {
                        transaction.replace(R.id.frame_layout, todaysFragment).commitAllowingStateLoss();
                        break;
                    }
                }
                return true;
            }
        });
    }
}