$(document).ready(function() {
    $("#bio").on('keyup', function() {
        var words = 0;

        if ((this.value.match(/\S+/g)) != null) {
            words = this.value.match(/\S+/g).length; //words array object length
        }

        if (words > 50) {
            // Split the string on first 200 words and rejoin on spaces
            var trimmed = $(this).val().split(/\s+/, 50).join(" ");
            // Add a space at the end to make sure more typing creates new words
            $(this).val(trimmed + " ");
        }
        else {
            $('#display_count').text(words+"/50");
            $('#word_left').text(50-words);
        }
    });
});