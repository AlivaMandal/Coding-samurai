<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add tasks</title>
<%@include file = "css.jsp" %>
</head>
<body class="bg-light">
<%@include file = "Navbar.jsp" %>

<div class="container p-4">
<div class = "row">
<div class="col-md-6 offset-md-3">
<div class="card">
<div class="card-body">
<p class="fs-3 text-center">Add Task</p>

<form action="reg" method="post"> 
  <div class="mb-3">
    <label class="form-label">subject</label>
    <input type="text" name="sub" class="form-control" required>
  </div>
  <div class="mb-3">
    <label class="form-label">chapter</label>
    <input type="text" name="chap" class="form-control" required>
  </div>
  <div class="mb-3">
    <label class="form-label">Last Date</label>
    <input type="date" name="date" class="form-control" required>
  </div>
  <div class="mb-3">
    <label class="form-label">Status</label>
    <input type="text" name="status" class="form-control" required>
  </div>
  
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input">
    <label class="form-check-label">Checked</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</div>
</div>
</div>
</div>
<%@include file = "js.jsp" %>
</body>
</html>