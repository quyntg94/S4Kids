package quyntg94.techkids.vn.s4kids.events;

import quyntg94.techkids.vn.s4kids.models.Letter;

/**
 * Created by quyntg94 on 20/04/2017.
 */

public class EventLetter {

    private Letter letter;

    public EventLetter(Letter letter) {
        this.letter = letter;
    }

    public Letter getLetter() {
        return letter;
    }
}
