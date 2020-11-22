<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aruma Project</title>
</head>
<body>

	<% String design_id=(String)request.getParameter("design_id"); %>
	
	<form action="WishlistServlet" method="post">
	  <label for="design_id"><i class="fa fa-user"></i></label>
      <input type="hidden"  name="design_id" value="<%=design_id%>">
      
      <input type="submit" value="Add to wishlist" class="btn">
	</form>

</body>
</html>