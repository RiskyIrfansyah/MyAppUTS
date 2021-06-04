package com.example.MyAppUTS;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    /*
    NIM             : 10118085
    Nama            : Risky Irfansyah
    Kelas           : IF2
    Matakuliah      : Aplikasi Komputasi Bergerak
    */
    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()) {
                case R.id.home_menu:
                    f = new HomeFragment();
                    break;
                case R.id.daily_activity_menu:
                    f = new DailyActivityFragment();
                    break;
                case R.id.gallery_menu:
                    f = new GalleryFragment();
                    break;
                case R.id.music_video_menu:
                    f = new MusicVideoFragment();
                    break;
                case R.id.profile_menu:
                    f = new ProfileFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, f).commit();
            return true;
        }
    };

    public void shareToInstagram(View view) {
        Intent instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ris_fansyah/"));
        startActivity(instagram);
    }

    public void shareToFacebook(View view) {
        Intent facebook = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rizky.irfansyah.94/"));
        startActivity(facebook);
    }

    public void shareToWhatsapp(View view) {
        Intent whatsapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/081221518140"));
        startActivity(whatsapp);
    }

    public void shareToTelegram(View view) {
        Intent telegram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/HapJuy"));
        startActivity(telegram);
    }

    public void shareToGmail(View view) {
        Intent gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:kikiirfansyah39@gmail.com"));
        startActivity(gmail);
    }

    public void shareToMaps(View view) {
        Intent maps = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jl.+Lurah+No.186,+Karangmekar,+Kec.+Cimahi+Tengah,+Kota+Cimahi,+Jawa+Barat+40523/@-6.877513,107.5417853,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e445db1669f3:0x64c994626147ffbc!8m2!3d-6.877513!4d107.543974"));
        startActivity(maps);
    }

    public void about(View view) {
        com.example.MyAppUTS.DialogFragment dialogFragment = new com.example.MyAppUTS.DialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "DialogFragment");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new HomeFragment());
        bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);

    }

    private boolean loadFragment(Fragment f) {
        if (f != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, f)
                    .commit();
            return true;
        }
        return false;
    }

}
