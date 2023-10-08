<%-- 
    Document   : viewDepartmnet
    Created on : 08-Oct-2023, 23:56:01
    Author     : REDTECH
--%>

<%@page import="java.util.List"%>
<%@page import="dto.Department"%>
<%@page import="dao.DepartmentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
                <div class="container">
                    <div class="jumbotron">
                        <h1>Department</h1>
                        <p>All Details of Department</p>

                        <table class="table table-dark table-striped">
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Active Status</th>
                            </tr>

                            <%
                                List<Department> list = DepartmentDAO.searchAll();

                                for (Department department : list) {
                            %>
                            <tr>
                                <td><%=department.getCode()%></td>
                                <td><%=department.getName()%></td>
                                <td><%=department.isIsactive()%></td>
                            </tr>

                            <%
                                }
                            %>

                        </table>
                        <!-- <a herf="Department.jsp"> <button>Back to Department Saving</button></a>    -->
                        <a href="Department.jsp"> <button type="button" class="btn btn-success">Back to Department Saving</button></a>
                    </div>

                </div>
            </div>
            <div class="col-sm-3"></div>               
        </div>      
    </body>
</html>
