import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
        //menu 라는 상태를 관리해보자. (초기값: "home")
        // -> useState 상태 관리
const[menu, setMenu] = useState("home");

const changeMenu = () => {
  if (menu === "home")
   setMenu("test");
  else
  setMenu("home");
}

  return (
    <div className="App">
      <header className="App-header">
        메뉴 테스트 <button onClick={changeMenu}>메뉴 변경</button>
        <p>현재 메뉴명 : {menu}</p>
        {/* 현재 메뉴가 home 인 경우 "여기는 HOME 메뉴입니다." 표시 */ }
        {
          menu == "home" ? 

          <p>여기는 home 메뉴입니다.</p>
        : <p>여기는 home 메뉴가 아닙니다.</p>
        }
        <hr/>
        {
          menu == "home" &&
          <p>Home Menu!</p>

        }
      </header>
    </div>
  );
}

export default App;
