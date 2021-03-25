<div id="side-bar">
    <div id="prof">
        <div id="profile">
            <div id="prof-pic">
                <img src="assets/img/users/prof-pic.jpg" alt="">
            </div>
            <div id="name">
                <h3>${currentUser.getFirstName()}</h3>
                <h4>${currentUser.getLastName()}</h4>
            </div>
        </div>
    </div>
    <div id="links">
        <ul id="side-bar-links">
            <li><a href="user-reqs-and-msgs.jsp">Requests & Messages</a></li>
            <li><a href="cart.jsp">My Cart</a></li>
            <li><a href="my-courses.jsp">My Courses</a></li>
            <li><a href="<%=request.getContextPath()%>/GoToProfileSettingsUserServlet"">Settings</a></li>
        </ul>
    </div>
</div>