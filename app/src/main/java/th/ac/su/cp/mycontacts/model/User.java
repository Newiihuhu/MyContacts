package th.ac.su.cp.mycontacts.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

import java.util.Date;

@Entity(tableName = "users")
public class User {
    public final int id;
    @ColumnInfo(name = "first_name")
    public final String firstName;
    @ColumnInfo(name = "last_name")
    public final String lastName;
    @ColumnInfo(name = "birth_date")
    public final Date birthDate;
    public final int gender;
    public final boolean single;
    @ColumnInfo(name = "some_time")
    public final Date someTime;

    public User(int id, String firstName, String lastName, Date birthDate, int gender, boolean single, Date someTime) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.single = single;
        this.someTime = someTime;
    }
}
