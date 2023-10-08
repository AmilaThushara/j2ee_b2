<%-- 
    Document   : Department
    Created on : 06-Oct-2023, 18:47:12
    Author     : REDTECH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div>Department</div>         
            <form action="DepartmentSave" method="post">
                    <div class="form-group">
                        <label>Code</label>
                        <input type="text" id="code" name="code" class="form-control">
                    </div>
                    
                      <div class="form-group">
                        <label>Name</label>
                        <input type="text" id="depname" name="depname" class="form-control">
                    </div>
                    
                      <div class="form-group">
                        <label>Active Inactive Status</label>
                        <input type="text" id="state" name="state" class="form-control">
                    </div>
                    
                    <button type="submit" class="btn btn-danger">Save This Department</button>
                    <a href="ViewDepartmnet.jsp"> <button type="button" class="btn btn-success">View All</button></a>
                </form>
                
                     
        </div>
    </body>
</html>
