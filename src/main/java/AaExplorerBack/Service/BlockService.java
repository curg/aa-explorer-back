package AaExplorerBack.Service;

import AaExplorerBack.Domain.Block;
import AaExplorerBack.Repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlockService {
    @Autowired
    private BlockRepository blockRepository;

    Long idx = 0L;

    public BlockService() {
    }

    public Block addBlock(String name) {
        Block block = new Block();
        block.setId(idx++);
        block.setName(name);

        return blockRepository.save(block);
    }

    public Optional<Block> getById(Long id){
        return blockRepository.findById(id);
    }

    public List<Block> getAll(){
        return blockRepository.findAll();
    }

}