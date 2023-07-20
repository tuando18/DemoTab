package com.dovantuan.demotab.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dovantuan.demotab.MainActivity;
import com.dovantuan.demotab.R;

public class Frag02 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //nơi gán layout cho frag
        return inflater.inflate(R.layout.activity_frag02, container, false);
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tv = view.findViewById(R.id.tv_title02);

        //lấy dữ liệu act gửi sang
        Bundle bundle = getArguments();
        if (bundle != null){
            tv.setText(bundle.getString("hoten"));
            //họ tên đc hiện thị ở frag 2
        }
    }
}
