package AaExplorerBack.Repository;

import AaExplorerBack.Domain.Block;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlockRepository extends MongoRepository<Block, Long> {
    public Block findByName(String Name);
}