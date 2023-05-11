package AaExplorerBack.Controller;

import AaExplorerBack.Domain.Block;
import AaExplorerBack.Domain.Transaction;
import AaExplorerBack.Service.BlockService;
import AaExplorerBack.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Controller
public class BlockController {
    @Autowired
    private BlockService blockService;
    private TransactionService transactionService;

    public BlockController(BlockService blockService, TransactionService transactionService) {
        this.blockService = blockService;
        this.transactionService = transactionService;
    }

    @GetMapping({"/"})
    public Long addBlock() {
        return blockService.addBlock().getId();
    }

    @QueryMapping
    public Optional<Block> findBlock(@RequestParam("id") Long id){
        return blockService.getBlockById(id);
    }





}