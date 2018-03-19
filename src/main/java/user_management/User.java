package user_management;

import user_management.security.Password;

public class User {
//    User is a POJO that implements all getters and setters. Refer to the json to see what attributes this will need.
//    User should implement setPassword to be able to take either a String or a user_management.security.Password object.
//    User should also implement two constructors. One constructor should take all the attributes as normal,
//    and the other should take the same arguments except it should take password as a String.
//    The constructor that takes password as a string should create a new Password object
//    and set the user's password to that object.


    private int id;
    private String name;
    private String email;
    private Password password;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = new Password(password);
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public User() {

    }

    public User(int id , String name, String email, Password password) {

        this.email = email;
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public User(int id , String name, String email, String password) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = new Password(password);

    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public Password getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return  name + " - " + email;
    }

    @Override
    public boolean equals(Object obj) {
        if((obj == null) || (getClass() != obj.getClass())){
            return false;
        } // end if
        else{
          return true;
        }
    }
}
