package blockchain;

import java.security.Timestamp;
import java.util.List;

public class Block {

    private List<Transaction> listTransactions;
    private String previousHash;
    private String hash;
    private long nonce;
    private String merkleRoot;
    private Timestamp minedTime;

    public Block() {

    }

    public void addTransaction() {
        
    }

    public void mineBlock(int difficulty) {

    }

    public boolean verifyBlock(int difficulty) {
        return true;
    }

}