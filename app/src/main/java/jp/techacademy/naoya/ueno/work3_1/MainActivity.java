package jp.techacademy.naoya.ueno.work3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("太郎", 5, "映画");     // 名前を太郎、年齢を5歳、趣味を映画で、Humanのインスタンスを作る

        human.say();
        human.think();
    }

}