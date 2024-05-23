package ex4;

public class Main {

    public static void main(String[] args) {
        Song song1 = new Song("Shape of You", "Ed Sheeran", 240);
        Song song2 = new Song("Shape of You", "Ed Sheeran", 180);
        Song song3 = new Song("Hello", "Adele", 300);

        System.out.println("song1 equals song2: " + song1.equals(song2));
        System.out.println("song1 equals song3: " + song1.equals(song3));

        System.out.println("Hashcode of song1: " + song1.hashCode());
        System.out.println("Hashcode of song2: " + song2.hashCode());
    }
}
