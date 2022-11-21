<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="get" action="<%=request.getContextPath()%>/BackupRestoreDB" enctype="multipart/form-data">
            <center>
                <h1>BACKUP & RESTORE DATABASE</h1>
                <hr>
                <br>
                <table border="0">
                    <tr>
                        <td width="120">Backup</td>
                        <td width="150"></td>
                        <td><input type="submit" name="backup" value="Backup" id="hijau" /></td>
                    </tr>
                    <tr>
                        <td>Restore</td>
                        <td><input type="file" name="file" ></td>
                        <td><input type="submit" name="restore" value="Restore" id="hijau" /></td>
                    </tr>
                </table>
            </center>
        </form>
    </body>
</html>