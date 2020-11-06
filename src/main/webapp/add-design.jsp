<%--
  Created by IntelliJ IDEA.
  User: Akila Samarawickrama
  Date: 10/27/2020
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Design</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/forms.css">
</head>
<body>
    <div id="form-container">
        <h2>Add New Item</h2>
        <form action="" method="post" enctype="multipart/form-data">
            <input type="text" name="designName" placeholder="Enter Item Name"><br>
            <textarea name="desc" id="" cols="30" rows="10" placeholder="Item Description"></textarea><br>
            <select name="cat" id="" name="category">
            <option value="none">Select a Category</option>
            <option value="graphicDesign">Graphic Design</option>
            <option value="handiCraft">Handi-Craft</option>
            <option value="fashion">Fashion</option>
            <option value="video_audio">Video/Audio</option>
            <option value="art">Art</option>
            <option value="other">Other</option>
            </select><br>
            <label id="filename" for="filename">Upload an Image</label><br>
            <input type="file" name="filename"><br>
            <button type="submit" name="submit">Add to My Designs</button>
        </form>
    </div>
</body>
</html>
