package AaExplorerBack.Repository;

import AaExplorerBack.Domain.Block;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends MongoRepository<Block, String> {
}