package AaExplorerBack.Repository;

import AaExplorerBack.Domain.Block;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

public interface BlockRepository extends MongoRepository<Block, String> {
    public Block findByBlockNumber(String blockNumber);
    public Block findByBlockHash(String blockHash);

}