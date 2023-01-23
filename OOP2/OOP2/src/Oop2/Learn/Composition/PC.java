package Oop2.Learn.Composition;

public class PC {
    private Case theCase;
    private MatherBoard theMatherBoard;
    private Monitor theMonitor;

    public PC(Case theCase, MatherBoard theMatherBoard, Monitor theMonitor) {
        this.theCase = theCase;
        this.theMatherBoard = theMatherBoard;
        this.theMonitor = theMonitor;
    }


    public void powerUPButton() {
        this.theCase.pressPowerButton();
        this.theMatherBoard.printLogo();
        this.theMonitor.drawPixelAt(0, 0, "blue");
    }

    private Case getTheCase() {
        return theCase;
    }

    private MatherBoard getTheMatherBoard() {
        return theMatherBoard;
    }

    private Monitor getTheMonitor() {
        return theMonitor;
    }
}
