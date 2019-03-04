package midtermexam_versiona_extensioncode;

import java.util.*;

public class TestUserprofile extends UserProfile {

    private String userID;//the userID
    private String genre;// the user's preferred genre of movie
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies

    Scanner sc = new Scanner(System.in);
    System.out.println("enter name:")
    userID = sc.next();
    System.out.println("select your favourite genre: " + genres);
    genre = sc.next();
    System.out.println("profile created!");
    UserProfile(userID, genre);

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
