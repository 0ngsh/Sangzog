package in.angsh.sangzog.ui.cluster;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClusterDirectoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ClusterDirectoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}