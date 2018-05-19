$(document).ready(function () {
    $("#new-record").hide();

    var is_records = true;
    $("#new-record-nav").click(function () {
        if(is_records){
            $("#new-record-nav").addClass("active");
            $("#records-nav").removeClass("active");
            $("#new-record").show();
            $("#records").hide();
            is_records = false;
        }
    });


    $("#records-nav").click(function () {
        if(!is_records) {
            $("#records-nav").addClass("active");
            $("#new-record-nav").removeClass("active");
            $("#new-record").hide();
            $("#records").show();
            is_records = true;
        }
    });
});

function submit_record() {
    $.ajax({
        type: "post",
        url: "/account/login",
        data: $('#login-form').serialize(),
        success: function (res) {
            console.log(res)
        }
    });
}