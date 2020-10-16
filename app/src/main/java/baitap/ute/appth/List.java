package baitap.ute.appth;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class List
        extends AppCompatActivity {

    ArrayList<DataModel> dataModels;
    ListView listView;
    private static CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.list);

        dataModels= new ArrayList<>();

        dataModels.add(new DataModel("Phi Long", "Rap", "757.229.957","26 thg 6, 2015"));
        dataModels.add(new DataModel("Binz", "Adele", "675.534.967","23 thg 5, 2016"));
        dataModels.add(new DataModel("kaarik", "Justin Bieber - Chance The Rapper", "40.391.044","18 thg 9, 2020"));
        dataModels.add(new DataModel("Wowy","Lady Gaga","238.797.257","15 thg 12, 2016"));
        dataModels.add(new DataModel("Sboi", "P!nk - Nate Ruess", "1.216.428.896","6 thg 2, 2013"));
        dataModels.add(new DataModel("Yonu bigboi", "Harry Styles", "661.252.970","8 thg 5, 2017"));
        dataModels.add(new DataModel("Ricky start", "One Direction", "470.305.748","18 thg 4, 2014"));
        dataModels.add(new DataModel("16 Tyrt","ZAYN - Zhavia Ward","198.490.912","9 thg 5, 2019"));
        dataModels.add(new DataModel("Gducky", "Sam Smith", "261.248.724","19 thg 7, 2019"));
        dataModels.add(new DataModel("De choat", "The Weeknd", "249.523.715","22 thg 1, 2020"));

        adapter= new CustomAdapter(dataModels,getApplicationContext());

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                DataModel dataModel= dataModels.get(position);

                Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getType()+"   - View : "+dataModel.getVersion_number(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();
            }
        });
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
}


