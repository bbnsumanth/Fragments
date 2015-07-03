package com.example.trail.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by KrazyKnight on 7/3/2015.
 */
public class MyFragmnet2 extends Fragment {
    EditText mEditText;

    public void onAttach(Activity activity){
        Log.d("fragment2", "fragment2 onAttach started");
        super.onAttach(activity);
        Log.d("fragment2", "fragment2 onAttach ended");
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        Log.d("fragment2", "fragment2 onCreate started");
        super.onCreate(savedInstanceState);
        Log.d("fragment2", "fragment2 onCreate ended");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        Log.d("fragment2", "fragment2 onCreateView started");
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.my_fragment_2,container,false);
        Log.d("fragment2", "fragment2 onCreateView ended");
        return view;

    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        Log.d("fragment2", "fragment2 onActivityCreated started");
        mEditText = (EditText) getActivity().findViewById(R.id.textView2);
        super.onActivityCreated(savedInstanceState);
        Log.d("fragment2", "fragment2 onActivityCreated ended");
    }
    public void changeText(String message){
     mEditText.setText(message);

    }
    @Override
    public void onStart(){
        Log.d("fragment2", "fragment2 onStart started");
        super.onStart();
        Log.d("fragment2", "fragment2 onStart ended");
    }
    @Override
    public void onResume(){
        Log.d("fragment2", "fragment2  onResume started");
        super.onResume();
        Log.d("fragment2", "fragment2  onResume ended");
    }
    @Override
    public void onPause(){
        Log.d("fragment2", "fragment2 onPause started");
        super.onPause();
        Log.d("fragment2", "fragment2 onPause ended");

    }
    @Override
    public  void onSaveInstanceState(Bundle savedInstanceState){
        Log.d("fragment2", "fragment2  onSaveInstance started");
        super.onSaveInstanceState(savedInstanceState);
        Log.d("fragment2", "fragment2  onSaveInstance ended");
    }
    @Override
    public void onStop(){
        Log.d("fragment2", "fragment2 onStop started");
        super.onStop();
        Log.d("fragment2", "fragment2 onStop ended");
    }
    @Override
    public  void onDestroyView(){
        Log.d("fragment2", "fragment2 onDestroyView started");
        super.onDestroyView();
        Log.d("fragment2", "fragment2 onDestroyView ended");
    }
    @Override
    public  void onDestroy(){
        Log.d("fragment2", "fragment2 onDestroy started");
        super.onDestroy();
        Log.d("fragment2", "fragment2 onDestroy ended");
    }
    @Override
    public void onDetach(){
        Log.d("fragment2", "fragment2 onDetach started");
        super.onDetach();
        Log.d("fragment2", "fragment2 onDetach ended");
    }

}
