<%@include file="header-bar.jsp"%>
</body>
</html>
<%@ page import="com.read.design_bean" %>
<%@ page import="com.read.edit_values" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <style>

        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even){background-color:  orange;}



        th {
            background-color: var(--main-orange);
            color: white;
        }
    </style>

    <link rel="stylesheet" href="./assets/css/footer.css">
    <link rel="stylesheet" href="./assets/css/view_one_item.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>







<%
    String design_id = (String) request.getParameter("design_id");

    edit_values obj_edit_values = new edit_values();
    design_bean obj_design_bean = obj_edit_values.get_value_of_design(design_id);


%>
<h1 style="position: absolute; left: 100px; top:170px; font-family: sans-serif; color: blue">Design <%=design_id%></h1><br><br>
<div class="values">

    <h4 style="font-family: sans-serif; color: orangered">Design Name : </h4><h3><%=obj_design_bean.getDesign_name()%></h3><br>
    <h4 style="font-family: sans-serif; color: orangered">Design Type : </h4><h3><%=obj_design_bean.getDesign_type()%></h3><br>
    <h4 style="font-family: sans-serif; color: orangered">In Store : </h4><h3><%=obj_design_bean.getIn_store()%></h3><br>
    <h4 style="font-family: sans-serif; color: orangered">Description : </h4><h3><%=obj_design_bean.getDesign_description()%></h3><br>
    <h4 style="font-family: sans-serif; color: orangered"><a href="edit_designs_in_design_table.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">Edit</a></h4><br>
    <h4><a href="specifics_add_before_adding_to_store.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">Add item to Store</a></h4><br>
    <h4><a href="specifics_added.jsp " >View Specifics added</a></h4>
</div>

<div class="image1">

</div>



</body>
</html>
