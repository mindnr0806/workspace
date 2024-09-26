import CommentList from "../components/classComponent/CommentList";
import Title from "../components/Title";
import { Component } from "react";

class MyComponent extends Component{
    render(){
        return(
            <>
                <Title value="My Component"/>
            </>
        )
    }
}

function ClassComp(){
    return(
        <>
        <Title value="Class Component"/>
        <MyComponent />

        <CommentList />
        </>
    )
}

export default ClassComp;