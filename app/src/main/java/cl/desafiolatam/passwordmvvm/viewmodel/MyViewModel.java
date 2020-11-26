package cl.desafiolatam.passwordmvvm.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<String> message;
    public MyViewModel() {
        this.message = new MutableLiveData<>();
    }

    public LiveData<String> getMessage() {
        return message;
    }

    public void makeAction() {
        message.setValue("Mensaje de salida");
    }
}
