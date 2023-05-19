package AaExplorerBack.Domain;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigInteger;
import java.util.List;


@Document(collection = "Blocks")
@Getter @Setter
public class Block {

    private String blockNumber;
    private String blockHash;
    private List<String> txHashes;

    public Block() {
        blockNumber = "";
    }
}
