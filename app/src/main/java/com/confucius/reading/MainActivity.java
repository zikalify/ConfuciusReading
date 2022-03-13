package com.confucius.reading;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
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
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        CheckBox toggle = findViewById(R.id.toggle_dark_theme);
        toggle.setChecked(useDarkTheme);

        toggle.setOnCheckedChangeListener((view, isChecked) -> toggleTheme(isChecked));

        if(toggle.isChecked()){
            toggle.setTextColor(Color.parseColor("#e2e2e2"));
        }

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.the_analects_button);
        button.setOnClickListener(v -> theAnalectsHome());
    }

    //Activity call methods, called by buttons above
    public void theAnalectsHome() {
        Intent intent = new Intent(this, TheAnalectsHome.class);
        startActivity(intent);
    }

    private void toggleTheme(boolean darkTheme) {
        SharedPreferences.Editor editor = getSharedPreferences(PREFS_NAME, MODE_PRIVATE).edit();
        editor.putBoolean(PREF_DARK_THEME, darkTheme);
        editor.apply();

        Intent intent = getIntent();
        finish();

        startActivity(intent);
    }

}