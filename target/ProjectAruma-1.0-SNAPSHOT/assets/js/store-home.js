$(document).ready(function (){
    $('.card').click(function (){
        $('.view-container').addClass('active');
    });

    $('#close').click(function (){
        $('.view-container').removeClass('active');
    });
});
