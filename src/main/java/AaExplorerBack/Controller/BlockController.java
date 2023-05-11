package AaExplorerBack.Controller;

import AaExplorerBack.Domain.Block;
import AaExplorerBack.Service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BlockController {
    @Autowired
    private BlockService blockService;

    public BlockController() {
    }

    @GetMapping({"/"})
    public Long addBlock() {
        return blockService.addBlock().getId();
    }

    @QueryMapping
    @ResponseBody
    public Optional<Block> findBlock(@RequestParam("id") Long id){
        return blockService.getBlockById(id);
    }


}