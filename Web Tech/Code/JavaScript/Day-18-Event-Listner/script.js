let image = document.querySelector("img");
// function showImage() {  
//         image.style.display = "block";
// }
// function hideImage() {  
//     image.style.display = "none";
// }   

// function imageshow(){
//     if(image.style.display==="none"){
//         image.style.display="block";
//     } else{
//         image.style.display="none";
//     }
    
// }
function imageshow(){
    image.classList.toggle("show");
}
let i=0;
function moveMouse(){
    console.log(i++);
}
