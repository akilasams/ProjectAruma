

<%@ page import="com.addUser.AddUser" %>
<%@ page import="com.addUser.AddUserDao" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.addUser.AddUserServlet" %>

<%@include file="header-bar.jsp"%>

<link rel="stylesheet" href="./assets/css/user-details.css">

<%
    AddUserDao obj_read_data = new AddUserDao();
    List<AddUser> list = obj_read_data.get_values();
    Iterator<AddUser> it_list = list.iterator();
%>

<%--<div class="wishlist-container">--%>

<div class="user">
    <h4 style="color: black"></h4>
    <%--        <a href="#" class="close-wishlist"><i class="fas fa-times"></i></a>--%>
    <div class="user-information">

        <center>
            <h2>User</h2>

            <table border="1">
                <tr>
                    <td>
                        <u>User_id</u>
                    </td>
                    <td>
                        <u>First_name</u>
                    </td>
                    <td>
                        <u>Last_name</u>
                    </td>
                    <td>
                        <u>User_role_id</u>
                    </td>
                    <td>
                        <u>Email</u>
                    </td>
                    <td>
                        <u>Mobile_no</u>
                    </td>
                    <td>
                        <u>Address</u>
                    </td>
                    <td>
                        <u>city</u>
                    </td>
                    <%-- <td>
                        <u>Username</u>
                    </td>
                    <td>
                        <u>Password</u>
                    </td>--%>
                    <td>
                        <u>Category_id</u>
                    </td>
                    <td>
                        <u>Bio</u>
                    </td>
                    <td>
                        <u>Prof_pic</u>
                    </td>
                    <td>
                        <u>Delete</u>
                    </td>
                    <td>
                        <u>Update</u>
                    </td>
                </tr>



                    <%
                while (it_list.hasNext()) {
                    AddUser obj_user_bean = new AddUser();
                    obj_user_bean = it_list.next();

		 %>

                <div class="user-details">

                    <div class="user-info">
                        <tr>
                            <td><%=obj_user_bean.getUser_id()%></td>
                            <td><%=obj_user_bean.getFirst_name()%></td>
                            <td><%=obj_user_bean.getLast_name()%></td>
                            <td><%=obj_user_bean.getUser_role_id()%></td>
                            <td><%=obj_user_bean.getEmail()%></td>
                            <td><%=obj_user_bean.getMobile_no()%></td>
                            <td><%=obj_user_bean.getAddress()%></td>
                            <td><%=obj_user_bean.getCity()%></td>
                            <%-- <td><%=obj_user_bean.getUsername()%></td>
                            <td><%=obj_user_bean.getPassword()%></td>--%>
                            <td><%=obj_user_bean.getCategory_id()%></td>
                            <td><%=obj_user_bean.getBio()%></td>
                            <td><%=obj_user_bean.getProf_pic()%></td>

                            <td><a href="delete-user.jsp?user_id=<%=obj_user_bean.getUser_id()%>">Delete</a></td>
                            <td><a href="update-user-details.jsp?user_id=<%=obj_user_bean.getUser_id()%>">Edit</a></td>
                        </tr>
                        </td>
                    </div>

                </div>

    </div>

    <%
        }
    %>
    </table>
    </center>
</div>

</div>


<%--</div>--%>

<%@include file="footer-bar.jsp"%>