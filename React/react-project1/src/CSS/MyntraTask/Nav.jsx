
import React from 'react'
export const Nav = () => {
  return (
    <>
    <Style>
        {`
            div{
                display: flex;
                align-items: center;
                justify-content: space-around;
                padding: 10px 20px;
                box-shadow: rgba(0, 0, 0, 0.1) 0px 4px 12px;
            }
            ul{
                display: flex;
                list-style: none;
                gap: 20px;
                font-weight: bold;
            }
            input{  
                width: 40%;
                padding: 10px;
                border-radius: 20px;
                border: 1px solid gray;
        }
            
        `}
    </Style>
    <div>
        <img src="https://constant.myntassets.com/web/assets/img/MyntraWebSprite_27_01_2024.png" alt="Myntra Logo" />

        <ul>
            <li>MEN</li>
            <li>WOMEN</li>
            <li>KIDS</li>
            <li>BEAUTY</li>
            <li>STUDIO</li>
        </ul>

        <input type="text" placeholder='Search for products, brands and more' />

        <div>
            <span>Profile</span>
            <span>Wishlist</span>
            <span>Bag</span>
        </div>
    </div>
    </>
  )
}
