$(document).ready(function() {
    $("#bio").on('keyup', function() {
        var words = 0;

        if ((this.value.match(/\S+/g)) != null) {
            words = this.value.match(/\S+/g).length; //words array object length
        }

        if (words > 10) {
            var trimmed = $(this).val().split(/\s+/, 10).join(" ");
            $(this).val(trimmed + " ");
        }
        else {
            $('#display_count').text(words+"/10");
            $('#word_left').text(10-words);
        }
    });
});