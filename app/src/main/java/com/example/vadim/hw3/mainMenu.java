package com.example.vadim.hw3;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class mainMenu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.activityA_menu_item:
                intent = new Intent(getApplicationContext(), activityA.class);
                startActivity(intent);
                return true;
            case R.id.activityB_menu_item:
                intent = new Intent(getApplicationContext(), activityB.class);
                startActivity(intent);
                return true;
            case R.id.activityC_menu_item:
                intent = new Intent(getApplicationContext(), activityC.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
