
import React from 'react'
import { Style } from './NavStyle'
export const Nav = () => {
  return (
    <>
    
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
