package Summary.Pack;


import java.util.Scanner;


class Main {


    public static void main(String[] args) {
        boolean quit = true;
        Scanner scanner = new Scanner(System.in);
//default person in list
        Mature Vlad = new Mature("Vlad", 26, "boy", "Master's degree");
        Mature Iona = new Mature("Iona", 28, "girl", "Master's degree");
        Mature Corina = new Mature("Corina", 24, "girl", "Master's degree");
        Mature Eleanora = new Mature("Eleanora", 44, "girl", "Doctor's degree");


        Child Tommy = new Child("Tommy", 7, "boy", "preschool");
        Child Anna = new Child("Anna", 6, "girl", "preschool");
        Child Timmy = new Child("Timmy", 8, "boy", "preschool");

        Old John = new Old("John", 66, "boy", "Doctor's degree");
        Old Elisabeth = new Old("Elisabeth", 70, "girl", "Doctor's degree");
        Old Diana = new Old("Diana", 64, "girl", "Doctor's degree");

        ChildrenClass<Child> childrenList = new ChildrenClass<>();
        MatureClass<Mature> matureList = new MatureClass<>();
        PensionerClass<Old> oldList = new PensionerClass<>();

        matureList.addMatureToList(Vlad);
        matureList.addMatureToList(Iona);
        matureList.addMatureToList(Corina);
        matureList.addMatureToList(Eleanora);
        childrenList.addOneChildToList(Tommy);
        childrenList.addOneChildToList(Anna);
        childrenList.addOneChildToList(Timmy);
        oldList.addOnePensionerToList(John);
        oldList.addOnePensionerToList(Elisabeth);
        oldList.addOnePensionerToList(Diana);


        while (quit) {

            System.out.println("##################");
            System.out.println("1 Create a person: ");
            System.out.println("2 Print a person info from list: ");
            System.out.println("3 Remove person from list: ");
            System.out.println("4 Quit");
            System.out.print("your option: #");

            int option = scanner.nextInt();
            scanner.nextLine();


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


                    Child newChild = new Child(childName, childAge, childGender, childSchoolLevel);
                    String output = childrenList.addOneChildToList(newChild) ? "Added" : "List already have this user";
                    System.out.println(output);


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

                    Mature newMature = new Mature(matureName, maturedAge, matureGender, matureSchoolLevel);

                    String output = matureList.addMatureToList(newMature) ? "Added" : "List already have this user";
                    System.out.println(output);


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

                    Old newOld = new Old(oldName, oldAge, oldGender, oldSchoolLevel);

                    String output = oldList.addOnePensionerToList(newOld) ? "Added" : "List already have this user";
                    System.out.println(output);
                } else {
                    System.out.println("Sorry wrong input try again!");
                }

            } else if (option == 2) {
                System.out.println("Enter list name you want to see: ");
                System.out.println("1 Child");
                System.out.println("2 Mature");
                System.out.println("3 Old");
                int personOption = scanner.nextInt();
                scanner.nextLine();
                if (personOption == 1) {
                    childrenList.printAllChildren();
                } else if (personOption == 2) {
                    matureList.printAllMature();
                } else if (personOption == 3) {
                    oldList.printAllPensioners();
                }

            } else if (option == 3) {
                System.out.println("Option 3");
                System.out.println("Enter list name you want to delete: ");

                System.out.println("1 Child");
                System.out.println("2 Mature");
                System.out.println("3 Old");
                int personOption = scanner.nextInt();
                scanner.nextLine();
                if (personOption == 1) {
                    System.out.println("Enter person name you want to delete: ");
                    String personName = scanner.nextLine();
                    String output = childrenList.removeOneChildFromList(personName) ? "Successfully removed" : "Can't remove this user";
                    System.out.println(output);
                } else if (personOption == 2) {
                    System.out.println("Enter person name you want to delete: ");
                    String personName = scanner.nextLine();
                    String output = matureList.removeOneChildFromList(personName) ? "Successfully removed" : "Can't remove this user";
                    System.out.println(output);

                } else if (personOption == 3) {
                    System.out.println("Enter person name you want to delete: ");
                    String personName = scanner.nextLine();
                    String output = oldList.removeOneMatureFromList(personName) ? "Successfully removed" : "Can't remove this user";
                    System.out.println(output);
                }

            } else if (option == 4) {
                quit = false;
            } else {
                System.out.println("Sorry wrong input try again!");
            }


        }


    }


}
package Summary.Pack;


