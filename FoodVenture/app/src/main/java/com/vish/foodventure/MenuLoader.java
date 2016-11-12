package com.vish.foodventure;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Vish on 10/11/2016.
 */
public class MenuLoader extends AppCompatActivity {
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.mainmenu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.favorites){
            Log.d("Menu","Clicked Fav");
        }
        else if(item.getItemId() == R.id.logout){
            FirebaseAuth mAuth = FirebaseAuth.getInstance();
            mAuth.signOut();
        }
        return true;
    }
}