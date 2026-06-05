package service;

/**
 * User class to represent a user with details.
 * This class stores user information including name and age.
 */
public class User {
    private String name;
    private int age;
    private String email;
    
    /**
     * Constructor to create a User object.
     * 
     * @param name the user's name
     * @param age the user's age
     * @param email the user's email
     */
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getEmail() {
        return email;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Compares this user's age with another user's age.
     * 
     * @param other the other user to compare with
     * @return positive if this user is older, negative if younger, 0 if same age
     */
    public int compareAge(User other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot compare with null user");
        }
        return this.age - other.age;
    }
    
    /**
     * Checks if this user is older than another user.
     * 
     * @param other the other user to compare with
     * @return true if this user is older, false otherwise
     */
    public boolean isOlderThan(User other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot compare with null user");
        }
        return this.age > other.age;
    }
    
    /**
     * Checks if this user is younger than another user.
     * 
     * @param other the other user to compare with
     * @return true if this user is younger, false otherwise
     */
    public boolean isYoungerThan(User other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot compare with null user");
        }
        return this.age < other.age;
    }
    
    /**
     * Checks if this user is the same age as another user.
     * 
     * @param other the other user to compare with
     * @return true if both users are the same age, false otherwise
     */
    public boolean isSameAge(User other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot compare with null user");
        }
        return this.age == other.age;
    }
    
    /**
     * Returns a string representation of the user.
     * 
     * @return user details as a string
     */
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
