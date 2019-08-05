package vn.edu.poly.baitaplab6;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=getSupportFragmentManager();
        Fragment_Left fragment_left=new Fragment_Left();
        fragmentManager.beginTransaction().add(R.id.frameLeft,fragment_left).commit();
    }
}
