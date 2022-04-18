package sch.id.wwwsmktelkom.myapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();
    private MutableLiveData<String> mNumber = new MutableLiveData<>();
    private MutableLiveData<String> mAddress = new MutableLiveData<>();
    private MutableLiveData<String> mSchool = new MutableLiveData<>();

    public void setName(String name) {
        mName.setValue(name);
    }

    public LiveData<String> getName() {
        return mName;
    }

    public void setNumber(String number) {
        mNumber.setValue(number);
    }

    public LiveData<String> getNumber() {
        return mNumber;
    }

    public void setAddress(String address) {
        mAddress.setValue(address);
    }

    public LiveData<String> getAddress() {
        return mAddress;
    }

    public void setSchool(String school) {
        mSchool.setValue(school);
    }

    public LiveData<String> getSchool() {
        return mSchool;
    }
}
