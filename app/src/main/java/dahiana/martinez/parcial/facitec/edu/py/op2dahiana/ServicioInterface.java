package dahiana.martinez.parcial.facitec.edu.py.op2dahiana;

import java.sql.ResultSet;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Administrador on 09/11/2016.
 */
public interface ServicioInterface {
    @GET("/?s=Servicio")
    void obtenerDatos(Callback<Servicio> servicioCallback);
}
