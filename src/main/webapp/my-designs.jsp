
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

    <%--    <table class="my-table">--%>
    <%--        <caption>My Design Library</caption>--%>

    <%--        <tr>--%>
    <%--            <th>Name</th>--%>
    <%--            <th>Description</th>--%>
    <%--            <th>Price</th>--%>
    <%--        </tr>--%>

    <%--        <tr>--%>
    <%--            <td>#1Name</td>--%>
    <%--            <td>#1Description</td>--%>
    <%--            <td>#1Price</td>--%>
    <%--        </tr>--%>

    <%--&lt;%&ndash;        <c:forEach var="course" items="${courseList}">&ndash;%&gt;--%>
    <%--&lt;%&ndash;        <tr>&ndash;%&gt;--%>
    <%--&lt;%&ndash;            <td><c:out value="${course.courseName}"/></td>&ndash;%&gt;--%>
    <%--&lt;%&ndash;            <td><c:out value="${course.courseDescription}"/></td>&ndash;%&gt;--%>
    <%--&lt;%&ndash;            <td><c:out value="${course.courseFee}"/></td>&ndash;%&gt;--%>
    <%--&lt;%&ndash;        </tr>&ndash;%&gt;--%>
    <%--&lt;%&ndash;        </c:forEach>&ndash;%&gt;--%>
    <%--    </table>--%>
    <hr>
    <%
        read_data obj_read_data = new read_data();
        List<design_bean> list = obj_read_data.get_values();
        Iterator<design_bean> it_list = list.iterator();
    %>
    <table>
        <caption>All Items</caption>
        <tr>
            <th>Design ID</th>
            <th>Design Name</th>
            <th>Design Type</th>
            <th>In Store</th>
            <th>Design Description</th>
            <th>Action 1</th>
            <th>Action 2</th>
            <th>Action 3</th>
        </tr>

        <%
            while (it_list.hasNext()) {
                design_bean obj_design_bean = new design_bean();
                obj_design_bean = it_list.next();

        %>
        <tr>
            <td><%=obj_design_bean.getDesign_id()%></td>
            <td><%=obj_design_bean.getDesign_name()%></td>
            <td><%=obj_design_bean.getDesign_type()%></td>
            <td><%=obj_design_bean.getIn_store()%></td>
            <td><%=obj_design_bean.getDesign_description()%></td>
            <td><a href="edit_designs_in_design_table.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">Edit</a></td>

            <td><a href="view_selected_item_from_design_table.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">View Item</a></td>
            <td><a href="specifics_add_before_adding_to_store.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">Add item to Store</a></td>
        </tr>
        <%
            }
        %>
    </table>


</div>

<%@include file="footer-bar.jsp"%>