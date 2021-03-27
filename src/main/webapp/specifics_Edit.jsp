

<%@ page import="com.viewstore.editSpecifics" %>
<%@ page import="com.viewstore.viewSpecificsMem" %>
<%@ page import="com.read.designReadMem" %>
<%@ page import="com.read.editValuesDao" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDate" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Update Specifics</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/forms.css">
    <script src="assets/js/forms.js"></script>
</head>
<body>

<%
    String design_id = (String) request.getParameter("design_id");

    editSpecifics obj_editSpecifics = new editSpecifics();
    viewSpecificsMem obj_view_specificsMem = obj_editSpecifics.get_values_of_store_items(design_id);
    LocalDate myObj = LocalDate.now();

%>

<div id="form-container">
    <h2>Update Specifics</h2>
    <form action="EditSpecificsServlet" method="post">
        <input type="hidden" name="design_id" value="<%=design_id%>" placeholder="design_id"><br>
        <input type="text" name="stock" value="<%=obj_view_specificsMem.getStock()%>" placeholder="Stock"><br>
        <input type="text" name="unit_price" value="<%=obj_view_specificsMem.getUnit_price()%>" placeholder="Unit Price"><br>
        <input type="text" name="additional_details" value="<%=obj_view_specificsMem.getAdditional_details()%>" placeholder="Additional Details" style="height: 70px" ><br>
        <input type="hidden" name="published_date" value="<%=myObj%>"  placeholder="Published date"><br>
        <button type="submit" name="submit">Update Specifics</button>
    </form>
</div>
</body>
</html>