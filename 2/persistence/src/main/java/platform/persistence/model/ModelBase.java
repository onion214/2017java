package platform.persistence.model;

import org.springframework.data.annotation.Id;

public class ModelBase {

    @Id
    private  String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
