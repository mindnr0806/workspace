/**
 * 
 */
const CLIENT_ID = "155658887584-d54urv7j52h7b68e0uj1876gjdj4sd7i.apps.googleusercontent.com"
const REDIRECT_URI = "http://localhost:7777/login/oauth/google";

// onload 시점에 이벤트 핸들러 추가
window.onload = () => {
    //btn-google이라는 아이디 속성을 가진 요소의 클릭이벤트
 document.querySelector("#btn-google").onclick = () => {
    //alert("구글 로그인!@");
    const url = "https://accounts.google.com/o/oauth2/v2/auth"
                + "?client_id=" + CLIENT_ID
                + "&redirect_uri=" +REDIRECT_URI
                + "&response_type=code"
                + "&scope=email profile";

                location.href = url;
 }
}