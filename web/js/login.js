/**
 * Created by apple on 2015/9/12.
 */
$(document).ready(function(){
    //点击提交按钮时，从服务端获取数据，然后在客户端显示
    $("#loginbn").click(function(){
        // 序列化表单的值
        var params=$("input").serialize();
        $.ajax({
            url: "login",
            // 数据发送方式
            type: "post",
            // 接受数据格式
            dataType : "json",
            // 要传递的数据
            data : params,
            // 回调函数，接受服务器端返回给客户端的值，即result值
            success : show,
            error : function(e) {
                alert("error");
            }
        });
    });
});
function show(result){
    alert("success");
}


