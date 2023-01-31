package Summary.Pack;


import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        boolean quit = true;
        Scanner scanner = new Scanner(System.in);

//        Mature Vlad = new Mature("Vlad", 26, "boy", "Master's degree");
//        Mature Iona = new Mature("Iona", 28, "girl", "Master's degree");
//        Mature Corina = new Mature("Corina", 24, "girl", "Master's degree");
//        Mature Eleanora = new Mature("Eleanora", 44, "girl", "Doctor's degree");
//
//
//        Child Tommy = new Child("Tommy", 7, "boy", "preschool");
//        Child Anna = new Child("Anna", 6, "girl", "preschool");
//        Child Timmy = new Child("Timmy", 8, "boy", "preschool");
//
//        Old John = new Old("John", 66, "boy", "Doctor's degree");
//        Old Elisabeth = new Old("Elisabeth", 70, "girl", "Doctor's degree");
//        Old Diana = new Old("Diana", 64, "girl", "Doctor's degree");
//
        WorkingClass<Mature> newWorkerList = new WorkingClass<>();
        ChildrenClass<Child> childChildrenList = new ChildrenClass<>();
        PensionerClass<Old> oldPensionerList = new PensionerClass<>();


        while (quit) {
            System.out.println("##################");
            System.out.println("1 Create a person: ");
            System.out.println("2 Print a person info: ");
            System.out.println("3 Add Person to list: ");
            System.out.println("4 Quit");
            System.out.print("your option: #");

            int option = scanner.nextInt();
            scanner.nextLine();

            Human humanPerson;
            if (option == 1) {
                System.out.println("Enter person name: ");
                System.out.println("Enter type of person you want to create: ");
                System.out.println("1 Child");
                System.out.println("2 Mature");
                System.out.println("3 Old");
                int personOption = scanner.nextInt();
                scanner.nextLine();

                if (personOption == 1) {
                    String childName;
                    int childAge;
                    String childGender;
                    String childSchoolLevel;
                    System.out.println("Enter child name: ");
                    childName = scanner.nextLine();
                    System.out.println("Enter child age: ");
                    childAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter child gender: ");
                    childGender = scanner.nextLine();
                    System.out.println("Enter child school level: ");
                    childSchoolLevel = scanner.nextLine();
//                    System.out.println(childName + childAge + childGender + childSchoolLevel);

                    Child newChild = new Child(childName, childAge, childGender, childSchoolLevel);
                    childChildrenList.addOneChildToList(newChild);


                } else if (personOption == 2) {
                    String matureName;
                    int maturedAge;
                    String matureGender;
                    String matureSchoolLevel;
                    System.out.println("Enter mature name: ");
                    matureName = scanner.nextLine();
                    System.out.println("Enter mature age: ");
                    maturedAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter mature gender: ");
                    matureGender = scanner.nextLine();
                    System.out.println("Enter mature school level: ");
                    matureSchoolLevel = scanner.nextLine();
//                    System.out.println(matureName + maturedAge + matureGender + matureSchoolLevel);
                    Mature newMature = new Mature(matureName, maturedAge, matureGender, matureSchoolLevel);
                    newWorkerList.addWorkerToWorkingClass(newMature);
                    newWorkerList.printAllMature();
                } else if (personOption == 3) {
                    String oldName;
                    int oldAge;
                    String oldGender;
                    String oldSchoolLevel;
                    System.out.println("Enter old name: ");
                    oldName = scanner.nextLine();
                    System.out.println("Enter old age: ");
                    oldAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter old gender: ");
                    oldGender = scanner.nextLine();
                    System.out.println("Enter old school level: ");
                    oldSchoolLevel = scanner.nextLine();
//                    System.out.println(oldName + oldAge + oldGender + oldSchoolLevel);
                    Old newOld = new Old(oldName, oldAge, oldGender, oldSchoolLevel);
                    oldPensionerList.addOnePensionerToList(newOld);
                    oldPensionerList.printAllPensioners();
                } else {
                    System.out.println("Sorry wrong input try again!");
                }

            } else if (option == 4) {
                quit = false;
            }


        }


//        System.out.println("Adding workers: ");
//        if (newWorkerList.addWorkerToWorkingClass(Vlad)) {
//            System.out.println("Worker added " + Vlad.getHumanName());
//
//        } else {
//            System.out.println("Worker not added " + Vlad.getHumanName());
//        }
//        if (newWorkerList.addWorkerToWorkingClass(Iona)) {
//            System.out.println("Worker added " + Iona.getHumanName());
//
//        } else {
//            System.out.println("Worker not added " + Iona.getHumanName());
//        }
//        if (newWorkerList.addWorkerToWorkingClass(Corina)) {
//            System.out.println("Worker added " + Corina.getHumanName());
//
//        } else {
//            System.out.println("Worker not added " + Corina.getHumanName());
//        }
//
////        System.out.println(newWorkerList.addWorkerToWorkingClass(Corina));
//
//        newWorkerList.listWorkersList();
//
//        if (newWorkerList.removeWorkerFromList(Eleanora)) {
//            System.out.println("Worker " + Eleanora.getHumanName() + " was removed from list");
//        } else {
//            System.out.println("Can't remove " + Eleanora.getHumanName() + " from list");
//
//        }


    }


}
