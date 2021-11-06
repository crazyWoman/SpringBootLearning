package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/users/{name}/todos")
    public List<Todo> retrieveTodos(@PathVariable String name) {
        return todoService.retrieveTodos(name);
    }

    @PostMapping("/users/{name}/todos")
    ResponseEntity<?> add(@PathVariable String name,
                          @RequestBody Todo todo) {
        Todo createdTodo = todoService.addTodo(name, todo.getDesc(),
                todo.getTargetDate(), todo.isDone());
        if (createdTodo == null) {
            return ResponseEntity.noContent().build();
        }





        URI location = ServletUriComponentsBuilder.fromCurrentRequest()

                .path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping ("/users/todos/{id}")
    public ResponseEntity retrieveTodo( @PathVariable
            int id) {
        boolean isRemoved = todoService.deleteTodo(id);

        if (!isRemoved) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
