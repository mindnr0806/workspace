function calculator() {
    const num1El = document.getElementById("num1");
    const num2El = document.getElementById("num2");

    const op = document.getElementById("op").value;

    const result = document.getElementById("result");

    const num1 = parseInt(num1El.value);
    const num2 = parseInt(num2El.value);
    let total = 0;
    switch(op) {
        case '+':
            total = num1 + num2;
            break;
        case '-':
            total = num1 - num2;
            break;
        case '*':
            total = num1 * num2;
            break;
        case '/':
            if (num2 == 0) {
                alert('0으로 나눌 수 없습니다. 다시 시도해주세요!');
                num2El.focus();
                return;
            }
            total = num1 / num2;
            break;
        case '%':
            if (num2 == 0) {
                alert('0으로 나눌 수 없습니다. 다시 시도해주세요!');
                num2El.focus();
                return;
            }
            total = num1 % num2;
            break;
    }

    result.value = total;
}