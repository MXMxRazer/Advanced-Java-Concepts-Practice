import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
        String url = "jdbc:postgresql://localhost:5432/jdbc_tests";
        Connection conn = null;

        int id = 1;
        String name = "first";
        int age = 20;
        String sql = "INSERT INTO student(id, name, age) VALUES (" + id + ", '" + name + "', " + age + ");";

        try
        {
            conn = DriverManager.getConnection(url, "postgres", "Xandra-102");

            Statement st = conn.createStatement();
            int ret = st.executeUpdate(sql);

            if (ret == 1)
            {
                System.out.println("INSERTION SUCCESSFULL!: " + sql);
            } else
            {
                System.out.println("INSERTION FAILED!");
            }

        } catch (Exception e)
        {
            System.out.println("EXCEPTION: " + e.getMessage());
        } finally
        {
            assert conn != null;
            conn.close();
        }

    }
}