public class Printer {

    private int sheetsLeft;
    private int toner;

    public Printer(int sheetsLeft, int toner){
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }

    public String print(int pages, int copies){
        if (this.sheetsLeft > (pages * copies) && (this.toner > 0)){
            this.sheetsLeft = this.sheetsLeft - (pages * copies);
            this.toner = this.toner - (pages * copies);
            return "Success! You have " + this.sheetsLeft + " pages left! Your toner levels are at: " + this.toner;
        } else {
            return "Add more paper to the paper tray or replace your toner!";
        }
    }
}

