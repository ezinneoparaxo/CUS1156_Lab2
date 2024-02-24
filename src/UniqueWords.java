import java.util.ArrayList;

/* Project: Lab2
* Class: UniqueWords.java
* Author: Ezinne Opara
* Date: February 23, 2024
* This program looks at an ArrayLists of Strings and counts the number of words that only appear
* once throughout the list because this would classify it as "Unique".
*/
public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
	
   public static int countUnique(ArrayList<String> list) {
	  int count = 0;
	  
      for (int i = 0; i < list.size(); i++){
    	  String checkedWord = list.get(i);
    	  boolean isUnique = true;
    	  
    	  for (int j = 0; j < list.size(); j++){
			if(j != i && list.get(j).equals(checkedWord)) {
				isUnique = false;
				break;
			}
		 }
    	  if(isUnique) {
    		  count++;
    	  }
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
