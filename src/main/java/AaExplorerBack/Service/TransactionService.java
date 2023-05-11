package AaExplorerBack.Service;

import AaExplorerBack.Domain.Transaction;
import AaExplorerBack.Repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private BlockRepository blockRepository;

    public TransactionService(BlockRepository blockRepository) {
        this.blockRepository = blockRepository;
    }


}
