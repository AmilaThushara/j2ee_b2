/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dbconnection.DB.getConnection;
import dto.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author REDTECH
 */
public class DepartmentDAO {

    public static int save(Department department) {
        int isSave = 0;
        try {
            String sql = "insert into department values (?,?,?)";
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, department.getCode());
            ps.setString(2, department.getName());
            ps.setBoolean(3, department.isIsactive());
            isSave = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSave;
    }

    public  static List<Department> searchAll() {
        List<Department> list = new ArrayList<>();
        try (Connection con = dbconnection.DB.getConnection()) {
            String sql = "SELECT * FROM department";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String code = resultSet.getString("code");
                String name = resultSet.getString("name");
                boolean state = resultSet.getBoolean("isactive");
                Department department = new Department();
                department.setCode(code);
                department.setName(name);
                department.setIsactive(state);
                list.add(department);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
