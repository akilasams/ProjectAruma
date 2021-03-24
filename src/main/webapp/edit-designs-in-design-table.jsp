
<%@ page import="com.read.design_bean" %>
<%@ page import="com.read.edit_values" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Add Design</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/forms.css">
    <script src="assets/js/forms.js"></script>
</head>
<body>

<%
    String design_id = (String) request.getParameter("design_id");

    edit_values obj_edit_values = new edit_values();
    design_bean obj_design_bean = obj_edit_values.get_value_of_design(design_id);


%>

<div id="form-container">
    <h2>Update Design</h2>
    <form action="EditDesignsServlet" method="post">
        <input type="hidden" name="design_id" value="<%=design_id%>" placeholder="Stock"><br>
        <input type="text" name="design_name" value="<%=obj_design_bean.getDesign_name()%>" placeholder="Enter Design Type"><br>
        <input type="text" name="design_type" value="<%=obj_design_bean.getDesigntype_id()%>" placeholder="Enter Design Type"><br>
        <input type="text" name="design_description" value="<%=obj_design_bean.getDesign_description()%>" style="height: 70px" placeholder="Write Something About the Course"></textarea><br>

        <button type="submit" name="submit">Update My Design</button>
    </form>
</div>
</body>
</html>


