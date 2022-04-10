package org.techtown.hardhard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class HomeFragment extends Fragment{
    private Context context; // 토스트 메시지 관련

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        FloatingActionButton fab = (FloatingActionButton)v.findViewById(R.id.but_edit);
        context = container.getContext();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EditActivity.class);
                startActivity(intent);
                Toast.makeText(context, "내용 수정", Toast.LENGTH_SHORT).show();

            }
        });
        return v;
        //return inflater.inflate(R.layout.fragment_home,container,false);


    }
}
