package DAO;

import Entity.kullanici;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

;

/**
 *
 * @author oktao
 */
public class kullaniciDAO extends DBConnection {

    public void create(kullanici k) {
        try {
            Statement st = this.connect().createStatement();
            String query = "insert into kullanicilar (kuladi,sifre,adi,soyadi,mail) values ('" + k.getKuladi() + "','" + k.getSifre() + "','" + k.getAdi() + "','" + k.getSoyadi() + "','" + k.getMail() + "')";
            st.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(kullanici k) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update category set kuladi='" + k.getKuladi() + "' where kullaniciid= " + k.getKullaniciid();
            st.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(kullanici k) {
        try {
            Statement st = this.connect().createStatement();
            String query = "delete from kullanicilar where kullaniciid=" + k.getKullaniciid();
            st.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<kullanici> getList() {
        List<kullanici> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from kullanicilar";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                list.add(new kullanici(rs.getInt("kullaniciid"), rs.getString("kuladi"), rs.getString("sifre"), rs.getString("adi"), rs.getString("soyadi"), rs.getString("mail"), rs.getTimestamp("tarih")));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
