package AaExplorerBack.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transactions")
public class Transaction {

    @Id
    private Long id;

    //
    private Long value;

    // byte value
    private Byte[] from;
    private Byte[] to;
    private Byte[] inputData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Byte[] getFrom() {
        return from;
    }

    public void setFrom(Byte[] from) {
        this.from = from;
    }

    public Byte[] getTo() {
        return to;
    }

    public void setTo(Byte[] to) {
        this.to = to;
    }

    public Byte[] getInputData() {
        return inputData;
    }

    public void setInputData(Byte[] inputData) {
        this.inputData = inputData;
    }
}
