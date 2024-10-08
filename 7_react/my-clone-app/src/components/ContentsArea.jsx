import styled from 'styled-components';
import Slider from "react-slick";

import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";


const Image = styled.img`
  width: 150px;
  height: 200px;

  transform: scale(1.0);
  transition: transform .7s;

  &:hover{
    transform: scale(1.1);
    transition: transform.7s;
  }
    `

    const style={
        height: '250px',
        padding: '20px',
        cursor: 'pointer'
      }

      const settings = {
        dots: true,
        infinite: true,
        speed: 500,
        slidesToShow: 4,
        slidesToScroll: 4
      };
      

const ContentsArea = ({list}) => {
    return(
        <div>
        <Slider {...settings}>
            {   
                list.map((c, idx)=> 
                  
                        <div style={style}>
                        <Image src={c.img} alt={c.text}/>
                        </div>
                    
                )
            }
            </Slider>
        </div>
        
    )

}
export default ContentsArea;