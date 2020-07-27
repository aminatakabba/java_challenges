import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Mirro, by Justin Timberlake");
    desertIslandPlaylist.add("Mirro, by Justin Timberlake");
    desertIslandPlaylist.add("Mirro, by Justin Timberlake");
    desertIslandPlaylist.add("Mirror");
    desertIslandPlaylist.add("Justin Timberlake");
    desertIslandPlaylist.add("Mirro, by Justin Timberlake");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove("Mirro, by Justin Timberlake");
    System.out.println(desertIslandPlaylist.size());
    String indexA = desertIslandPlaylist.indexOf("Mirror");
    String indexB = desertIslandPlaylist.indexOf("Justin Timberlake");
    String tempA = "Mirror";
    desertIslandPlaylist.set(indexA, "Justin Timberlake");
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
  }
  
}