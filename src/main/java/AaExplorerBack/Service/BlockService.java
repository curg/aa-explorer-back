package AaExplorerBack.Service;

import AaExplorerBack.Domain.Block;
import AaExplorerBack.Repository.MemoryBlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
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
    public Block addBlock(String blockNumber, String blockHash, List<String> txHashes){
        Block block = new Block();
        block.setBlockNumber(blockNumber);
        block.setBlockHash(blockHash);
        block.setTxHashes(txHashes);
        return memoryBlockRepository.insert(block);
    }
    public List<Block> findAll(){
        return memoryBlockRepository.findAll();
    }



}