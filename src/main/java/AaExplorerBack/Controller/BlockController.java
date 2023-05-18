package AaExplorerBack.Controller;

import AaExplorerBack.Domain.Block;
import AaExplorerBack.Service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BlockController {
    @Autowired
    private BlockService blockService;

    public BlockController() {

    }

    @GetMapping("/")
    public Block addBlock(@Argument String name){
        return blockService.addBlock(name);
    }

    @QueryMapping
    public Optional<Block> blockById(@Argument Long id){
        return blockService.getById(id);
    }

    @QueryMapping
    public List<Block> blockAll(){
        return blockService.getAll();
    }

}