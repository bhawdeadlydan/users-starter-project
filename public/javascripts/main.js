function loadUsers(e) {
    const usersList = document.getElementById("users-list");
    usersList.innerHTML = "";

    function getUserListing(users, i) {
        const {firstname, lastname, dob, address} = users[i];
        return document.createTextNode(firstname + " " + lastname
            + " living at " + address
            + " was born on " + dob +".");
    }

    fetch('/api/users', {
        method: 'GET',
    }).then(res => res.json()).then(users => {
        console.log(users);
        if (!users.error) {
            for (let i = 0; i < users.length; i++) {
                const user = document.createElement("li");
                user.appendChild(getUserListing(users, i));
                usersList.appendChild(user);
            }
        }
    });
}

