package dahiana.martinez.parcial.facitec.edu.py.op2dahiana;

/**
 * Created by Administrador on 09/11/2016.
 */
public class Servicio {
    private int id;
    private String avatar_url;
    private String name;
    private Boolean favorite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "id=" + id +
                ", avatar_url='" + avatar_url + '\'' +
                ", name='" + name + '\'' +
                ", favorite=" + favorite +
                '}';
    }
}
