/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistentuser;

import entities.User;
import java.util.List;

/**
 *
 * @author petros_trak
 */
public class PersistentUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            findById(int id)
            List<User> users = findAll()
            save(User user) //insert into
            update(int id, User user)
            delete(long id)
        */
        
        services.UserImlp userService = new services.UserImlp();
        
        User user = userService.findById(4);
        if(user == null) {
            System.out.println("Something is not found!");
        }else{
            System.out.println(user);
        }
        
        /*
        List<User> users = userService.findAll();
        for(User x: users)
            System.out.println(x);
        */
        
        long i = 1;
        boolean delete = userService.deleteById(i);
        if(delete){
            System.out.println("User with id " + i + " deleted successfully!");
        }
        
        long id = 3;
        int age = 30;
        //long id is an id! We don´t know if it is a valid id
        //if it is, then update by using user object as below
        boolean update = userService.updateAgeById(id, age);
        if(update)
            System.out.println("The age of the user with id " + id + " has been successfully updated to " + age + "."); 
    }
    
    
}
