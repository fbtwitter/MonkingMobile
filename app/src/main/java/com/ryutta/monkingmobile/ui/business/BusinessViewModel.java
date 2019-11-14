package com.ryutta.monkingmobile.ui.business;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BusinessViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BusinessViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is business fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}