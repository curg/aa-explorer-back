package AaExplorerBack.Domain;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "Blocks")
@Getter @Setter
public class Block {

    @Transient
    public static final String SEQUENCE_NAME = "block_sequence";

    @Id
    private long id;
    private String name;

    private long number;
    private List<Transaction> txs ;

}
