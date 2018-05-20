$(document).ready(function () {
    $("#register-form").hide();

    var is_register = getParam("register");
    if(is_register && is_register === "true"){
        changeForm();
    }

    var register_btn = $("#register-btn");

    register_btn.attr("disabled", true);

    var agree = false;

    $("#agreed").click(function () {
        if(agree){
            register_btn.attr("disabled", true);
        }else{
            register_btn.attr("disabled", false);
        }
        agree = !agree;
    })
});

function login() {
    checkInput('login-form');
    $.ajax({
        type: "post",
        url: "/account/login",
        data: $('#login-form').serialize(),
        success: function (res) {
            console.log(res)
        }
    });
}

function register() {
    checkInput('register-form');
    $.ajax({
        type: "post",
        url: "/account/register",
        data: $('#register-form').serialize(),
        success: function (res) {
            console.log(res)
        }
    });
}

function checkInput(id) {
    var inputs_div = $("#" + id).children(".form-group");
    $.each(inputs_div, function (index, value, array) {
        console.log(value);
        if($(value).children("input")[0]){
            if(!$(value).children("input").val()){
                $($(value).children("div")[0]).html("不能为空");
            }else{
                $($(value).children("div")[0]).html("");
            }
        }
    });
}

function getParam(name) {
    var reg=new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");//构造一个含有目标参数的正则表达式对象
    console.log(window.location.search.substr(1));
    var r=window.location.search.substr(1).match(reg);//匹配目标参数
    if(r!=null)
        return unescape(r[2]);
    return null;//返回参数值
}

var is_reg = false;

function changeForm() {
    if(is_reg){
        $("#login-form").show();
        $("#register-form").hide();
    }else{
        $("#login-form").hide();
        $("#register-form").show();
    }
    is_reg = !is_reg;
}