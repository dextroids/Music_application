package Music_Player;

import Music_Player.Album;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println();
        Album a1  =new Album("lofi songs" ,"aftif aslam");
        a1.addSongInAlbum("gulabi ankhe",3.24);
        a1.addSongInAlbum("beete lamhei",4.00);
        a1.addSongInAlbum("tera woh pyar",5.23);
        a1.addSongInAlbum("kuch is tarah",3.00);
       Album a2 = new Album("best of hollywood","imagin dragon");

       a2.addSongInAlbum("believer",4.23);
       a2.addSongInAlbum("radioactive",5.20);
       a2.addSongInAlbum("death to live",4.13);
       a2.addSongInAlbum("weekends",5.02);

       ArrayList<song> playList = new ArrayList<>();

       a1.addSongToPlayList(2,playList);
       a1.addSongToPlayList(4,playList);
       a2.addSongToPlayList("believer",playList);
       a2.addSongToPlayList("weekends",playList);

       Play(playList);

    }
    public static void Play(ArrayList<song> playList) {
        printMenu();
        //Scanner sc = new Scanner(System.in);
        //int choice = sc.nextInt();
        System.out.println("Now playing");
        int currIndex = 0;
        System.out.println(playList.get(0).toString());
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
       // int currIndex = 0;
        boolean isover=false;
        while (!isover) {
            switch(choice) {
                case 1:
                    if (currIndex == (playList.size() - 1)) {
                        System.out.println("you are at last Song");
                    } else {
                        currIndex++;
                        System.out.println(playList.get(currIndex).toString());
                    }
                    break;
                case 2:
                    if (currIndex == 0) {
                        System.out.println("you are at first song");
                    } else {
                        currIndex--;
                        System.out.println(playList.get(currIndex).toString());
                    }
                    break;
                case 3:
                    System.out.println(playList.get(currIndex).toString());
                    break;
                case 4:
                    printMenu();
                    break;
                case 5:
                    for (song song : playList) {
                        System.out.println(song.toString());
                    }
                    break;
                case 6:
                    isover=true;
                    break;
            }
            choice =sc.nextInt();
        }

    }
    public static void printMenu(){

        System.out.println("Enter your choice");
        System.out.println("1.Go to next Song");
        System.out.println("2.Go to previous song");
        System.out.println("3.Repeat this Song");
        System.out.println("4.print the choice Menu");
        System.out.println("5.Print PlayList");
        System.out.println("6.Delete the current song");
    }
}