package pl.wiktorowski.todoapp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import pl.wiktorowski.todoapp.model.TaskRepository;

@RepositoryRestController

public class TaskController {

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    private  final TaskRepository repository;



    @Autowired
    public TaskController(final TaskRepository repository) {
        this.repository = repository;
    }
}
