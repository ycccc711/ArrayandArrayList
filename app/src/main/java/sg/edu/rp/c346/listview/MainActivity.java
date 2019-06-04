package sg.edu.rp.c346.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.tV);

        //Array
//        String [] fruits;
//        fruits = new String[3];
//        fruits[0] = "apple";
//        fruits[1] = "banana";
//        fruits[2] = "cherry";
//
//        String tv = "Fruits\n =====\n";
//        for (int i = 0; i<fruits.length;i++){
//            tv +=  fruits[i]+"\n";
//        }
//        textview.setText(tv);

        //ArrayList
        ArrayList<String> fruits;
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        //add durian to fourth element
        fruits.add("durian");

        //get second element
        String theFruit = fruits.get(1);
        Log.d("the",theFruit);

        //remove
        fruits.remove(0);

        //change
        fruits.set(fruits.size()-1,"dragon fruit");

        String tv = "Fruits\n =====\n";
        for(int i =0; i< fruits.size();i++){
            tv += fruits.get(i) +"\n";
        }
        textview.setText(tv);
        Log.d("tag",tv);

    }
}
