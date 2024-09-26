function changeColor() {
    const selColor = document.getElementById("selColor");

    // input 요소들의 입력된 값 : value 속성
    // console.log(selColor.value);    // 16진수 형태의 색상값

    document.getElementById("area1").style.backgroundColor = selColor.value;
}

function halfSize() {
    const area2 = document.getElementById("area2");

    area2.style.width = "50px";
    area2.style.height = '50px';
}

function defaultSize() {
    const area2 = document.getElementById("area2");

    area2.style.width = "100px";
    area2.style.height = '100px';
}

function doubleSize() {
    const area2 = document.getElementById("area2");

    area2.style.width = "200px";
    area2.style.height = '200px';
}

function resize(w, h) {
    const area2 = document.getElementById("area2");

    area2.style.width = w + "px";
    area2.style.height = h + 'px';    
}

window.onload = function() {
    const area3 = document.getElementById("area3");

    // 마우스가 #area3 요소 안으로 들어갔을 때 : mouseenter
    area3.addEventListener('mouseenter', function(){
        this.style.backgroundColor = 'red';
    });

    // 마우스가 #area3 요소 밖으로 나갔을 때 : mouseout
    area3.addEventListener('mouseout', function(){
        this.style.backgroundColor = 'black';
    });
}