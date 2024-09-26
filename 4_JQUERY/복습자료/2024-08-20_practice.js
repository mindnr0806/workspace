$(function(){

    //문제1
    //$('input[type=text]')
    //$("input[name=search]")
    $(":text").focus(function(){
        $(this).addClass('w-100p');
    });

    $(':text').blur(function(){
        $(this).removeClass('w-100p');
    });

    // 문제2
    // $("#students tr:odd").css('backgroundColor', 'gray');
    $("#students tr:nth-child(even)").css('backgroundColor', 'gray');
});