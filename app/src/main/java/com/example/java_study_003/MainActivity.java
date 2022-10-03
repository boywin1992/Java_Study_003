package com.example.java_study_003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.jetbrains.annotations.NotNull;

// 확장 함수 extension function
// 확장 함수는 코틀린에서 사용 가능한 개념으로 보인다.
// 자바로 활용한다면 아래와 같이 사용할 수 있겠다.

class TestExtension {
    public static boolean isNumber(@NotNull String $this$isNumber) {
        for (int i = 0; i < $this$isNumber.length(); ++i) {
            if ('0' > $this$isNumber.charAt(i) || '9' < $this$isNumber.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLongLength(@NotNull String $this$isLongLength) {
        return $this$isLongLength.length() >= 5;
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("hsson", "isNumber() = " + TestExtension.isNumber("12345"));
        // result : isNumber() = true
        Log.i("hsson", "isNumber() = " + TestExtension.isNumber("123사오"));
        // result : isNumber() = false

        Log.i("hsson", "isLongLength() = " + TestExtension.isLongLength("123"));
        // result : isNumber() = true
        Log.i("hsson", "isLongLength() = " + TestExtension.isLongLength("1234567"));
        // result : isNumber() = false

    }
}