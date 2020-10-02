import { loadCategories, createCategory } from "./js/ajax.js";

const categoryInput = document.getElementById("categoryInput");
const categoryCreateBtn = document.getElementById("categoryButton");
const listOfCagetories = document.getElementById("gridContainer");

window.addEventListener("DOMContentLoaded", function () {
    listOfCagetories.innerHTML = "";
    loadCategories(listOfCagetories);
});

categoryCreateBtn.addEventListener("click", function () {
    const content = categoryInput.value;
    createCategory(content);
});

// put.addEventListener("click", () => {
//   const options = {
//     method: "put",
//     headers: {
//       Accept: "application/json",
//       "Content-Type": "application/json"
//     },
//     body: JSON.stringify({ name: "put-update" })
//   }
//   fetch("http://localhost:8080/api/admin/put/temprary-PutRequest-Method", options)
//     .then(res => res.text())
//     .then(data => {
//       console.log(data);
//       document.getElementById("msg").innerHTML = data;
//     });
// });

// del.addEventListener("click", () => {
//   const options = {
//     method: "delete",
//     headers: {
//       Accept: "application/json",
//       "Content-Type": "application/json"
//     },
//     body: JSON.stringify({ name: "delete" })
//   }
//   fetch("http://localhost:8080/api/admin/delete/5", options)
//     .then(res => res.text())
//     .then(data => {
//       console.log(data);
//       document.getElementById("msg").innerHTML = data;
//     });
// });

// users.addEventListener("click", () => {
//   fetch("http://localhost:8080/api/manager/getAllUsers")
//     .then(res => res.json())
//     .then(data => {
//       console.log(data);
//       document.getElementById("msg").innerHTML = "";
//       data.forEach(element => {
//         document.getElementById("msg").innerHTML += `
//                 						 ${element.id} -
//                                          ${element.username} -
//                                          ${element.password} -
//                                          ${element.email} <br>`;
//       });
//     });
// });
