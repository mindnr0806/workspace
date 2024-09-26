import { useState } from "react";
import styled from "styled-components";
import { GrAddCircle } from "react-icons/gr";


const InsertInput = styled.input`
    border" none; 
    border-radius: 50px 0px 0px 50px;
    background-color: lightblue;
    height: 40px;
    min-width: 250px;
    padding-left: 15px;
    box-sizing: border-box;
`

const InsertBtn = styled.button`
    width: 40px;
     height: 40px;
     border: none;
     cursor: pointer;
     border-radius: 0px 50px 50px 0px;
     background-color: black;
     color: white;
     font-size: 25px;
     display: flex;
     justify-content: center;
     align-items: center;
`

const InsertContainer = styled.div`
     width: 100px;
    display: inline-flex;
    justify-content: center;

`
//function InsertItem(){}
const InsertItem = (props) => {
    const[todoItem, setTodoItem] = useState('');

    const addTodo = () => {
        props.addItem(todoItem);        //App 컴포너트에서 
        setTodoItem('');
    }

    return(
        <InsertContainer>

            <InsertInput value={todoItem} placeholder='할일 입력' onChange={(e) => {setTodoItem(e.target.value);}}  />
            <InsertBtn onClick={addTodo}>
                <GrAddCircle/>
            </InsertBtn>

        </InsertContainer>
    )
}

export default InsertItem;