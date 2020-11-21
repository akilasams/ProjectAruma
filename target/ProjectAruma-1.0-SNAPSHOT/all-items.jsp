<%@include file="header-bar.jsp"%>

<head>
    <link rel="stylesheet" href="./assets/css/tables.css">
    <link rel="stylesheet" href="./assets/css/side-nav.css">
    <script src="assets/js/sidebar.js"></script>
</head>

<div class="table-wrapper">
    <mini-nav>
        <ul id="mini-nav">
            <li><a href="">Advanced Search</a></li>
            <li><a href="">Categories</a></li>
            <li><a href="">Sort</a></li>
            <li><a href="">Price Range</a>
        </ul>
        <div class="slider-container">
            <label for="myRange">Price Range</label>
            <input type="range" min="1" max="100" value="50" class="slider" id="myRange">
        </div>
    </mini-nav>

    <table>
        <caption>All Items</caption>
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
        </tr>

        <tr>
            <td>#1Name</td>
            <td>#1Description</td>
            <td>#1Price</td>
        </tr>

        <tr>
            <td>#2Name</td>
            <td>#2Description</td>
            <td>#2Price</td>
        </tr>
    </table>
</div>

<%@include file="footer-bar.jsp"%>