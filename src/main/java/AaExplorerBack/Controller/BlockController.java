package AaExplorerBack.Controller;

import AaExplorerBack.Domain.Block;
import AaExplorerBack.Service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
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

    @GetMapping("/")
    public Block addBlock(@Argument String blockNumber){
        return blockService.addBlock(blockNumber);
    }

    @GetMapping("/find")
    public Optional<Optional<Block>> test(@Argument String blockNumber){
        return Optional.ofNullable(blockService.findByBlockNumber(blockNumber));
    }

    @GetMapping("/findAll")
    public List<Block> test2(){
        return blockService.findAll();
    }

    @QueryMapping
    public Optional<Optional<Block>> blockByBlockNumber(String blockNumber){
        return Optional.ofNullable(blockService.findByBlockNumber(blockNumber));
    }

}