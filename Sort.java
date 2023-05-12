import java.util.ArrayList;

class Sort{

  private static String temp;
  private static ArrayList<String> sList = new ArrayList<>();

  public Sort(ArrayList<String> List, String item){
  
    ArrayList<String> arr = List;
    String Article = item;
    
  }
  
  public static boolean searchItem(ArrayList<String> arr, String Article){
    for (int i = 0;i<arr.size();i++){
      if (arr.get(i).equals(Article)){
        return true;
      }
    }
    return false; 
  }

  public static ArrayList<String> sort(ArrayList<String> arr){
  for (int j = 0; j < arr.size(); j++) {
   	    for (int i = j + 1; i < arr.size(); i++) {
      		if (arr.get(i).compareTo(arr.get(j)) < 0) {
      			temp = arr.get(j);
      			arr.set(j,arr.get(i));
      			arr.set(i,temp);
      		}
  	    }
       sList.add(arr.get(j));
  	 }
    return sList;
  }
  
}