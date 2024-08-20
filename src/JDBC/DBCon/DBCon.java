package JDBC.DBCon;

import java.sql.*;

public class DBCon {
    public static final String DB_URL = "jdbc:mysql://localhost/universty";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "";

    public static void main(String[] args){
        Connection connect = null;

        //String stSql = "DELETE FROM student WHERE student_id=4";
        //String prSql = "DELETE FROM student WHERE student_id=?";

        //String stSql = "UPDATE student SET student_name='Elif Akın' WHERE student_id=1";
        //String prSql ="UPDATE student SET student_name=? WHERE student_id=?";
        //String insertSql = "INSERT INTO student (student_name,student_class) VALUES ('Damla',4)";
        //String prSql = "INSERT INTO student (student_name,student_class) VALUES (?,?)";

        //String sql = "SELECT * FROM student";
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            connect.setAutoCommit(false);
            PreparedStatement pr = connect.prepareStatement("INSERT INTO student (student_name,student_class) VALUES (?,?)");
            pr.setString(1,"Merve");
            pr.setInt(2,3);
            pr.executeUpdate();

            if(true){
                throw new SQLException();
            }

            pr.setString(1,"Beyza");
            pr.setInt(2,4);
            pr.executeUpdate();


            connect.commit();
            pr.close();
            connect.close();

            //Statement st = connect.createStatement();
            //st.executeUpdate(stSql);

           // Statement st = connect.createStatement();
            //System.out.println(st.executeUpdate(insertSql));

            // silme işlemi
           /* PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setInt(1,3);
            pr.executeUpdate();*/


            // ekleme
           /* PreparedStatement prSt= connect.prepareStatement(prSql);
            prSt.setString(1,"Ahmet");
            prSt.setInt(2,3);
            prSt.executeUpdate();
            prSt.close();

            // GÜncelleme
            PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setString(1,"Merve");
            pr.setInt(2,4);
            pr.executeUpdate();
            */

            /*
            st.executeQuery(sql);

            ResultSet data = st.executeQuery(sql);

            data.next();
            data.next();
            data.first();
            data.absolute(2);
            System.out.println(data.getString("student_name"));

            while(data.next()){
                System.out.println("ID : "+data.getInt("student_id"));
                System.out.println("Ad : " + data.getString("student_name"));
                System.out.println("Sınıf : "+ data.getInt("student_class"));
            }*/

           /* st.close();
            connect.close();
            pr.close();*/
        } catch (SQLException e) {

            if(connect != null) {
                try {
                    connect.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            System.out.println(e.getMessage());
        }
    }
}
