<%-- 
    Document   : Update
    Created on : Dec 7, 2021, 8:13:00 AM
    Author     : ASUS
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="update" method="post" >
            <table>   
                <tr>
                    <td>ID</td>                    
                    <td><input value="${st.id}" type="text" name="id" readonly /><td>                   
                </tr>
                 <tr>
                    <td>Name</td>                    
                    <td><input value="${st.name}" type="text" name="name"  /><td>                   
                </tr>
                 <tr>
                    <td>Address</td>                  
                    <td><input value="${st.address}" type="text" name="address" /><td>
                </tr>
            </table>         
            <input type="submit" value="Update"></input>
        </form>
    </body>
</html>
