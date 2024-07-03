package guru.springframework.spring5webapp.repository;

public class EnvironmentVariable {
    private final String name;
    private final String value;

    public EnvironmentVariable(String name, String value){
        this.name = name;
        this.value =value;
    }

    public String getName(){
        return this.name;
    }

    public String getValue(){
        return this.value;
    }
    
}
