$(document).ready(function (){
    //=====================addItem()======================
    function addToCart(){
        var request = new XMLHttpRequest();
        request.open("GET","/AddtoCartServlet?item.designId=${item.designId}",true);
        request.send();
    }

    //=====================viewDesigner()======================
    function viewDesigner(id){
        var request = new XMLHttpRequest();
        request.open("GET","ViewDesignerServlet?designerId=id",true);
    }
});


