$(document).ready(function () {
    $("#register-form").submit(function (event) {
        event.preventDefault();
        fire_ajax_submit();
    });
});

function fire_ajax_submit() {
    $("#register-button").prop("disabled", true);
    var info = {};
    info["userName"] = $("#userName").val();
    info["invitationCode"] = $("#invitationCode").val();
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/doRegisterVerify",
        data: JSON.stringify(info),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
            if(data !=null){
                var json = JSON.stringify(data);
                $('#feedback').html(json['invitationCode']);
            }
            $("#btn-search").prop("disabled", false);
        },
        error: function (data) {
            if(data !=null){
                $('#feedback').html(data );
            }
            $("#btn-search").prop("disabled", false);
        }
    });
}