package quyntg94.techkids.vn.s4kids.models;

/**
 * Created by quyntg94 on 19/04/2017.
 */

public class Letter {
    private String name;
    private String image1;
    private String image2;
    private String letter1;
    private String letter2;
    private String sound;
    private String sound1;
    private String sound2;

    public Letter(String name, String image1, String image2, String letter1, String letter2, String sound, String sound1, String sound2) {
        this.name = name;
        this.image1 = image1;
        this.image2 = image2;
        this.letter1 = letter1;
        this.letter2 = letter2;
        this.sound = sound;
        this.sound1 = sound1;
        this.sound2 = sound2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getLetter1() {
        return letter1;
    }

    public void setLetter1(String letter1) {
        this.letter1 = letter1;
    }

    public String getLetter2() {
        return letter2;
    }

    public void setLetter2(String letter2) {
        this.letter2 = letter2;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound1() {
        return sound1;
    }

    public void setSound1(String sound1) {
        this.sound1 = sound1;
    }

    public String getSound2() {
        return sound2;
    }

    public void setSound2(String sound2) {
        this.sound2 = sound2;
    }
}
