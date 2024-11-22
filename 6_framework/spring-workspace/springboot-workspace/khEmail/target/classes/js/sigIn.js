/**
 *
 */
// onload 시점 => 모든 요소들이 브라우저에 표시된 상태
onload = () => {


//[인증 요청] 버튼 클릭 이벤트 -> 알림창 표시 : "인증 요청"
//document.getElementById("btn-auth")
document.querySelector("#btn-auth").onclick=()=>{
   // (POST)/ mail
   // {email: {인증코드를 받을 이메일주소}}

   //스피너 활성화 => 요청이 진행중인음 표시하기 위해
   $("#spinner").removeClass("d-none");
   //[인증요청] 버튼 비활성화
   $("#btn-auth").addClass("disabled");

  // 비동기 통신 => ajax
$.ajax({
    url:'mail',         //요청 주소 (url)
    type: 'post',       //요청 방식 (type|method)
    data: {             //요청 시 전달 데이터(파라미터)(data)
        email: $("#email").val()
    },
    success: (result)=>{
        //요청 완료후 스피너:비활성화, 인증요청버튼: 활성화
        $("#spinner").addClass("d-none");
        $("#btn-auth").removeClass("disabled");


        alert(result);
    },
    error:(err)=>{
        console.log(err);
    }

})
}
//[확인] 버튼 클릭 이벤트 => 알림창 표시 : "확인"
$("#btn-check").click (() => {
    //alert("확인");
    const code = $("#code").val(); // 입력된 코드 값 가져오기

    // 입력된 코드 값을 /check 요청으로 검증
    $.ajax({
        url: '/check', // 검증 요청 주소
        method: 'post',
        data: {
            code: $("#authCode").val(), // 입력된 코드
            email: $("#email").val()
        },
        success: (data) => {
            alert(data); 
        },
        error: (err) => {
            console.log(err);
           
        }
    })
});
}