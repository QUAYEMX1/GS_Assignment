package com.example.ToDoApplication.Service;

import com.example.ToDoApplication.Exceptions.ToDoNotFoundException;
import com.example.ToDoApplication.Models.ToDoApp;
import com.example.ToDoApplication.Repository.ToDoAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoAppService {
    @Autowired
    ToDoAppRepository toDoAppRepository;
    public String createToDo(ToDoApp toDoApp) {

        toDoAppRepository.save(toDoApp);

        return "new toDo has been Created"+toDoApp.getToDoId();
    }

    public List<ToDoApp> findAllByDesc() {
        List<ToDoApp>res=toDoAppRepository.findAllByDescDate();
        return res;
    }


    public ToDoApp updateToDo(int id, boolean isCompleted) {

        Optional<ToDoApp> toDoOptional=toDoAppRepository.findById(id);

        if(toDoOptional.isEmpty()){
            throw new ToDoNotFoundException("there is no any ToDo Present");
        }

        ToDoApp toDo=toDoOptional.get();

        toDo.setCompleted(isCompleted);
        toDoAppRepository.save(toDo);

        return toDo;
    }

}
