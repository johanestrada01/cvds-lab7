function loadEmployees(){
    fetch('/employee/index/api/employees')
    .then(response => response.json())
    .then(data => {
        const tableBody = document.querySelector('#employeeTable tbody');
        tableBody.innerHTML = '';
        data.forEach(employee => {
            const row = `
                <tr>
                <td>${employee.id}</td>
                <td>${employee.firstName}</td>
                <td>${employee.lastName}</td>
                <td>${employee.role}</td>
                <td>${employee.salary}</td>
                <td>
                    <button type="button" class="btn btn-update">Update</button>
                    <button type="button" class="btn btn-delete">Delete</button>
                </td>
                </tr>
            `;
            tableBody.innerHTML += row;
        });
        })
        .catch(error => console.error(error));
}