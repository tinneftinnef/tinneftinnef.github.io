<%-- 
    Document   : list
    Created on : Feb 27, 2023, 10:42:40 AM
    Author     : GangsterCao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Đơn Hàng</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
    <center>
        <div class="container">
            <h2>Danh Sách Đơn Hàng</h2>
            <a href="new.jsp" button type="button" class="btn btn-success">
                Thêm Đơn Hàng
            </a>
            <a href="new.jsp" button type="button" class="btn btn-info">
                Sửa Đơn Hàng
            </a>
            <a href="new.jsp" button type="button" class="btn btn-danger">
                Xóa Đơn Hàng
            </a>

            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Đơn Hàng ID</th>
                        <th>Tên Đơn Hàng</th>
                        <th>Ngày Đặt Hàng</th>
                        <th>Tên Khách Đặt Hàng</th>
                        <th>Địa Chỉ Giao Hàng</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${requestScope.data}" var="phantu">
                        <c:set var="id" value="${phantu.donhangid}"/>
                        <tr>
                            <td>${id}</td>
                            <td>${phantu.tendonhang}</td>
                            <td>${phantu.ngaydathang}</td>
                            <td>${phantu.tenkhachdat}</td>
                            <td>${phantu.diachigiao}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </center>
</body>
</html>
