package todo_management.service;

import todo_management.dto.TodoDto;

import java.util.List;

public interface TodoService {

    TodoDto addTodo(TodoDto todoDto);

    TodoDto getTodoById(Long id);

    List<TodoDto> getAllTodos();

    TodoDto updateTodo(TodoDto todoDto, Long id);

    void deleteTodo(Long id);

    TodoDto completeTodo(Long id);

    TodoDto inCompleteTodo(Long id);
}
