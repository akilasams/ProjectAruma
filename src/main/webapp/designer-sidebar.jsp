<div id="side-bar">
    <div id="prof">
        <div id="profile">
            <div id="prof-pic">
                <img src="./assets/img/prof-pic.jpg" alt="">
            </div>
            <div id="name">
                <h3><%=session.getAttribute("firstName")%></h3>
                <h4><%=session.getAttribute("lastName")%></h4>
            </div>
        </div>
    </div>
    <div id="links">
        <ul id="side-bar-links">
            <li><a href="designer-revs-and-coms.jsp">Reviews & Comments</a></li>
            <li><a href="designer-reqs-and-msgs.jsp">Job Requests & Messages</a></li>
            <li><a href="my-designs.jsp">My Designs</a></li>
            <li><a href="<%=request.getContextPath()%>/ViewMyCoursesServlet">My Courses</a></li>
            <li><a href="profile-settings.jsp">Settings</a></li>
        </ul>
        <div id="buttons">
            <div class="btn-prof"><a href="add-design.jsp">Add New Design</a></div>
            <div class="btn-prof"><a href="add-course.jsp">Add New Course</a></div>
        </div>
    </div>
</div>