package cl.desafiolatam.passwordmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import android.util.Log;
import android.view.View;

import cl.desafiolatam.passwordmvvm.databinding.ActivityMainBinding;
import cl.desafiolatam.passwordmvvm.viewmodel.MyViewModel;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ActivityMainBinding binding;
    private MyViewModel viewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        viewmodel = new ViewModelProvider(this).get(MyViewModel.class);

        /*binding.boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewmodel.makeAction();
            }
        });

        viewmodel.getMessage().observe(this, action -> {
            Log.d(TAG, "Observe: " + action);
            binding.tvResultado.setText(action);
        });*/
    }

}