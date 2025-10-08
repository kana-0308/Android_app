package com.example.android_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
// import android.content.Intent; // 画面遷移で必要になります

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // activity_main.xml ファイルを画面として設定します
        setContentView(R.layout.activity_home);

        // XMLレイアウトから各ボタンのIDを見つけて、変数に代入します
        Button startButton = findViewById(R.id.startButton);
        Button settingsButton = findViewById(R.id.settingsButton);

        // スタートボタンがクリックされたときの処理
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ここにゲーム画面へ遷移する処理を書きます
                // 例:
                // Intent intent = new Intent(MainActivity.this, GameActivity.class);
                // startActivity(intent);

                // 今回は簡易的にトーストメッセージを表示します
                Toast.makeText(HomeActivity.this, "ゲームを開始します！", Toast.LENGTH_SHORT).show();
            }
        });

        // 設定ボタンがクリックされたときの処理
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ここに設定画面へ遷移する処理を書きます
                // 例:
                // Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                // startActivity(intent);

                // 簡易的メッセージを表示
                Toast.makeText(HomeActivity.this, "設定画面を開きます", Toast.LENGTH_SHORT).show();
            }
        });
    }
}