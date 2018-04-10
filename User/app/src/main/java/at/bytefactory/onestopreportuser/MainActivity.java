package at.bytefactory.onestopreportuser;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = findViewById(R.id.list);
        ArrayList<String> categories = new ArrayList<String>() {{
            add("Lighting");
            add("Trash");
            add("Road");
        }};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, categories);
        listView.setAdapter(adapter);
        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
