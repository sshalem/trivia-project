const categoryInput = document.getElementById("categoryInput");
const categoryButtonUpdate = document.getElementById("categoryButton");
const categoryList = document.getElementById("categoryList");

categoryButtonUpdate.addEventListener("click", function () {
    const content = categoryInput.value;

    if (content !== "") {
        category = {
            categoryName: content,
        };

        const options = {
            method: "post",
            headers: {
                Accept: "application/json",
                "Content-type": "application/json",
            },
            body: JSON.stringify(category),
        };

        fetch("http://localhost:8080/category/create", options)
            .then((res) => res.json())
            .then((data) => console.log(data));
    }
});

categoryList.addEventListener("click", function () {
    document.getElementById("gridContainer").innerHTML = "";
    fetch("http://localhost:8080/category/getall")
        .then((res) => res.json())
        .then((data) => {
            data.forEach((element) => {
                document.getElementById(
                    "gridContainer"
                ).innerHTML += `<div class="show-category__grid-element"><a href="${element.categoryName}">${element.categoryName}</a></div>`;
            });
            // this will add to each Category
            // a click button to fetch all the questions per Category
            // const category = document.querySelectorAll(".show-category__grid-element");
            // category.forEach((item) => {
            //     item.addEventListener("click", function () {
            //         const options = {};
            //         const url = `http://localhost:8080/category/${item.innerHTML}`;
            //         ajax(url);
            //     });
            // });
        });
});

function ajax(url, options) {
    fetch(url, options)
        .then((res) => res.json())
        .then((data) => console.log(data));
}

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