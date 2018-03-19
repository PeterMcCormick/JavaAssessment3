package user_management;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class UserCollectionInitializer {

    public static UserCollection generate() {
        UserCollection userCollection = new UserCollection();
        User[] users;
        try {
            BufferedReader br = new BufferedReader((new FileReader("/Users/petermccormick/Dev/Peter/Assessment3/JavaAssessment3/src/main/resources/users.json")));
            Gson gson = new Gson();
            users = gson.fromJson(br, User[].class);
            userCollection.addAll(Arrays.asList(users));

            return userCollection;
        } catch (IOException e) {
            userCollection = null;
            return userCollection;
        }
    }
}
