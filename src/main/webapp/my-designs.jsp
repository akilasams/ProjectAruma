
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.read.read_data" %>
<%@ page import="com.read.design_bean" %>
<%@include file="header-bar.jsp"%>

<%
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }
%>

<head>
    <link rel="stylesheet" href="./assets/css/tables.css">
    <link rel="stylesheet" href="./assets/css/side-nav.css">

    <style>
        .dropbtn {
            background-color: #FFA543;
            color: white;
            padding: 16px;
            font-size: 16px;
            border: none;
        }

        /*.dropdown {*/
        /*    position: relative;*/
        /*    display: inline-block;*/
        /*}*/

        .dropdown-content {
            display: none;
            position: absolute;
            background-color: #f1f1f1;
            min-width: 160px;
            box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
            z-index: 1;
        }

        .dropdown-content a {
            color: black;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
        }

        .dropdown-content a:hover {background-color: #ddd;}

        .dropdown:hover .dropdown-content {display: block;}

        .dropdown:hover .dropbtn {background-color:#FFA543;}

        .arrow {
            border: solid black;
            border-width: 0 3px 3px 0;
            display: inline-block;
            padding: 3px;
        }

        .down {
            transform: rotate(45deg);
            -webkit-transform: rotate(45deg);
        }

    </style>

</head>
<div class="table-wrapper">
    <mini-nav>
        <div id="prof-info">
            <img src="./assets/img/prof-pic.jpg" id="prof-img" alt="">
            <h3><%=session.getAttribute("firstName")%></h3>
            <h4><%=session.getAttribute("lastName")%></h4>
            <h3 id="rating">6.5/10</h3>
        </div>

        <ul id="mini-nav">
            <li><a href="">Advanced Search</a></li>
            <li><a href="">Categories</a></li>
            <li><a href="">Sort</a></li>
            <li><a href="">Price Range</a></li>
        </ul>
    </mini-nav>


    <hr>
    <%
        read_data obj_read_data = new read_data();
        List<design_bean> list = obj_read_data.get_values();
        Iterator<design_bean> it_list = list.iterator();
    %>
    <table>
        <caption>All Items</caption>
        <tr>
<%--            <th>Design ID</th>--%>
            <th>Design Name</th>
            <th>Design Type</th>
            <th>In Store</th>
            <th>Description</th>
            <th>Action</th>

        </tr>

        <%
            while (it_list.hasNext()) {
                design_bean obj_design_bean = new design_bean();
                obj_design_bean = it_list.next();

        %>
        <tr>
<%--            <td><%=obj_design_bean.getDesign_id()%></td>--%>
            <td><%=obj_design_bean.getDesign_name()%></td>
            <td><%=obj_design_bean.getDesign_type()%></td>
            <td><%=obj_design_bean.getIn_store()%></td>
            <td><%=obj_design_bean.getDesign_description()%></td>
            <td><div class="dropdown">
                <button class="dropbtn"><p><i class="arrow down"></i></p></button>
                <div class="dropdown-content">
                    <a href="view-mydesigns.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">Preview</a>
                    <a href="edit_designs_in_design_table.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">Edit</a>
                    <a href="specifics_add_before_adding_to_store.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">Add to store</a>
                </div>
            </div></td>

<%--            <td><a href="edit_designs_in_design_table.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">Edit</a></td>--%>

<%--            <td><a href="view_selected_item_from_design_table.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">View Item</a></td>--%>
<%--            <td><a href="specifics_add_before_adding_to_store.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">Add item to Store</a></td>--%>
        </tr>
        <%
            }
        %>
    </table>


</div>

<%@include file="footer-bar.jsp"%>