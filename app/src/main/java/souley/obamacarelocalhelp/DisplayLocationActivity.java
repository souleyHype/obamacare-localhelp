package souley.obamacarelocalhelp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.appdatasearch.GetRecentContextCall;

import org.json.JSONObject;

public class DisplayLocationActivity extends AppCompatActivity {
    private String url = "https://localhelp.healthcare.gov/api/v1/resources/agents/all/38.8845126_-77.0938583.json?lat=38.8845126&lng=-77.0938583&medicaidState=VA&radius=50&order=proximity&limit=none&offset=0";
    private ListView placesView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_location);

        placesView = (ListView) findViewById(R.id.listView);

    }
}
