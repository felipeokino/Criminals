package Criminals.DAO;

import Criminals.Model.Crime;
import Criminals.Model.Process;
import Criminals.Util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProcessDAO {
    public void inserir(Process process) {
        Connection conn = null;
        PreparedStatement ps = null;

        if(process == null)
            throw new
                    RuntimeException("O produto não pode" +
                    " ser nulo!");
        try {
            conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO PROCESS " +
                    "(ID, CRIMES, CRIMINALS) " +
                    "VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Math.toIntExact(process.getId()));
            ps.setArray(2, (Array) process.getCrimes());
            ps.setArray(3, (Array) process.getCriminal());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(conn);
        }
    }

    public List<Process> getProdutos() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM CRIMES";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Process> processes =
                    new ArrayList<Process>();
            while(rs.next()) {
                Process process = new Process();
                process.setId((long) rs.getInt(1));
                process.setCrimes((List<Crime>) rs.getArray(2));
                processes.add(process);
            }
            return processes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(conn);
        }
    }

}
