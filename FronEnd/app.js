const categoryInput = document.getElementById("categoryInput");
const categoryButtonUpdate = document.getElementById("categoryButton");

categoryButtonUpdate.addEventListener("click", function () {
  const content = categoryInput.value;

  if (content !== "") {
    const options = {
      method: "post",
      headers: {
        Accept: "application/json",
        "Content-type": "application/json",
      },
      body: JSON.stringify({ categoryName: content }),
    };
    fetch("http://localhost:8080/category/create", options)
      .then((res) => res.json())
      .then((data) => console.log(data));
  }
});

// post.addEventListener("click", () => {
//   const options = {
//     method: "post",
//     headers: {
//       Accept: "application/json",
//       "Content-Type": "application/json"
//     },
//     body: JSON.stringify({ name: "post" })
//   }
//   fetch("http://localhost:8080/api/admin/post", options)
//     .then(res => res.text())
//     .then(data => {
//       console.log(data);
//       document.getElementById("msg").innerHTML = data;
//     });
// });

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

// admin.addEventListener("click", () => {
//   fetch("http://localhost:8080/api/admin/getadmin")
//     .then(res => res.text())
//     .then(data => {
//       console.log(data);
//       document.getElementById("msg").innerHTML = data;
//     });
// });

// manager.addEventListener("click", () => {
//   fetch("http://localhost:8080/api/manager/getmanager")
//     .then(res => res.text())
//     .then(data => {
//       console.log(data);
//       document.getElementById("msg").innerHTML = data;
//     });

// });

// profile.addEventListener("click", () => {
//   fetch("http://localhost:8080/api/user/home")
//     .then(res => res.text())
//     .then(data => {
//       console.log(data);
//       document.getElementById("msg").innerHTML = data;
//     });
// });
