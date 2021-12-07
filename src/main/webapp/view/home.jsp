<%-- 
    Document   : home
    Created on : Nov 30, 2021, 8:38:03 PM
    Author     : ASUS
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%--<jsp:useBean id="a" class="com.laptrinhjava.demo1.connection.JDBCConnection" scope="request"></jsp:useBean>--%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chu</title>
    </head>
    <body>
        <h1 style="color:red">Xin chao lop JavaWeb</h1>
        <%--<c:forEach items="${a.getfindAll}" var="i">
            id: ${i.id}
            name: ${i.name}
            address: ${i.address}
        </c:forEach>--%>
        <div>
            <h1>Use Servlet load Database</h1>
            <table border="1px solid">
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>address</th>
                    <th>Update</th>
                    <th>Delete</th>
                    <th> <a href="#" onclick="showDelAll()">Delete all</a></th>
                </tr>
                <c:forEach items="${listS}" var="o">
                    <tr>                        
                        <td>${o.id}</td>
                        <td>${o.name}</td>
                        <td>${o.address}</td>
                        <td> <a href="update?sid=${o.id}">Cap Nhat</a></td>
                        <td> <a href="#" onclick="showMess(${o.id})">Xoa</a></td>
                    </tr>
                </c:forEach> 

            </table> 
            <a href="view/Insert.jsp">Add student</a>            
        </div>

        <script>
            function showMess(id) {
                var option = confirm("You want delete option?");
                if (option === true) {
                    window.location.href = "delete?sid=" + id;//=`delete?sid=`;
                }
            }
            function showDelAll() {
                var option = confirm("You want delete All option? Are you sure?");
                if (option === true) {
                    window.location.href = "delete";
                }
            }
        </script>
    </body>
</html>
