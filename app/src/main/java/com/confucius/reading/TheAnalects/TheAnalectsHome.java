package com.confucius.reading.TheAnalects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import com.confucius.reading.R;

public class TheAnalectsHome extends AppCompatActivity {
    private static final String PREFS_NAME = "prefs";
    private static final String PREF_DARK_THEME = "dark_theme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean useDarkTheme = preferences.getBoolean(PREF_DARK_THEME, false);

        if (useDarkTheme) {
            setTheme(R.style.AppThemeDark);
        }
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_the_analects_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.TheAnalectsTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.XueErTitle);
        button.setOnClickListener(v -> XueEr());

        button = findViewById(R.id.WeiZhengTitle);
        button.setOnClickListener(v -> WeiZheng());

        button = findViewById(R.id.BaYiTitle);
        button.setOnClickListener(v -> BaYi());

        button = findViewById(R.id.LiRenTitle);
        button.setOnClickListener(v -> LiRen());
//
//        button = findViewById(R.id.GongYeChangTitle);
//        button.setOnClickListener(v -> GongYeChang());
//
//        button = findViewById(R.id.YongYeTitle);
//        button.setOnClickListener(v -> YongYe());
//
//        button = findViewById(R.id.ShuErTitle);
//        button.setOnClickListener(v -> ShuEr());
//
//        button = findViewById(R.id.TaiBoTitle);
//        button.setOnClickListener(v -> TaiBo());
//
//        button = findViewById(R.id.ZiHanTitle);
//        button.setOnClickListener(v -> ZiHan());
//
//        button = findViewById(R.id.XiangDangTitle);
//        button.setOnClickListener(v -> XiangDang());
//
//        button = findViewById(R.id.XianJinTitle);
//        button.setOnClickListener(v -> XianJin());
//
//        button = findViewById(R.id.YanYuanTitle);
//        button.setOnClickListener(v -> YanYuan());
//
//        button = findViewById(R.id.ZiLuTitle);
//        button.setOnClickListener(v -> ZiLu());
//
//        button = findViewById(R.id.XianWenTitle);
//        button.setOnClickListener(v -> XianWen());
//
//        button = findViewById(R.id.WeiLingGongTitle);
//        button.setOnClickListener(v -> WeiLingGong());
//
//        button = findViewById(R.id.JiShiTitle);
//        button.setOnClickListener(v -> JiShi());
//
//        button = findViewById(R.id.YangHuoTitle);
//        button.setOnClickListener(v -> YangHuo());
//
//        button = findViewById(R.id.WeiZiTitle);
//        button.setOnClickListener(v -> WeiZi());
//
//        button = findViewById(R.id.ZiZhangTitle);
//        button.setOnClickListener(v -> ZiZhang());
//
//        button = findViewById(R.id.YaoYueTitle);
//        button.setOnClickListener(v -> YaoYue());
    }

    //Activity call methods, called by buttons above
    public void XueEr() {
        Intent intent = new Intent(this, XueEr.class);
        startActivity(intent);
    }

    public void WeiZheng() {
        Intent intent = new Intent(this, WeiZheng.class);
        startActivity(intent);
    }

    public void BaYi() {
        Intent intent = new Intent(this, BaYi.class);
        startActivity(intent);
    }

    public void LiRen() {
        Intent intent = new Intent(this, LiRen.class);
        startActivity(intent);
    }
//
//    public void GongYeChang() {
//        Intent intent = new Intent(this, GongYeChang.class);
//        startActivity(intent);
//    }
//
//    public void YongYe() {
//        Intent intent = new Intent(this, YongYe.class);
//        startActivity(intent);
//    }
//
//    public void ShuEr() {
//        Intent intent = new Intent(this, ShuEr.class);
//        startActivity(intent);
//    }
//
//    public void TaiBo() {
//        Intent intent = new Intent(this, TaiBo.class);
//        startActivity(intent);
//    }
//
//    public void ZiHan() {
//        Intent intent = new Intent(this, ZiHan.class);
//        startActivity(intent);
//    }
//
//    public void XiangDang() {
//        Intent intent = new Intent(this, XiangDang.class);
//        startActivity(intent);
//    }
//
//    public void XianJin() {
//        Intent intent = new Intent(this, XianJin.class);
//        startActivity(intent);
//    }
//
//    public void YanYuan() {
//        Intent intent = new Intent(this, YanYuan.class);
//        startActivity(intent);
//    }
//
//    public void ZiLu() {
//        Intent intent = new Intent(this, ZiLu.class);
//        startActivity(intent);
//    }
//
//    public void XianWen() {
//        Intent intent = new Intent(this, XianWen.class);
//        startActivity(intent);
//    }
//
//    public void WeiLingGong() {
//        Intent intent = new Intent(this, WeiLingGong.class);
//        startActivity(intent);
//    }
//
//    public void JiShi() {
//        Intent intent = new Intent(this, JiShi.class);
//        startActivity(intent);
//    }
//
//    public void YangHuo() {
//        Intent intent = new Intent(this, YangHuo.class);
//        startActivity(intent);
//    }
//
//    public void WeiZi() {
//        Intent intent = new Intent(this, WeiZi.class);
//        startActivity(intent);
//    }
//
//    public void ZiZhang() {
//        Intent intent = new Intent(this, ZiZhang.class);
//        startActivity(intent);
//    }
//
//    public void YaoYue() {
//        Intent intent = new Intent(this, YaoYue.class);
//        startActivity(intent);
//    }
}