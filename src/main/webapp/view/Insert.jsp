<%-- 
    Document   : Insert
    Created on : Dec 7, 2021, 8:30:03 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="add" method="post" >
            <table>                
                 <tr>
                    <td>Name</td>                    
                    <td><input type="text" name="name" /><td>                   
                </tr>
                 <tr>
                    <td>Address</td>                  
                    <td><input type="text" name="address" /><td>
                </tr>
            </table>         
            <input type="submit" value="Insert"></input>        
        </form>
    </body>
</html>
