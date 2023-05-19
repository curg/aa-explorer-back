package AaExplorerBack.Repository;

import AaExplorerBack.Domain.Block;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MemoryBlockRepository {

    List<Block> storeBlock = new ArrayList<>();

    public Block insert(Block block){
        storeBlock.add(block);
        return block;
    }
    public Optional<Block> findByBlockNumber(String blockNumber){
        Optional<Block> any = storeBlock.stream()
                .filter(block -> block.getBlockNumber().equals(blockNumber))
                .findAny();
        return any;
    }
    public List<Block> findAll(){
        return storeBlock;
    }
}
