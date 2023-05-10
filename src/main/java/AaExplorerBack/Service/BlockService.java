package AaExplorerBack.Service;

import AaExplorerBack.Domain.Block;
import AaExplorerBack.Repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlockService {
    @Autowired
    private BlockRepository blockRepository;

    public BlockService() {
    }

    public Block addBlock() {
        Block block = new Block();
        block.setId(1L);
        block.setName("test");
        return blockRepository.save(block);
    }
}