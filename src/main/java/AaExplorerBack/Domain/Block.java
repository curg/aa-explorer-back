package AaExplorerBack.Domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Blocks")
@Getter @Setter
public class Block {


    @Id
    private long id;

    private String name;

}
