package AaExplorerBack.Domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "Blocks")
@Getter @Setter
public class Block {
    @Id
    private long id;

    private String name;

    // basic
    private List<Transaction> transactions;

    // 32byte values
    private Byte[] hash;
    private Byte[] parentHash;
    private Byte[] stateRoot;

}
