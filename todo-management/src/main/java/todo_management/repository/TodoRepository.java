package todo_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todo_management.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
