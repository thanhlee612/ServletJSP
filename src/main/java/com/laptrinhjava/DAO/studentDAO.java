package com.laptrinhjava.DAO;

import com.laptrinhjava.Connection.JDBCConnection;
import static com.laptrinhjava.Connection.JDBCConnection.getConnection;
import com.laptrinhjava.Model.listStudent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class studentDAO {

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    public List<listStudent> getfindAll() {
        List<listStudent> result = new ArrayList<>();
        String sql = "select* from student1";
        connection = JDBCConnection.getConnection();
        if (connection != null) {
            try {
                statement = connection.prepareStatement(sql);// truyen cau truy van vao mysql            
                resultSet = statement.executeQuery();//statement execute cau truy van va tra ve resultSet
                while (resultSet.next()) {
                    listStudent student = new listStudent();//resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3)
                    student.setId(resultSet.getString("id"));
                    student.setName(resultSet.getString("name"));
                    student.setAddress(resultSet.getString("address"));
                    result.add(student);
                }
                return result;
            } catch (SQLException ex) {
                return null;
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                    if (statement != null) {
                        statement.close();
                    }
                    if (resultSet != null) {
                        resultSet.close();
                    }
                } catch (SQLException ex) {
                    return null;
                }
            }
        }
        return null;
    }

    public void deleteStudent(String id) {
        String sql = "delete from student1 where id = ? ";
        try {
            connection = getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.executeUpdate();
           
        } catch (SQLException e) {
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {

            }
        }
    }

    public void deleteAllStudent() {
        String sqlAll = "delete from student1";
        try {
            connection = getConnection();
            statement = connection.prepareStatement(sqlAll);
            statement.executeUpdate();
        } catch (SQLException e) {
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {

            }
        }
    }

    public void InsertStudent(String id, String name, String address) {
        String sql = "insert into student1 values(?, ?, ?)";
        try {
            connection = getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.setString(2, name);
            statement.setString(3, address);
            statement.executeUpdate();
            int resultSet = statement.executeUpdate();
            System.out.println(resultSet);
        } catch (SQLException ex) {
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {
            }
        }
    }

    public listStudent getStudentbyID(String id) {
        String sql = "select * from student1 where id=?";
        try {
            connection = getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                return new listStudent(resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getString("address"));
//            st.setId(resultSet.getInt("id"));
//            st.setName(resultSet.getString("name"));
//            st.setAddress(resultSet.getString("address"));
            }
        } catch (SQLException e) {
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {

            }
        }
        return null;
    }

    public void UpdateStudent(String id, String name, String address) {
        String sql = "update student1 set name=?, address=? where id=?";
        try {
            connection = getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, address);
            statement.setString(3, id);
            statement.executeUpdate();

        } catch (SQLException ex) {
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {

            }
        }

    }
    public static void main(String[] args) {
        studentDAO dao = new studentDAO();
        dao.InsertStudent(null,"hello", "HowAreYou");
    }
}
