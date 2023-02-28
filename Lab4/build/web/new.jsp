<%-- 
    Document   : new
    Created on : Feb 28, 2023, 6:59:59 PM
    Author     : GangsterCao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Thêm Đơn Hàng</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body> 
        <div class="container">
            <h1>Thêm Đơn Hàng</h1>
            <h2 class="btn btn-link" >${requestScope.error}</h2>
            <form action="add">
                <div class="form-group">
                    <label for="ids">Đơn hàng ID:</label>
                    <input type="text" class="form-control" id="ids" placeholder="Enter ID" name="donhangid">
                </div>
                <div class="form-group">
                    <label for="tdn">Tên đơn hàng:</label>
                    <input type="text" class="form-control" id="tdn" placeholder="Enter name" name="tendonhang">
                </div>
                <div class="form-group">
                    <label for="ndh">Ngày đặt hàng:</label>
                    <input type="date" class="form-control" id="ndh" placeholder="Enter date" name="ngaydathang">
                </div>
                <div class="form-group">
                    <label for="tkd">Tên khách đặt:</label>
                    <input type="text" class="form-control" id="tkd" placeholder="Enter name" name="tenkhachdat">
                </div>
                <div class="form-group">
                    <label for="dcg">Địa chỉ giao:</label>
                    <input type="text" class="form-control" id="dcg" placeholder="Enter name" name="diachigiao">
                </div>
                <input type="submit" value="SAVE"/>
            </form>
            
        </div>
    </body>
</html>
