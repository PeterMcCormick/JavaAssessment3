package user_management;

import java.util.ArrayList;

public class UserCollection extends ArrayList{

    private UserCollection userCollection;

    private UserCollection getUserCollection() {
        userCollection = UserCollectionInitializer.generate();
        return this.userCollection;
    }
    User user = new User();

    public User findById(int id) {
        getUserCollection();
        user = (User)userCollection.get(id-1);
        return user;
    }

    public User findByEmail(String email) {
        getUserCollection();
        for(Object e: userCollection){
            if (user.getName() != null && user.getName().contains(email));
            return (User)e;
        }
        return null;
    }

    public User attemptLogin(String email, String password) {

        return null;
    }

    public int createUser(String name, String email, String password) {

        return 0;
    }
}
