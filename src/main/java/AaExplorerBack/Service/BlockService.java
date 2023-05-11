package AaExplorerBack.Service;

import AaExplorerBack.Domain.Block;
import AaExplorerBack.Domain.Transaction;
import AaExplorerBack.Repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class BlockService {
    @Autowired
    private BlockRepository blockRepository;

    public BlockService() {

    }

    public Block addBlock() {
        Block block = new Block();
        List<Transaction> txs = new LinkedList<>() ;

        Transaction tx = new Transaction();
        txs.add(tx);
        tx.setId(0L);


        block.setId(1L);
        block.setName("test");
        block.setTransactions(txs);
        return blockRepository.save(block);
    }

    public Block getBlockByName(String name){
        return blockRepository.findByName(name);
    }
    public Optional<Block> getBlockById(Long id){
        return blockRepository.findById(id);
    }
}
