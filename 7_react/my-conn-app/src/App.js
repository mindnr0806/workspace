import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Router, Route, Switch, Link, Routes } from 'react-router-dom';
import Practice1 from './components/Practice1';
import Practice2 from './components/Practice2';


function App() {
  return (
    <BrowserRouter>
    <div className="App">
      <header>
        <nav>
        <Link to="/">HOME</Link> |&nbsp;
            <Link to="/pt1">연습</Link>  |&nbsp;
            <Link to="/pt2">연습2</Link> 
        </nav>
      </header>
    <Routes>
        <Route path="/" element={<p>안녕리액트?</p>}></Route>
        <Route path="/pt1" element={<Practice1/>}/>
        <Route path="/pt2" element={<Practice2/>}/>
    </Routes>
    </div>
    </BrowserRouter>
  );
}

export default App;
