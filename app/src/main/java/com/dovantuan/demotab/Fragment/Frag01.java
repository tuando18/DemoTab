package com.dovantuan.demotab.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dovantuan.demotab.R;

public class Frag01  extends Fragment {

    Button btn01;
    TextView tv_title01;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //nơi gán layout cho frag
        View v = inflater.inflate(R.layout.activity_frag01, container, false);
        return v;

        //        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //ánh xạ view và tương tác với view thì với ở trong hàm này
        btn01 = view.findViewById(R.id.btn_01);
        tv_title01 = view.findViewById(R.id.tv_title01);

        tv_title01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Bạn click vào TextView", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
