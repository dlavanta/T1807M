package JV2_assement6;

import javax.jws.soap.SOAPBinding;
import java.sql.Connection;
import java.util.ArrayList;

public class DAOUser {
    public DAOUser() {
        super();
    }

    @Override
    public int ArrayLi<User> getUsers() {
        String sql = "SELECT * FROM user";
        Connector connector = Connector.getQuery(sql);
        ArrayList<User> users = new ArrayList<>();
        while (rs.next()){
            Integer id = rs.getInt("id");
            String username = rs.getString("username");
            String email = rs.getString ("email");
            String password = rs.getSring("passwdrd");
            Integer status = rs.getString("status");

            User u = new User(id,username,email,password,status);

            users.add(u);

        }
        return users;
    }catch (Exception){}

    return null;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
