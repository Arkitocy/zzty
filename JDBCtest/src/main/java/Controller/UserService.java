package Controller;

import Bean.Student;
import Bean.User;
import Comment.Connecter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
    Connection cn = null;

    public boolean registUser(User user) {
        boolean f = false;
        try {
            cn = new Connecter().getConnetcion();
            String sql1 = "insert into user(name,pwd,age) values (?,?,?);";
            PreparedStatement ps1 = cn.prepareStatement(sql1);
            ps1.setString(1, user.getName());
            ps1.setString(2, user.getPwd());
            ps1.setInt(3, user.getAge());
            int rs = ps1.executeUpdate();
            if (rs >= 1) {
                f = true;
            }
            ps1.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return f;
        }
    }

    public boolean loginUser(String name, String pwd) {
        boolean f = false;
        try {
            cn = new Connecter().getConnetcion();
            String sql = "select * from user where name= ? and pwd=?;";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                f = true;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("注册失败");
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return f;
        }
    }
}
