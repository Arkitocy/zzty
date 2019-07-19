package Comment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecter {
    public Connection getConnetcion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/zzty-cy?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai";
        String user = "zztyuser";
        String password = "114514";
        Connection conn = null;
        conn = DriverManager.getConnection(url, user, password);
        return conn;
    }
}
