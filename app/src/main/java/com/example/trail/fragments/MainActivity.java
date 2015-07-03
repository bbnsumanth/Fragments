package com.example.trail.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends ActionBarActivity implements MyFragment.MyFragmentCommunicator {
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    FrameLayout containerFrag2;
    MyFragmnet2 frag2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("activity", "activity onCreated started");
        setContentView(R.layout.activity_main);

        frag2 = new MyFragmnet2();
        addFragment(frag2);


        Log.d("activity", "activity onCreated ended");
    }

    private void addFragment(MyFragmnet2 frag2) {
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.add(R.id.frag2container, frag2, "frag2");
        mFragmentTransaction.commit();
    }


    @Override
    public void onAttachFragment(Fragment fragment){
        Log.d("activity", "activity  onAttachFragment started");
        super.onAttachFragment(fragment);
        Log.d("activity", "activity  onAttachFragment ended");
    }
    @Override
    public void onStart(){
        Log.d("activity","activity onStart started");
        super.onStart();
        Log.d("activity", "activity onStart ended");
    }
    @Override
    public void onRestart(){
        Log.d("activity", "activity  onRestart started");
        super.onRestart();
        Log.d("activity", "activity  onRestart ended");
    }
    @Override
    public void onResume(){
        Log.d("activity", "activity  onResume started");
        super.onResume();
        Log.d("activity", "activity  onResume ended");
    }
    @Override
    public void onResumeFragments(){
        Log.d("activity", "activity onresumeFragments started");
        super.onResumeFragments();
        Log.d("activity", "activity onresumeFragments ended");
    }
    @Override
    public void onPause(){
        Log.d("activity", "activity onPause started");
        super.onPause();
        Log.d("activity", "activity onPause ended");

    }
    @Override
    public  void onSaveInstanceState(Bundle savedInstanceState){
        Log.d("activity", "activity  onSaveInstance started");
        super.onSaveInstanceState(savedInstanceState);
       Log.d("activity", "activity  onSaveInstance ended");
    }
    @Override
    public void onStop(){
        Log.d("activity", "activity onStop started");
        super.onStop();
        Log.d("activity", "activity onStop ended");
    }
    @Override
    public void onDestroy(){
        Log.d("activity", "activity  onDestroy started");
        super.onDestroy();
        Log.d("activity", "activity  onDestroy ended");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void passText(String message){
        frag2.changeText(message);
    }
}



