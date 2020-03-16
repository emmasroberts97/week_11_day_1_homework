public class Printer {

    private int sheetsLeft;

    public Printer(int sheetsLeft){
        this.sheetsLeft = sheetsLeft;
    }

    public String print(int pages, int copies){
        if (this.sheetsLeft > (pages * copies)){
            this.sheetsLeft = this.sheetsLeft - (pages * copies);
            return "Success! You have " + this.sheetsLeft + " pages left!";
        } else {
            return "Add more paper to the paper tray!";
        }
    }
}

