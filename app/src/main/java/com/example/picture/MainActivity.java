package com.example.picture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.picture.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.counter.setOnClickListener(v -> counterpic(view));
        binding.luck.setOnClickListener(v -> luckpic(view));
        binding.oddeven.setOnClickListener(v -> oddevenpic(view));

    }
    public void counterpic(View view) {
        binding.pic.setImageResource(R.drawable.counter);
        Toast.makeText(this, "이미지를 보여줍니다", Toast.LENGTH_LONG).show();
    }
    public void luckpic(View view) {
        binding.pic.setImageResource(R.drawable.luck);
        Toast.makeText(this, "이미지를 보여줍니다", Toast.LENGTH_LONG).show();
    }
    public void oddevenpic(View view) {
        binding.pic.setImageResource(R.drawable.oddeven);
        Toast.makeText(this, "이미지를 보여줍니다", Toast.LENGTH_LONG).show();
    }
}