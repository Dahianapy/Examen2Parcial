package dahiana.martinez.parcial.facitec.edu.py.op2dahiana;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrador on 09/11/2016.
 */
public class ServicioAdapter extends BaseAdapter {
    private List<Servicio> datos;
    private Context context;

    public ServicioAdapter(List<Servicio> datos, Context context) {
        this.datos = datos;
        this.context = context;

    }

    @Override
    public int getCount() {
        return datos.size();
    }


    @Override
    public Object getItem(int position) {
        return datos.get(position);

    }
        @Override
        public long getItemId ( int position){
            return datos.get(position).getId();


    }
        @Override
        public View getView ( int position, View convetView, ViewGroup parent){
            View view = convetView;
            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.item_layout_datos, null);
            }
            Servicio b = this.datos.get(position);

            TextView TextViewNombre = (TextView) view.findViewById(R.id.textViewNombre);
            TextView TextViewFavorite = (TextView) view.findViewById(R.id.textViewFavorite);
            ImageView ImageViewAvatar = (ImageView) view.findViewById(R.id.imageViewAvatar);

            TextViewNombre.setText(b.getName());
            ///TextViewFavorite.setText(b.getFavorite());

            return view;


        }

    }


