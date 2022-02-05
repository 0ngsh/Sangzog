package in.angsh.sangzog.ui.school;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SchoolDirectoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SchoolDirectoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}