import styled from 'styled-components';


const ListContainer = styled.ul`
width: 100%;
margin: 12PX 0PX;
padding: 0PX 30PX;

`

const TodoItem = styled.li`
    height: 30px;
    background-color: lightblue;
    display: flex;
    align-items: center;
    justify-content: center;
`

export default function TodoList({list}){
    return (

        <ListContainer>
           {
                list.map((todo, index)=>
                <TodoItem key={'todo'+index}>{todo}</TodoItem>
            )
           }
        </ListContainer>

    );

}