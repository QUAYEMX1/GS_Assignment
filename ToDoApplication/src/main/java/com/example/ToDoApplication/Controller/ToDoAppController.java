package com.example.ToDoApplication.Controller;

import com.example.ToDoApplication.Models.ToDoApp;
import com.example.ToDoApplication.Service.ToDoAppService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/toDoApp")
@CrossOrigin
public class ToDoAppController {
    @Autowired
    ToDoAppService toDoAppService;
    @PostMapping("/addTodo")
    public ResponseEntity<String> createToDo(@RequestBody ToDoApp toDoApp){
        String response=toDoAppService.createToDo(toDoApp);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<ToDoApp>> findAllByDesc(){
        List<ToDoApp>response=toDoAppService.findAllByDesc();
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping("/updateToDo/{id}")
    public ResponseEntity<ToDoApp> updateToDo(@PathVariable int id,
                                           @RequestParam("completed")boolean isCompleted){

        ToDoApp response=toDoAppService.updateToDo(id,isCompleted);
        return new ResponseEntity<>(response,HttpStatus.OK);

    }

    @GetMapping("/say")
    public JSONPObject sayAllToDos() {
        JSONPObject jsonPObject = new JSONPObject("say", toDoAppService.findAllByDesc());
        return jsonPObject;
    }

}
