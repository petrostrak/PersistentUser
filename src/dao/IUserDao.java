/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.User;
import java.util.List;

/**
 *
 * @author petros_trak
 */
public interface IUserDao {

    User findById(long id);

    List<User> findAll();

    boolean deleteById(long id);

    boolean updateNameById(long id, String name);

    boolean updateSurnameById(long id, String surname);

    boolean updateEmailById(long id, String email);

    boolean updateAgeById(long id, int age);
}
