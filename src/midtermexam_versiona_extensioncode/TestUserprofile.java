package midtermexam_versiona_extensioncode;

import java.util.*;


public class TestUserprofile extends UserProfile {

    public static void main(String[] args) {
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        String userID = sc.next();
        setUserID(userID);
        System.out.println("select your favourite genre: " + genres);
        String genre = sc.next();
        setGenre(genre);
        System.out.println("profile created!");
        new UserProfile(userID, genre);
    }


    @Override
    public void setUserID(String userID) {
        super.setUserID(userID);
    }

    @Override
    public String getUserID() {
        return super.getUserID();
    }

    @Override
    public void setGenre(String genre) {
        super.setGenre(genre);
    }

    @Override
    public String getGenre() {
        return super.getGenre();
    }
}
