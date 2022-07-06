package BooksStoreOOP;

public class AudioBook extends Book{
    String format;
    int bitRate;
    String readerName;


    public AudioBook(String name, String authorName, int id, double price, boolean isAvailable, String format, int bitRate, String reader) {
        super(name, authorName, id, price, isAvailable);
        this.format = format;
        this.bitRate = bitRate;
        this.readerName = reader;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getBitRate() {
        return bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Format: " + format);
        System.out.println("Bitrate: " + bitRate);
        System.out.println("Reader is: " + readerName);
    }
}
