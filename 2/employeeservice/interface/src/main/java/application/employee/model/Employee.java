package application.employee.model;

import org.springframework.data.mongodb.core.mapping.Document;
import platform.persistence.model.ModelBase;

@Document(collection = "Employee")
public class Employee extends ModelBase{
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
