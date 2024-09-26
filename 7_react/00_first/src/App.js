import './App.css';
import Clicker from './components/Clicker';
import UserList from './components/UserList';
function Test(){

  return (
    <p>여기는 테스트 컴포넌트입니다!</p>
  )
}

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Clicker />
        <Test />
      </header>

      <UserList/>
    </div>
  );
}

export default App;
