package AaExplorerBack.Service;

import AaExplorerBack.Domain.Block;
import AaExplorerBack.Repository.MemoryBlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class BlockService {
    @Autowired
    private MemoryBlockRepository memoryBlockRepository;

    public Optional<Block> findByBlockNumber(String blockNumber){
        return memoryBlockRepository.findByBlockNumber(blockNumber);
    }
    public Block addBlock(String blockNumber){
        Block block = new Block();
        block.setBlockNumber(blockNumber);
        return memoryBlockRepository.insert(block);
    }
    public List<Block> findAll(){
        return memoryBlockRepository.findAll();
    }


}