package AaExplorerBack.Controller;

import AaExplorerBack.Domain.Block;
import AaExplorerBack.Service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlockController {
    @Autowired
    private BlockService blockService;

    public BlockController() {
    }

    @GetMapping({"/"})
    public Block addBlock() {
        return blockService.addBlock();
    }
}