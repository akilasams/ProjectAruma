<%@include file="header-bar.jsp"%>
<%@ page import="com.read.designReadDao" %>
<%@ page import="com.read.designReadMem" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.viewstore.viewSpecificsMem" %>
<%@ page import="com.viewstore.viewSpecificsDao" %>
<%--<%--%>
<%--    if(session.getAttribute("username")==null){--%>
<%--        response.sendRedirect("login.jsp");--%>
<%--    }--%>
<%--%>--%>

<c:if test="${userId == null}">
    <c:redirect url="login.jsp"></c:redirect>
</c:if>


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
<%
    String design_id = (String) request.getParameter("design_id");
%>
<div class="table-wrapper">
    <mini-nav>
        <ul id="mini-nav">
            <li><a href="">Advanced Search</a></li>
            <li><a href="">Categories</a></li>
            <li><a href="">Sort</a></li>

        </ul>
    </mini-nav>


    <hr>
    <%
        viewSpecificsDao obj_view_specificsDao = new viewSpecificsDao();
        List<viewSpecificsMem> list = obj_view_specificsDao.get_values(design_id);
        Iterator<viewSpecificsMem> it_list = list.iterator();
    %>
    <table>
        <caption>All Specifics</caption>
        <tr>
            <%--            <th>Go to Store Id</th>--%>
            <th>Stock</th>
            <th>Unit Price</th>
            <th>Additional Details</th>
            <th>Published Date</th>
            <th>Design Id</th>
            <th>Action </th>

        </tr>

        <%
            while (it_list.hasNext()) {
                viewSpecificsMem obj_view_specificsMem = new viewSpecificsMem();
                obj_view_specificsMem = it_list.next();

        %>


        <tr>
            <%--            <td><%=obj_view_specificsMem.getGoto_store_id()%></td>--%>
            <td><%=obj_view_specificsMem.getStock()%></td>
            <td><%=obj_view_specificsMem.getUnit_price()%></td>
            <td><%=obj_view_specificsMem.getAdditional_details()%></td>
            <td><%=obj_view_specificsMem.getPublished_date()%></td>
            <td><%=obj_view_specificsMem.getDesign_id()%></td>
            <%--            <td><a href="specifics_Edit.jsp?design_id=<%=obj_view_specificsMem.getDesign_id()%>">Edit</a></td>--%>
            <%--            <td><a href="specifics_Delete.jsp?design_id=<%=obj_view_specificsMem.getDesign_id()%>">Delete</a></td>--%>

            <%--            <td><a href="items_in_store.jsp">Publish Item</a></td>--%>
            <td><div class="dropdown">
                <button class="dropbtn"><p><i class="arrow down"></i></p></button>
                <div class="dropdown-content">
                    <a href="specifics_Edit.jsp?design_id=<%=obj_view_specificsMem.getDesign_id()%>">Edit</a>
                    <a href="specifics_Delete.jsp?design_id=<%=obj_view_specificsMem.getDesign_id()%>">Delete</a>
<%--                    <a href="store-home.jsp">Publish Item</a>--%>
                    <a><form action="ViewAllItemsServlet" method="post">

                        <button type="submit" value="submit">Publish Item</button>
                    </form></a>

<%--                    <a><input type="submit" value="ViewAllItemsServlet" onclick="form.action='ViewAllItemsServlet';"></a>--%>

                </div>
            </div></td>

        </tr>
        <%
            }
        %>

    </table>
</div>

<%@include file="footer-bar.jsp"%>