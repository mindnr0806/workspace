import styled from 'styled-components';

const Container = styled.div`

    width: calculateNewValue(100% - 25px);
    padding: 25px;
    display: inline-flex;
    flex-direction: column;
    justify-content: center;
`
const Title = styled.h1`
    color: blue;
    text-align: center;
    margin: 0;
    font-size: 50px;
    `


function MyContainer({children, title}){
    return (
        <>
    <Title>{title}</Title>
    <Container>
     {children}
    </Container>


        </>
    )
}

export default MyContainer;