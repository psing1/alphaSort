import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> List = new ArrayList<>();
    ArrayList<String> sortedList = new ArrayList<>();
    String Item;
    String tempList;


      System.out.println("WELCOME TO GROCERY LIST PROGRAM!\nHow many items do you want to add?: ");
      int temp = sc.nextInt();
      sc.nextLine();

      for (int x = 0; x < temp; x++){
        System.out.println("Enter item: ");
        String item = sc.nextLine();
        List.add(item);
      }

      System.out.println("\nEnter item name to check if it is in list: ");
      String temp2 = sc.nextLine();
      Sort list = new Sort(List,temp2);
      if (list.searchItem(List,temp2)== true){
        System.out.println(temp2 + " is in the list.\n");
      }
      else {
        System.out.println(temp2+ " is not in the list would you like to add it? (1 for yes 2 for no)");
        int temp3 = sc.nextInt();
        if (temp3 == 1){
          List.add(temp2);
        }
        else if (temp3 == 2){
          System.out.println("\nAlright!\n");
        }
        else{
          System.out.println("\nIncorrect Input!\n");
        }
      }
    System.out.println(list.sort(List));
  }
}