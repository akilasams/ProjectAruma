

<%@ page import="com.viewstore.Edit_values" %>
<%@ page import="com.viewstore.view_bean" %>
<%@ page import="com.read.design_bean" %>
<%@ page import="com.read.edit_values" %>
<%@ page import="java.util.Date" %>
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

    Edit_values obj_Edit_values = new Edit_values();
    view_bean obj_view_bean = obj_Edit_values.get_values_of_store_items(design_id);
    Date date = new Date();

%>

<div id="form-container">
    <h2>Update Specifics</h2>
    <form action="EditSpecificsServlet" method="post">
        <input type="hidden" name="design_id" value="<%=design_id%>" placeholder="design_id"><br>
        <input type="text" name="stock" value="<%=obj_view_bean.getStock()%>" placeholder="Stock"><br>
        <input type="text" name="unit_price" value="<%=obj_view_bean.getUnit_price()%>"  placeholder="Unit Price"><br>
        <input type="text" name="additional_details" value="<%=obj_view_bean.getAdditional_details()%>" placeholder="Additional Details" style="height: 70px" ><br>
        <input type="hidden" name="published_date" value="<%=date.toString()%>"  placeholder="Published date"><br>
        <button type="submit" name="submit">Update Specifics</button>
    </form>
</div>
</body>
</html>