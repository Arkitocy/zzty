package Controller;

import Bean.Product;
import Bean.User;
import Comment.Connecter;
import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.lang.model.type.ArrayType;
import java.sql.*;
import java.util.ArrayList;

public class ProductService {
    Connection cn = null;


    public boolean addProduct(Product product) {
        boolean f = false;
        try {
            cn = new Connecter().getConnetcion();
            String sql1 = "select * from product where name=? and category=?";
            PreparedStatement ps2 = cn.prepareStatement(sql1);
            ps2.setString(1,product.getName());
            ps2.setString(2,product.getCategory());
            ResultSet rs1=ps2.executeQuery();
            if(rs1==null){
            String sql = "insert into product(name,category,productiondate,outdate) values (?,?,?,?);";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setString(2, product.getCategory());
            ps.setTimestamp(3, new Timestamp(product.getProductiondate().getTime()) );
            ps.setTimestamp(4, new Timestamp(product.getOutdate().getTime()) );
            int rs = ps.executeUpdate();
            if (rs >= 1) {
                f = true;
            }
            ps.close();}else {
                System.out.println("该商品已注册");
            }
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

    public boolean deleteProduct(String name, String category) {
        boolean f = false;
        try {
            cn = new Connecter().getConnetcion();
            String sql = "delete from product where name=? and category = ?;";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, category);
            int rs = ps.executeUpdate();
            if (rs >= 1) {
                f = true;
            }
            ps.close();
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

    public boolean updateProduct(String name, String category, Product product) {
        boolean f = false;
        try {
            cn = new Connecter().getConnetcion();
            String sql1 = "update  product set name = ?,category=?,productiondate =?,outdate =? where name=? and category=?;";
            PreparedStatement ps1 = cn.prepareStatement(sql1);
            ps1.setString(1, product.getName());
            ps1.setString(2, product.getCategory());
            ps1.setTimestamp(3, new Timestamp(product.getProductiondate().getTime()) );
            ps1.setTimestamp(4, new Timestamp(product.getOutdate().getTime()) );
            ps1.setString(5, name);
            ps1.setString(6, category);
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

    public Product showProduct(String name, String category) {
        boolean f = false;
        Product p =new Product();
        try {
            cn = new Connecter().getConnetcion();
            String sql = "select * from product where name= ? and category = ?;";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, category);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setCategory(rs.getString("category"));
                p.setProductiondate(rs.getTimestamp("productiondate"));
                p.setOutdate(rs.getTimestamp("outdate"));
                System.out.print("产品名：" + rs.getString("name"));
                System.out.print("  产品分类：" + rs.getString("category"));
                System.out.print("  生产日期：" + rs.getTimestamp("productiondate"));
                System.out.println("    保质期：" + rs.getTimestamp("outdate"));
            }
            rs.close();
            ps.close();
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
            return p;

        }

    }
    public ArrayList<Product> showAll() {
        boolean f = false;
        Product p1= new Product();
        ArrayList<Product> ap = new ArrayList<>();
        try {
            cn = new Connecter().getConnetcion();
            String sql = "select * from product ;";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p1.setId(rs.getInt("id"));
                p1.setName(rs.getString("name"));
                p1.setCategory(rs.getString("category"));
                p1.setProductiondate(rs.getTimestamp("productiondate"));
                p1.setOutdate(rs.getTimestamp("outdate"));
                ap.add(p1);
                System.out.print("产品名：" + rs.getString("name"));
                System.out.print("  产品分类：" + rs.getString("category"));
                System.out.print("  生产日期：" + rs.getTimestamp("productiondate"));
                System.out.println("    保质期：" + rs.getTimestamp("outdate"));
            }
            rs.close();
            ps.close();
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
            return ap;

        }

    }
}
