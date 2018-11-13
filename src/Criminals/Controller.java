package Criminals;

import Criminals.DAO.UserDAO;
import Criminals.Model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/controller")
public class Controller extends HttpServlet {
        private static final long serialVersionUID = 1L;

        public Controller()
        {
            super();
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();

            String name = request.getParameter("f_name");
            String cpf = request.getParameter("l_name");
            String birth = request.getParameter("birth");
            String office = request.getParameter("phone");

        }

        public  String insertuser() throws SQLException {

            UserDAO uDao = new UserDAO();
            User user = new User();

            insertuser();
            return "successfully added";
        }
        public String update() throws SQLException {
            String sql = "update Reg set pass=?,emailid=?,phoneno=? where name=?";
            Connection con = null;
            PreparedStatement prep = null;
            modifyUser(sql);
            return "successfully update";
        }

        private void modifyUser(String sql) throws SQLException {
            Connection con;
            PreparedStatement prep;
            try
            {
                Class.forName("org.hsqldb.jdbcDriver");
                con = DriverManager.getConnection(
                        "jdbc:hsqldb:hsql://localhost/lojadb",
                        "sa", "");
                prep = con.prepareStatement(sql);
                prep.setString(1, "nam");
                prep.setString(2, "pass");
                prep.setString(3, "email");
                prep.setString(4, "phono");
                prep.executeUpdate();
                prep.close();
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }

        public  String delete() throws SQLException
        {

            String sql = "delete form Reg where name=?";
            Connection con = null;
            PreparedStatement prep = null;

            try
            {
                Class.forName("org.hsqldb.jdbcDriver");
                con = DriverManager.getConnection(
                        "jdbc:hsqldb:hsql://localhost/lojadb",
                        "sa", "");
                prep = con.prepareStatement(sql);

            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
            return "successfully delete";
        }
    }
