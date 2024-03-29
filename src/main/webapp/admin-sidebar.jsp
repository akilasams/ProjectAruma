<div id="side-bar">
    <div id="prof">
        <div id="profile">
            <div id="prof-pic">
                <img src="assets/img/users/prof-pic.jpg" alt="">
            </div>
            <div id="name">
                <h3>${currentUser.getFirstName()}</h3>
                <h4>${currentUser.getLastName()}</h4>
                <h5>Admin</h5>
            </div>
        </div>
    </div>
    <div id="links">
        <ul id="side-bar-links">
            <li><a href="user-management.jsp">User Management</a></li>
            <li><a href="reqs-and-msgs.jsp">Request & Messages</a></li>
            <li><a href="reviews.jsp">Reviews</a></li>
            <li><a href="reports.jsp">Reports</a></li>
            <li><a href="<%=request.getContextPath()%>/GoToProfileSettingsUserServlet">Settings</a></li>
        </ul>
        <div id="buttons">
            <div class="btn-prof"><a href="add-new-user.jsp">Add User</a></div>
        </div>
    </div>
</div>