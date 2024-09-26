import React, { useState, useEffect } from 'react';
import './App.css'; // CSS 파일을 불러옵니다.

function App() {
  const [time, setTime] = useState('');
  const [date, setDate] = useState('');

  useEffect(() => {
    const updateTime = () => {
      const now = new Date();
      setTime(now.toLocaleTimeString('ko-KR', { hour12: true, hour: '2-digit', minute:'2-digit', second:'2-digit' })); // 12시간 형식
      setDate(now.toLocaleDateString('ko-KR', {year: '2-digit', month: '2-digit', day:'2-digit' })); // 한국 형식의 날짜
    };

    updateTime(); // 초기 시간 및 날짜 설정
    const intervalId = setInterval(updateTime, 1000); // 1초마다 시간 업데이트

    return () => clearInterval(intervalId); // 컴포넌트 언마운트 시 interval 정리
  }, []);

  return (
    <div className="app">
      <h1>현재 시간</h1>
      <h2>{date}</h2>
      <h2>{time}</h2>
    </div>
  );
}

export default App;
