package th.ac.su.cp.mycontacts.db;

import androidx.room.Query;

import th.ac.su.cp.mycontacts.model.User;

public interface UserDao {
    @Query("select * from users")
    User[] getAllUsers();

}
