package guru.springframework.spring5webapp.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class EnvironmentVariableRepository {

    public List<EnvironmentVariable> getAll(){
        List<EnvironmentVariable> envs = new ArrayList<>();
        Map<String, String> envMap = System.getenv();
        for (Map.Entry<String, String> entry : envMap.entrySet()) {
            envs.add(new EnvironmentVariable(entry.getKey(), entry.getValue()));
        }
        return envs;
    }
}