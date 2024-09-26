import { useState } from "react";

function User(props){
    const user = props.user;
    return(
      <tr>
        <td>{user.name}</td>
        <td>{user.age}</td>
        <td>{user.gender}</td>
        <td>{user.phone}</td>
    </tr>
    )
    }
    function MyInput(props){

        const changeInputValue = (e) => {
            const value = e.target.value;
            props.setData(value);
        }
        return (
            <input type={props.type}
                   placeholder={props.placeholder}
                   value={props.data}
                   onChange={changeInputValue}/> 
        )
    }

function UserList() {
    const [list,setList] =useState([
        { name: '유니',age:26,gender: '여자', phone: '010-1234-1234'},
        { name: '강지',age:31,gender: '여자', phone: '010-2345-2345'},
        { name: '칸나',age:27,gender: '여자', phone: '010-3456-1234'}
    ]);

    const[name, setName] = useState('');
    const[age, setAge] = useState('');
    const[gender, setGender] = useState('');
    const[phone, setPhone] = useState('');


    const registUser = () => {
    //    alert(name + "," + age + "," +gender + "," +phone);
    const newUser = {name: name, age: age, gender: gender, phone: phone};
      list.push(newUser);
      
      setList([...list]); //전개 연산자 : 새로운 배열로 복사

      //입력창 부분을 초기화
      setName('');
      setAge('');
      setGender('');
      setPhone('');
    }
  
    return (

        <div>
        <h1>회원 정보 출력</h1>

        <hr></hr>

        <div>
            <h3>회원 정보 등록</h3>
            <hr></hr>
           <MyInput type='text' placeholder='이름' data={name} setData={setName} />
           <MyInput type='text' placeholder='나이' data={age} setData={setAge} />
           <MyInput type='text' placeholder='성별' data={gender} setData={setGender} />
           <MyInput type='text' placeholder='연락처' data={phone} setData={setPhone} />
            <br/>
            <button onClick={registUser}>등록</button>
        </div>

        <hr></hr>
        <table>
            <thead>
                <tr>
                <th>이름</th>
                <th>나이</th>
                <th>성별</th>
                <th>연락처</th>
                </tr>
            </thead>
            <tbody>
            {
                list.map((item, index) => 
          
                    <User key={'user'+index} user={item}/>
                
               )
            }
            </tbody>
        </table>
        </div>
    )

}

export default UserList;
