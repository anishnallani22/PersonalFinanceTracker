package logic;

//imports
import java.time.LocalDate;
import java.util.UUID;


public class TransactionDetails {
    private final UUID id;
    private double amount;
    private LocalDate date;
    private String category;
    private String description;

    public TransactionDetails(double amount, LocalDate date, String category, String description){
        this.id = UUID.randomUUID();
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.description = description;
    }

    //Accessor Methods
    public UUID getID(){
        return id;
    }

    public double getAmount(){
        return amount;
    }

    public LocalDate getDate(){
        return date;
    }

    public String getCategory(){
        return category;
    }

    public String getDescription(){
        return description;
    }

    //Mutator Methods
    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return "Transaction Details\n"+
                "ID:\t" + id + "\nAmount:\t" + amount +
                "\nDate:\t" + date + "\nCategory:\t" + category +
                "\nDescription:\t" + description + "\n";
    }
}