import java.util.Scanner;


class Main {


    public static void main(String[] args) {
        boolean quit = true;
        Scanner scanner = new Scanner(System.in);
//default person in list
        Mature Vlad = new Mature("Vlad", 26, "boy", "Master's degree");
        Mature Iona = new Mature("Iona", 28, "girl", "Master's degree");
        Mature Corina = new Mature("Corina", 24, "girl", "Master's degree");
        Mature Eleanora = new Mature("Eleanora", 44, "girl", "Doctor's degree");


        Child Tommy = new Child("Tommy", 7, "boy", "preschool");
        Child Anna = new Child("Anna", 6, "girl", "preschool");
        Child Timmy = new Child("Timmy", 8, "boy", "preschool");

        Old John = new Old("John", 66, "boy", "Doctor's degree");
        Old Elisabeth = new Old("Elisabeth", 70, "girl", "Doctor's degree");
        Old Diana = new Old("Diana", 64, "girl", "Doctor's degree");

        ChildrenClass<Child> childrenList = new ChildrenClass<>();
        MatureClass<Mature> matureList = new MatureClass<>();
        PensionerClass<Old> oldList = new PensionerClass<>();

        matureList.addMatureToList(Vlad);
        matureList.addMatureToList(Iona);
        matureList.addMatureToList(Corina);
        matureList.addMatureToList(Eleanora);
        childrenList.addOneChildToList(Tommy);
        childrenList.addOneChildToList(Anna);
        childrenList.addOneChildToList(Timmy);
        oldList.addOnePensionerToList(John);
        oldList.addOnePensionerToList(Elisabeth);
        oldList.addOnePensionerToList(Diana);


        while (quit) {

            System.out.println("##################");
            System.out.println("1 Create a person: ");
            System.out.println("2 Print a person info from list: ");
            System.out.println("3 Remove person from list: ");
            System.out.println("4 Quit");
            System.out.print("your option: #");

            int option = scanner.nextInt();
            scanner.nextLine();


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


                    Child newChild = new Child(childName, childAge, childGender, childSchoolLevel);
                    String output = childrenList.addOneChildToList(newChild) ? "Added" : "List already have this user";
                    System.out.println(output);


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

                    Mature newMature = new Mature(matureName, maturedAge, matureGender, matureSchoolLevel);

                    String output = matureList.addMatureToList(newMature) ? "Added" : "List already have this user";
                    System.out.println(output);


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

                    Old newOld = new Old(oldName, oldAge, oldGender, oldSchoolLevel);

                    String output = oldList.addOnePensionerToList(newOld) ? "Added" : "List already have this user";
                    System.out.println(output);
                } else {
                    System.out.println("Sorry wrong input try again!");
                }

            } else if (option == 2) {
                System.out.println("Enter list name you want to see: ");
                System.out.println("1 Child");
                System.out.println("2 Mature");
                System.out.println("3 Old");
                int personOption = scanner.nextInt();
                scanner.nextLine();
                if (personOption == 1) {
                    childrenList.printAllChildren();
                } else if (personOption == 2) {
                    matureList.printAllMature();
                } else if (personOption == 3) {
                    oldList.printAllPensioners();
                }

            } else if (option == 3) {
                System.out.println("Option 3");
                System.out.println("Enter list name you want to delete: ");

                System.out.println("1 Child");
                System.out.println("2 Mature");
                System.out.println("3 Old");
                int personOption = scanner.nextInt();
                scanner.nextLine();
                if (personOption == 1) {
                    System.out.println("Enter person name you want to delete: ");
                    String personName = scanner.nextLine();
                    String output = childrenList.removeOneChildFromList(personName) ? "Successfully removed" : "Can't remove this user";
                    System.out.println(output);
                } else if (personOption == 2) {
                    System.out.println("Enter person name you want to delete: ");
                    String personName = scanner.nextLine();
                    String output = matureList.removeOneChildFromList(personName) ? "Successfully removed" : "Can't remove this user";
                    System.out.println(output);

                } else if (personOption == 3) {
                    System.out.println("Enter person name you want to delete: ");
                    String personName = scanner.nextLine();
                    String output = oldList.removeOneMatureFromList(personName) ? "Successfully removed" : "Can't remove this user";
                    System.out.println(output);
                }

            } else if (option == 4) {
                quit = false;
            } else {
                System.out.println("Sorry wrong input try again!");
            }


        }


    }


}
package Summary.Pack;


