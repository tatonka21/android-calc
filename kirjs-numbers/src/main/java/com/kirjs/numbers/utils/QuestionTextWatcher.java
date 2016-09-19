package com.kirjs.numbers.utils;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;

import com.kirjs.numbers.MainActivity;
import com.kirjs.numbers.questions.Question;

import java.util.function.Consumer;
import java.util.function.Function;

public class QuestionTextWatcher implements TextWatcher {
    private final MainActivity activity;


    public QuestionTextWatcher(MainActivity activity){


        this.activity = activity;
    }

    @Override
    public void afterTextChanged(Editable s) {
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        activity.handleAnswer(s.toString());
    }
}
