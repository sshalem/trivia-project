export function loadCategories(listOfCagetories) {
    fetch("http://localhost:8080/category/getall")
        .then((res) => res.json())
        .then((data) => {
            data.forEach((element) => {
                listOfCagetories.innerHTML += `<div class="show-category__content"><a href="${element.categoryName}">${element.categoryName}</a></div>`;
            });
        });
}

export function createCategory() {
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
}
