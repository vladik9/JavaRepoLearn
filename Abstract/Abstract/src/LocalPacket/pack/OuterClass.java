package LocalPacket.pack;

public class OuterClass {

    private int userAge;
    private String userName;
    private innerInterface moreData;


    public OuterClass(int userAge, String userName, innerInterface moreData) {
        this.userAge = userAge;
        this.userName = userName;
        this.moreData = moreData;

    }

    public class InnerClass {
        private String userOccupation;

        public InnerClass(String userOccupation) {
            this.userOccupation = userOccupation;
        }

        public String getUserOccupation() {
            return userOccupation;
        }

        public void setUserOccupation(String userOcupation) {
            this.userOccupation = userOcupation;
        }
    }

    public interface innerInterface {
        void printAText(String text);
    }

    public void printMyMess(String myText) {
        moreData.printAText(myText);
    }

}
