// //& DOM- Document Object Model

// let data=document.getElementById("pro");
// console.log(data)

// let cdata=document.getElementsByClassName("p1");
// console.log(cdata)

// let tdata=document.getElementsByTagName("h2")
// console.log(tdata)

// let data2=document.querySelector(".p1");
// console.log(data2)

// let data3=document.querySelectorAll(".p1")
// console.log(data3)


// //& BOM- Browser Object Model
// console.log(window.innerHeight);
// console.log(window.innerWidth);
// console.log(window.location.href);

// // window.location.href="https://www.google.com/"
// console.log(window.history.length);
// // window.history.back();
// // window.history.forward();
// console.log(window.navigator.userAgent);
// console.log(window.navigator.language);
// console.log(window.navigator.platform);


// //& accesing the attributes

// let inp=document.querySelector("#inpTag");
// console.log(inp)

// console.log(inp.type)
// console.log(inp.value)
// console.log(inp.placeholder)

// //& modifying the attributes
// inp.value="Hello World"
// inp.placeholder="Enter your text here"
// inp.type="password"
// console.log(inp)

// //& create new attribute
// inp.maxLength="10"
// console.log(inp)


// //& getAttribute and setAttribute
// //~ getAttribute
// //it is a method for accessing the attribute value
// console.log(inp.getAttribute("type"));
// console.log(inp.getAttribute("value"));
// console.log(inp.getAttribute("placeholder"));
// console.log(inp.getAttribute("maxLength"));

// //~ setAttribute
// //it is a method for modifying or creating the attribute value
// inp.setAttribute("value","Prince@133")
// inp.setAttribute("placeholder","Enter your email")
// inp.setAttribute("minLength","5")
// inp.setAttribute("type","email")

// console.log(inp);

// //&  removeAttribute
// inp.removeAttribute("minLength")
// console.log(inp);


//&
//~ innerText - it gives the content as well as the tags in which the content is present
//~ innerHTML - it gives only the content without the tags
//~textContent - it gives the content  with the extra spaces,as it is written in the html file
let head=document.querySelector("div");
console.log(head.innerText);
console.log(head.innerHTML);
console.log(head.innerContent);


//& Styling using JS
// head.style.color="blue";
// head.style.backgroundColor="yellow";
// head.style.fontSize="30px";
// head.style.padding="10px";
// head.style.border="2px solid red";
// head.style.fontFamily="Arial, sans-serif";

// head.style.cssText="color:green; font-size:30px;font-family: Algerian";
// console.log(head);

//* Adding and removing 
//~ classListadd: it is used to add the class to the element
//~ classListremove: it is used to remove the class from the element
//~ classListtoggle: it is used to toggle the class of the element
head.classList.add("one","two","three");
console.log(head);

head.classList.remove("two");

console.log(head);

//~toggle
head.classList.toggle("three");
console.log(head);