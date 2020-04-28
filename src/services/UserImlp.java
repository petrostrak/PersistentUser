/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;
import java.util.List;

/**
 *
 * @author petros_trak
 */
public class UserImlp implements IUser {
    dao.UserDaoImpl userDao = new dao.UserDaoImpl(); 
    //BUSINESS LOGIC GOES HERE

    @Override
    public User findById(long id) {
        if(id <= 0)
            return null;
        else{
            //Dao = Data Access Object, δλδ το αποτελεσμα του entity
            userDao = new dao.UserDaoImpl(); 
            return userDao.findById(id);
        }
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public boolean deleteById(long id) {
        if(id <= 0){
            return false;
        }else{
            userDao.deleteById(id);
            return true;
        }
    }

    @Override
    public boolean updateNameById(long id, String name) {
        if(id <= 0){
            return false;
        }else{
            userDao.updateNameById(id, name);
            return true;
        }
    }

    @Override
    public boolean updateSurnameById(long id, String surname) {
        if(id <= 0){
            return false;
        }else{
            userDao.updateSurnameById(id, surname);
            return true;
        }
    }

    @Override
    public boolean updateEmailById(long id, String email) {
        if(id <= 0){
            return false;
        }else{
            userDao.updateEmailById(id, email);
            return true;
        }
    }

    @Override
    public boolean updateAgeById(long id, int age) {
        if(id <= 0){
            return false;
        }else{
            userDao.updateAgeById(id, age);
            return true;
        }
    }
    
}
