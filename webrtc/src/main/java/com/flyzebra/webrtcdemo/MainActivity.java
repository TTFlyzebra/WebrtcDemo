package com.flyzebra.webrtcdemo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.flyzebra.webrtcdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'webrtcdemo' library on application startup.
    static {
        System.loadLibrary("webrtcdemo");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'webrtcdemo' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}