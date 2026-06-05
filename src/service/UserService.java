package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * UserService class to manage user operations.
 * Provides methods for sorting, comparing, and filtering users.
 */
public class UserService {
    
    private List<User> users;
    
    /**
     * Constructor to initialize UserService.
     */
    public UserService() {
        this.users = new ArrayList<>();
    }
    
    /**
     * Adds a user to the service.
     * 
     * @param user the user to add
     */
    public void addUser(User user) {
        if (user != null) {
            users.add(user);
        }
    }
    
    /**
     * Gets all users.
     * 
     * @return list of all users
     */
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
    
    /**
     * Sorts users by age in ascending order.
     * 
     * @return list of users sorted by age
     */
    public List<User> sortUsersByAgeAscending() {
        List<User> sortedUsers = new ArrayList<>(users);
        sortedUsers.sort(Comparator.comparingInt(User::getAge));
        return sortedUsers;
    }
    
    /**
     * Sorts users by age in descending order.
     * 
     * @return list of users sorted by age (oldest first)
     */
    public List<User> sortUsersByAgeDescending() {
        List<User> sortedUsers = new ArrayList<>(users);
        sortedUsers.sort(Comparator.comparingInt(User::getAge).reversed());
        return sortedUsers;
    }
    
    /**
     * Sorts users by name alphabetically.
     * 
     * @return list of users sorted by name
     */
    public List<User> sortUsersByName() {
        List<User> sortedUsers = new ArrayList<>(users);
        sortedUsers.sort(Comparator.comparing(User::getName));
        return sortedUsers;
    }
    
    /**
     * Finds the oldest user.
     * 
     * @return the oldest user, or null if no users
     */
    public User findOldestUser() {
        if (users.isEmpty()) {
            return null;
        }
        return Collections.max(users, Comparator.comparingInt(User::getAge));
    }
    
    /**
     * Finds the youngest user.
     * 
     * @return the youngest user, or null if no users
     */
    public User findYoungestUser() {
        if (users.isEmpty()) {
            return null;
        }
        return Collections.min(users, Comparator.comparingInt(User::getAge));
    }
    
    /**
     * Compares two users by age and returns result message.
     * 
     * @param user1 the first user
     * @param user2 the second user
     * @return comparison result message
     */
    public String compareUsersByAge(User user1, User user2) {
        if (user1 == null || user2 == null) {
            return "Invalid users for comparison";
        }
        
        int comparison = user1.compareAge(user2);
        if (comparison > 0) {
            return user1.getName() + " (" + user1.getAge() + ") is " + comparison + " years older than " + 
                   user2.getName() + " (" + user2.getAge() + ")";
        } else if (comparison < 0) {
            return user1.getName() + " (" + user1.getAge() + ") is " + (-comparison) + " years younger than " + 
                   user2.getName() + " (" + user2.getAge() + ")";
        } else {
            return user1.getName() + " and " + user2.getName() + " are the same age (" + user1.getAge() + ")";
        }
    }
    
    /**
     * Filters users by age range.
     * 
     * @param minAge minimum age (inclusive)
     * @param maxAge maximum age (inclusive)
     * @return list of users within the age range
     */
    public List<User> filterUsersByAgeRange(int minAge, int maxAge) {
        List<User> filtered = new ArrayList<>();
        for (User user : users) {
            if (user.getAge() >= minAge && user.getAge() <= maxAge) {
                filtered.add(user);
            }
        }
        return filtered;
    }
    
    /**
     * Gets the average age of all users.
     * 
     * @return average age, or 0 if no users
     */
    public double getAverageAge() {
        if (users.isEmpty()) {
            return 0;
        }
        return users.stream().mapToInt(User::getAge).average().orElse(0);
    }
    
    /**
     * Prints all users in a formatted way.
     */
    public void printAllUsers() {
        System.out.println("=== All Users ===");
        if (users.isEmpty()) {
            System.out.println("No users found");
            return;
        }
        for (User user : users) {
            System.out.println(user);
        }
    }
}
