import { useState } from "react";
import Title from "../../../components/Title";
import MemoView from "./MemoView";


function UseMemoHook(){
    const [num, setNum] = useState(0);
    const [text, setText] = useState('');
  
    const increase = () => {setNum(num+1);}
    const decrease = () => {setNum(num-1);}
    const changeText = (e) => {setText(e.target.value);}

    return(
        <>
            <Title value="UseMemo"/>
            <button onClick={increase}>+</button>&nbsp;
            <button onClick={decrease}>-</button>
            <br></br>
            <input type="text" onChange={changeText}/>

            <MemoView num={num} text={text}/>

        </>
       
    )
}

export default UseMemoHook;