import java.util.Scanner;


class Main {


    public static void main(String[] args) {
        boolean quit = true;
        Scanner scanner = new Scanner(System.in);
//default person in list
        Mature Vlad = new Mature("Vlad", 26, "boy", "Master's degree");
        Mature Iona = new Mature("Iona", 28, "girl", "Master's degree");
        Mature Corina = new Mature("Corina", 24, "girl", "Master's degree");
        Mature Eleanora = new Mature("Eleanora", 44, "girl", "Doctor's degree");


        Child Tommy = new Child("Tommy", 7, "boy", "preschool");
        Child Anna = new Child("Anna", 6, "girl", "preschool");
        Child Timmy = new Child("Timmy", 8, "boy", "preschool");

        Old John = new Old("John", 66, "boy", "Doctor's degree");
        Old Elisabeth = new Old("Elisabeth", 70, "girl", "Doctor's degree");
        Old Diana = new Old("Diana", 64, "girl", "Doctor's degree");

        ChildrenClass<Child> childrenList = new ChildrenClass<>();
        MatureClass<Mature> matureList = new MatureClass<>();
        PensionerClass<Old> oldList = new PensionerClass<>();

        matureList.addMatureToList(Vlad);
        matureList.addMatureToList(Iona);
        matureList.addMatureToList(Corina);
        matureList.addMatureToList(Eleanora);
        childrenList.addOneChildToList(Tommy);
        childrenList.addOneChildToList(Anna);
        childrenList.addOneChildToList(Timmy);
        oldList.addOnePensionerToList(John);
        oldList.addOnePensionerToList(Elisabeth);
        oldList.addOnePensionerToList(Diana);


        while (quit) {

            System.out.println("##################");
            System.out.println("1 Create a person: ");
            System.out.println("2 Print a person info from list: ");
            System.out.println("3 Remove person from list: ");
            System.out.println("4 Quit");
            System.out.print("your option: #");

            int option = scanner.nextInt();
            scanner.nextLine();


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


                    Child newChild = new Child(childName, childAge, childGender, childSchoolLevel);
                    String output = childrenList.addOneChildToList(newChild) ? "Added" : "List already have this user";
                    System.out.println(output);


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

                    Mature newMature = new Mature(matureName, maturedAge, matureGender, matureSchoolLevel);

                    String output = matureList.addMatureToList(newMature) ? "Added" : "List already have this user";
                    System.out.println(output);


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

                    Old newOld = new Old(oldName, oldAge, oldGender, oldSchoolLevel);

                    String output = oldList.addOnePensionerToList(newOld) ? "Added" : "List already have this user";
                    System.out.println(output);
                } else {
                    System.out.println("Sorry wrong input try again!");
                }

            } else if (option == 2) {
                System.out.println("Enter list name you want to see: ");
                System.out.println("1 Child");
                System.out.println("2 Mature");
                System.out.println("3 Old");
                int personOption = scanner.nextInt();
                scanner.nextLine();
                if (personOption == 1) {
                    childrenList.printAllChildren();
                } else if (personOption == 2) {
                    matureList.printAllMature();
                } else if (personOption == 3) {
                    oldList.printAllPensioners();
                }

            } else if (option == 3) {
                System.out.println("Option 3");
                System.out.println("Enter list name you want to delete: ");

                System.out.println("1 Child");
                System.out.println("2 Mature");
                System.out.println("3 Old");
                int personOption = scanner.nextInt();
                scanner.nextLine();
                if (personOption == 1) {
                    System.out.println("Enter person name you want to delete: ");
                    String personName = scanner.nextLine();
                    String output = childrenList.removeOneChildFromList(personName) ? "Successfully removed" : "Can't remove this user";
                    System.out.println(output);
                } else if (personOption == 2) {
                    System.out.println("Enter person name you want to delete: ");
                    String personName = scanner.nextLine();
                    String output = matureList.removeOneChildFromList(personName) ? "Successfully removed" : "Can't remove this user";
                    System.out.println(output);

                } else if (personOption == 3) {
                    System.out.println("Enter person name you want to delete: ");
                    String personName = scanner.nextLine();
                    String output = oldList.removeOneMatureFromList(personName) ? "Successfully removed" : "Can't remove this user";
                    System.out.println(output);
                }

            } else if (option == 4) {
                quit = false;
            } else {
                System.out.println("Sorry wrong input try again!");
            }


        }


    }


}
