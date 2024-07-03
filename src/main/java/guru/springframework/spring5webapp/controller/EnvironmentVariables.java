package guru.springframework.spring5webapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.spring5webapp.repository.EnvironmentVariable;
import guru.springframework.spring5webapp.repository.EnvironmentVariableRepository;

@RestController
public class EnvironmentVariables {
    private final EnvironmentVariableRepository repository;

    public EnvironmentVariables(EnvironmentVariableRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/variables")
    @ResponseBody
    public List<EnvironmentVariable> getEnvironments() {
    return repository.getAll();
  }
    
}