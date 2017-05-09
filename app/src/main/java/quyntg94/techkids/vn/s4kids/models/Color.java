package quyntg94.techkids.vn.s4kids.models;

/**
 * Created by quyntg94 on 25/04/2017.
 */

public class Color {

    private String name;
    private String sound;

    public Color(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
