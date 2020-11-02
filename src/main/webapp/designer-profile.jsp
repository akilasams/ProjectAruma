<%@ include file="header-bar.jsp"%>

<head>
    <link rel="stylesheet" href="./assets/css/profile.css">
</head>

<div class="prof-container">
    <div id="side-bar">
        <div id="prof">
            <div id="profile">
                <div id="prof-pic"></div>
                <div id="name">
                    <h3>First Name</h3>
                    <h4>Last Name</h4>
                </div>
            </div>
        </div>
        <div id="links">
            <ul id="side-bar-links">
                <li><a href="">Reviews & Comments</a></li>
                <li><a href="">Job Requests</a></li>
                <li><a href="">Messages</a></li>
                <li><a href="">My Designs</a></li>
                <li><a href="">My Courses</a></li>
                <li><a href="">Settings</a></li>
            </ul>
            <div id="buttons">
                <div class="btn-prof">All Designs</div>
                <div class="btn-prof">Add More</div>
            </div>
        </div>
    </div>
    <div id="gallery">
        <div class="place-holder"></div>
        <div class="place-holder"></div>
        <div class="place-holder"></div>
        <div class="place-holder"></div>
        <div class="place-holder"></div>
        <div class="place-holder"></div>
    </div>
</div>

<%@ include file="footer-bar.jsp"%>