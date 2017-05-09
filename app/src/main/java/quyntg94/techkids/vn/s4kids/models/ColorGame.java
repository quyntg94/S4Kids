package quyntg94.techkids.vn.s4kids.models;

/**
 * Created by quyntg94 on 03/05/2017.
 */

public class ColorGame {
    private String image;
    private int id;

    public ColorGame(String image, int id) {
        this.image = image;
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
