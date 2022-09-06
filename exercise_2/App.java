import java.util.LinkedList;
public class App {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // Adds new songs to Playlist
        Playlist.add("Slow Dancing In A Burning Room");
        Playlist.add("Robbers");
        Playlist.add("High School In Jakarta");
        Playlist.add("Late Night Talking");
        Playlist.add("Under The Influence");

        // Adds a new song at the end of the Playlist
        Playlist.addFirst("Sincerity Is Scary");

        // Adds a new song at the end of the Playlist
        Playlist.addLast("Out Of Time");

        // Display node at the front in the LinkedList
        System.out.println(Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(6, "Shot In The Dark"); 

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}