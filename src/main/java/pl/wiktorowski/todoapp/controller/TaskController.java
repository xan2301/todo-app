package pl.wiktorowski.todoapp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.wiktorowski.todoapp.model.Task;
import pl.wiktorowski.todoapp.model.TaskRepository;

import java.util.List;

@RepositoryRestController

public class TaskController {

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    private final TaskRepository repository;


    @Autowired
    public TaskController(final TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/tasks")

    ResponseEntity<?> readAllTasks(){
        logger.warn("Exposing all the tasks!!!");
        return ResponseEntity.ok(repository.findAll());
    }




}
