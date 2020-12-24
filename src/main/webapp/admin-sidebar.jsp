<div id="side-bar">
    <div id="prof">
        <div id="profile">
            <div id="prof-pic">
                <img src="./assets/img/prof-pic.jpg" alt="">
            </div>
            <div id="name">
                <h3><%=session.getAttribute("firstName")%></h3>
                <h4><%=session.getAttribute("lastName")%></h4>
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
            <li><a href="profile-settings.jsp">Settings</a></li>
        </ul>
        <div id="buttons">
            <div class="btn-prof"><a href="add-design.jsp">Add User</a></div>
        </div>
    </div>
</div>