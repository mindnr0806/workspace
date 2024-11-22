/**
 * 
 */
$(document).ready(function() {
    // **** 텍스트 에디터 표시 ****
    initSummernote();

    // **** 버튼 클릭 이벤트 ****
    clickResetButton();     // 초기화 버튼 클릭 이벤트

    // 작성 버튼 클릭 이벤트
    $("#btn-write").click(()=>{
        // board 주소로 입력된 제목, 내용을 전달(요청)
        $.ajax({
            url: '/board',
            type: 'post',
            data: {
                title: $("#title").val(),
                content: $("#summernote").summernote('code')
            },
            success: (result) => {
                if (result === 'ok') {
                    alert("게시글 작성 성공");
                    // $("#btn-reset").click();
                    initBoard();
                } else {
                    alert("게시글 작성 실패");
                }
            },
            error: (err) =>{
                console.log(err);
                alert("문제가 발생했습니다. 관리자에게 문의하세요.");
            }
        })
    });
});

const initSummernote = () => {
    $('#summernote').summernote({
        placeholder: 'My Editor!',
        tabsize: 2,
        height: 200,
        toolbar: [
            ['style', ['style']],
            ['font', ['bold', 'clear']],
            ['color', ['color']],
            ['para', ['ul', 'ol']],
            ['table', ['table']],
            ['insert', ['picture']]
        ],
        callbacks: {
            onImageUpload: imageUpload
        }
    });
}

// imgList : file 객체 리스트(배열)
const imageUpload = (imgList) => {
    // console.log(imgList);

    // 텍스트 에디터에 이미지가 추가되었을 때
    //  summernote 에서는 이미지 파일을 전달해준다. -->  callbacks.onImageUpload

    // 이미지가 추가되면 우리 서버에 따로 업로드 후 해당 이미지 경로를 세팅해줘야 함.

    // form 태그에서는 enctype을 multipart/form-data 로 설정하여 전송했으며
    // 스크립트 상으로는 FormData 객체를 사용하여 ajax 요청을 할 것임.

    const formData = new FormData();
    for(let file of imgList) {
        formData.append("imgList", file);
    }

    $.ajax({
        url: 'upload',
        type: 'post',
        data: formData,
        processData: false,
        contentType: false, // application/x-www-form-... (default) -> multipart/form-data
        // dataType: "json",
        success: (result)=>{
            console.log(result);    // ["xxx.xx", "xx.xx"]
            for (let imgSrc of result) {
                $("#summernote").summernote("editor.insertImage", imgSrc);
            }
        },
        error: (err)=>{
            console.log(err);
            alert('문제가 발생했습니다.');
        }
    });
}

const clickResetButton = () => {
    $("#btn-reset").click(()=>{
        initBoard();
    });
}

const initBoard = () => {
     // 제목 초기화 => input 요소의 value 속성을 초기화 (빈 값으로 설정)
     $("#title").val('');

     // 내용 초기화 => summernote 초기화. empty, code, reset ..
     // $("#summernote").summernote('code', '');
     // $("#summernote").summernote('empty');
     $("#summernote").summernote('reset');
}