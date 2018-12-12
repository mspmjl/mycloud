$(document).ready(function () {
    hiddenErrLable();
    $("#register-form").submit(function (event) {
        event.preventDefault();
        userNameAjax();
        invitationCodeAjax();
    });
});

function userNameAjax() {
    $("#register-button").prop("disabled", true);
    var info = {};
    info.userName = $("#userName").val();
    $.ajax({
        type: "POST",
        contentType: "application/json;charset=utf-8",
        url: "/doRegisterVerify",
        data: JSON.stringify(info),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
            if (data != null) {
                if (data.queryUser != null) {
                    $('#nameMsg').html(data.queryUser);
                    $('#nameMsg').show();
                }
            }
            $("#btn-search").prop("disabled", false);
            $('#feedback').show();
        },
        error: function (data) {
            if (data != null) {
                $('#feedback').html(data);
            }
            $("#btn-search").prop("disabled", false);
        }
    });
}
function invitationCodeAjax() {
    $("#register-button").prop("disabled", true);
    var info = {};
    info.invitationCode = $("#invitationCode").val();
    $.ajax({
        type: "POST",
        contentType: "application/json;charset=utf-8",
        url: "/doRegisterVerify",
        data: JSON.stringify(info),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
            if (data != null) {
                if (data.invitationCode != null) {
                    $('#invitationCodeMsg').html(data.invitationCode);
                    $('#invitationCodeMsg').show();
                }
            }
            $("#btn-search").prop("disabled", false);
            $('#feedback').show();
        },
        error: function (data) {
            if (data != null) {
                $('#feedback').html(data);
            }
            $("#btn-search").prop("disabled", false);
        }
    });
}

function hiddenErrLable() {
    $('#nameMsg').hide();
    $('#feedback').hide();
    $('#invitationCodeMsg').hide();
}