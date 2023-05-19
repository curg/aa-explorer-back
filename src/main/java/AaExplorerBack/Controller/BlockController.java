package AaExplorerBack.Controller;

import AaExplorerBack.Domain.Block;
import AaExplorerBack.Service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
public class BlockController {
    @Autowired
    private BlockService blockService;

    public BlockController() {
    }

    @MutationMapping
    public Block addBlock(@Argument String blockNumber,@Argument String blockHash, @Argument List<String> txHashes){
        return blockService.addBlock(blockNumber,blockHash,txHashes);
    }

    @QueryMapping
    public Optional<Block> blockByBlockNumber(@Argument String blockNumber){
        return blockService.findByBlockNumber(blockNumber);
    }

    @QueryMapping
    public List<Block> blockAll(){
        return blockService.findAll();
    }

}