package Interface;

interface Playable {
    void play();
}

class Radio implements Playable {
    public void play() {
        System.out.println("Radio is playing music.");
    }
}

class DVDPlayer implements Playable {
    public void play() {
        System.out.println("DVD player is playing a movie.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Playable radio = new Radio();
        Playable dvdPlayer = new DVDPlayer();

        radio.play();        // Output: Radio is playing music.
        dvdPlayer.play();    // Output: DVD player is playing a movie.
    }
}
