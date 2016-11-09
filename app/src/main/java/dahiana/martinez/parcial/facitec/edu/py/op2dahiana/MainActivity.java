package dahiana.martinez.parcial.facitec.edu.py.op2dahiana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import retrofit.Callback;
import retrofit.RestAdapter;

public class MainActivity extends AppCompatActivity {
    ListView datosListView;
    ImageView avatarImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       datosListView = (ListView) findViewById(R.id.listViewDatos);
        avatarImageView = (ImageView)findViewById(R.id.imageViewAvatar);

        RestAdapter restAdapter = new RestAdapter.Builder().
                setEndpoint("http://servidor-monkeydevs.rhcloud.com/servicio/posts.json").build();


        ServicioInterface servicio = restAdapter.create(ServicioInterface.class);




    }
}
