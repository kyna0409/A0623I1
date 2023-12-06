package bt.model;

import bt.util.file.ReaderAuthenic;
import bt.util.file.Writer;

import java.io.IOException;
import static bt.util.file.Writer.FILE_PATHA;

public class Authenic extends Phone{
    ReaderAuthenic authenic = new ReaderAuthenic();
    Writer<Authenic> writer = new Writer<>();
    private String codewarranty;
    private String timeWarranty;


    public Authenic(String id, String name, double price, String brand, String codewarranty, String timeWarranty) {
        super(id, name, price, brand);
        this.codewarranty = codewarranty;
        this.timeWarranty = timeWarranty;
    }


    public String getCodewarranty() {
        return codewarranty;
    }

    public void setCodewarranty(String codewarranty) {
        this.codewarranty = codewarranty;
    }

    public Authenic() throws IOException {
        authenic.reader(FILE_PATHA);

    }

    public String getTimeWarranty() {
        return timeWarranty;
    }

    public void setTimeWarranty(String timeWarranty) {
        this.timeWarranty = timeWarranty;
    }

    @Override
    public String toString() {
       return String.format("%s , %s , %s , %s , %s , %s ",getId(),getName(),getPrice(),getBrand(),getCodewarranty(),getTimeWarranty());
    }
}

