$(document).ready(function (){
    $('#wishlist').click(function (){
        $('.wishlist-container').addClass('active');
    });

    $('.close-wishlist').click(function (){
        $('.wishlist-container').removeClass('active');
    });

    $('#cart').click(function (){
        $('.cart-container').addClass('active');
    });

    $('.close-cart').click(function (){
        $('.cart-container').removeClass('active');
    });
});

