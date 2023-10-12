<%@page import = "java.sql.Connection" %>
<%@page import = "com.to.jdbc.DBcon" %>
<%@page import = "com.to.entity.user" %>
<%@page import = "com.task.dao.UserDao" %>
<%@page import = "java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View details</title>
<%@include file = "css.jsp" %>
</head>
<body class="bg-light">
<%@include file = "Navbar.jsp" %>

<% Connection con = DBcon.getCon();
%>

<div class="container p-4">
<div class="card">
<div class="card-body">
<p class="fs-1 text-center ">All Tasks Details</p>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Subjects</th>
      <th scope="col">Chapters</th>
      <th scope="col">Date</th>
       <th scope="col">Status</th>
      <th scope="col">Remove</th>
    </tr>
  </thead>
  <tbody>
  
  <%
  UserDao dao = new UserDao(DBcon.getCon());
  List<user> list = dao.getAll();
  for(user u:list){
  %>
   <tr>
      <th scope="row">
      <td><%=u.getSub() %></td>
      <td><%=u.getChap() %></td>
      <td><%=u.getDate() %></td>
      <td><%=u.getStatus() %></td>
      <td><a href="delete?id=<%=u.getId() %>" class="btn btn-sm btn-danger ms-1">Delete</a></td>
    </tr>
  <%
  }
  %>
  
   
    
   
  </tbody>
</table>
<a href="index.jsp" class="btn btn-sm btn-primary ms-1">Exit</a>
</div>
</div>

</div>
<%@include file = "js.jsp" %>
</body>
</html>