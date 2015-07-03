package com.example.trail.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by KrazyKnight on 7/2/2015.
 */
public class MyFragment extends Fragment {
    private MainActivity mActivity;
    private MyFragmentCommunicator myCommunicator;
    EditText mEditText;
    Button repeat_button;

    public interface MyFragmentCommunicator{
       void passText(String message);
    }

    @Override
    public void onAttach(Activity activity){
        Log.d("fragment", "fragment onAttach started");
        super.onAttach(activity);

        mActivity = (MainActivity) activity;
        myCommunicator = (MyFragmentCommunicator) activity;

        Log.d("fragment", "fragment onAttach ended");
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        Log.d("fragment", "fragment onCreate started");
        super.onCreate(savedInstanceState);
        Log.d("fragment", "fragment onCreate ended");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        Log.d("fragment", "fragment onCreateView started");
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.my_fragment,container,false);
        Log.d("fragment", "fragment onCreateView ended");
        return view;

    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        Log.d("fragment", "fragment onActivityCreated started");
        super.onActivityCreated(savedInstanceState);

        repeat_button  = (Button) getActivity().findViewById(R.id.repeat_button);
        mEditText = (EditText) mActivity.findViewById(R.id.textView);

        repeat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mEditText.getText().toString();
                myCommunicator.passText(text);
            }
        });


        Log.d("fragment", "fragment onActivityCreated ended");
    }
    @Override
    public void onStart(){
        Log.d("fragment", "fragment onStart started");
        super.onStart();
        Log.d("fragment", "fragment onStart ended");
    }
    @Override
    public void onResume(){
        Log.d("fragment", "fragment  onResume started");
        super.onResume();
        Log.d("fragment", "fragment  onResume ended");
    }
    @Override
    public void onPause(){
        Log.d("fragment", "fragment onPause started");
        super.onPause();
        Log.d("fragment", "fragment onPause ended");

    }
    @Override
    public  void onSaveInstanceState(Bundle savedInstanceState){
        Log.d("fragment", "fragment  onSaveInstance started");
        super.onSaveInstanceState(savedInstanceState);
        Log.d("fragment", "fragment  onSaveInstance ended");
    }
    @Override
    public void onStop(){
        Log.d("fragment", "fragment onStop started");
        super.onStop();
        Log.d("fragment", "fragment onStop ended");
    }
    @Override
    public  void onDestroyView(){
        Log.d("fragment", "fragment onDestroyView started");
        super.onDestroyView();
        Log.d("fragment", "fragment onDestroyView ended");
    }
    @Override
    public  void onDestroy(){
        Log.d("fragment", "fragment onDestroy started");
        super.onDestroy();
        Log.d("fragment", "fragment onDestroy ended");
    }
    @Override
    public void onDetach(){
        Log.d("fragment", "fragment onDetach started");
        super.onDetach();
        Log.d("fragment", "fragment onDetach ended");
    }

}
