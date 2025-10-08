package com.example.android_app;
//aaaaaaaaaaaaaaa
//oresannjou

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/**
 * このアクティビティは、ゲームの単純なスタート画面として機能します😊。
 * 最小限の機能だけを残しています！✨
 */
public class MainActivity extends AppCompatActivity {

    // ViewBindingやナビゲーション関連の変数は不要になったため削除しました。
    // private AppBarConfiguration appBarConfiguration;
    // private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // レイアウトを直接設定します。
        // activity_main.xmlは、ゲームのスタート画面のレイアウト（例えば、
        // 中央に「スタート」ボタンがあるなど）として使用されることを想定しています。
        // ※このコードだけではレイアウトファイル自体は変更されません！
        setContentView(R.layout.activity_main); // 変更点1️⃣: レイアウト設定をシンプルに！

        // ツールバー、FloatingActionButton (fab)、ナビゲーション関連の
        // 設定コードはすべて削除しました！🧹

        // もしスタートボタンなどがあれば、ここでリスナーを設定できますが、
        // 今回は「単純なスタート画面だけ」なので何も追加しません😉。

        // 例：
        /*
        Button startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ここに次のゲーム画面への遷移コードなどを書く！
            }
        });
        */
    }

    // ツールバーのメニュー関連のメソッドは削除しました！
    // @Override
    // public boolean onCreateOptionsMenu(Menu menu) { ... }

    // @Override
    // public boolean onOptionsItemSelected(MenuItem item) { ... }

    // ナビゲーション関連のメソッドは削除しました！
    // @Override
    // public boolean onSupportNavigateUp() { ... }
}