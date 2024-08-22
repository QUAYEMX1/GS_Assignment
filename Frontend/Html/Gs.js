async function addToDo() {
    console.log("OK");
    const taskName = document.getElementById('todoInput').value;
    await fetch('http://localhost:8080/toDoApp/addTodo', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ taskName })
    });
    loadToDos();
}

async function loadToDos() {
    try {
        const response = await fetch('http://localhost:8080/toDoApp/findAll');
        const todos = await response.json();

        let list = document.getElementById('todo-list');
        list.innerHTML = "";

        todos.forEach(todo => {
            list.innerHTML += `
                <tr class="${todo.completed ? 'completed' : ''}">
                    <td>${todo.taskName}</td>
                    <td>
                        <input type="checkbox" onclick="markAsComplete(${todo.toDoId})" id="${todo.toDoId}" ${todo.completed ? 'checked  disabled' : ''} /> ${todo.completed ? "Completed" : "Mark as Completed"}
                    </td>
                </tr>
            `;
        });

    } catch (error) {
        console.error('Error loading todos:', error);
    }
}

async function markAsComplete(id) {
    await fetch(`http://localhost:8080/toDoApp/updateToDo/${id}?completed=true`, { method: 'PUT' });
    loadToDos();
}

document.getElementById('addTodoButton').addEventListener('click', addToDo);

loadToDos();
