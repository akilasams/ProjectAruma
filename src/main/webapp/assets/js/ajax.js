$(document).ready(function (){
    //=====================addItem()======================
    function addItem(){
        var request = new XMLHttpRequest();
        request.open("GET","/addItem?itemId=${id}",true);
        request.send();
    }
});