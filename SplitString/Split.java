/* Taylor Nguyen
 * AP Compsci period 1
 */
import java.util.*;
public class Split {

 
public static void main(String[] args) {
// Your task Part 0
//String.split();
//It's a method that acts on a string, <StringName>.split(<String sp>);
//Where sp is the string where the string splits
//And it returns an array
// Example: "I like apples!".split(" "); 
//it will split at spaces and return an array of ["I","like","apples!"]
// Example 2: "I really like really red apples".split("really")
//it will split at the word "really" and return an array of ["I "," like "," red apples!"]
//play around with String.split! 
//What happens if you "I reallyreally likeapples".split("really") ?



//Your task Part 1:
/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
* What if it's a fancy sandwich with multiple pieces of bread?
*/


//Your task Part 2:
/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
* Again, what if it's a fancy sandwich with multiple pieces of bread?
*/
	
System.out.println("part 0");
String[] splitdis = "I like apples!".split(" ");
System.out.println(Arrays.toString(splitdis));

System.out.println(Arrays.toString("I reallyreally like apples!".split("really")));
System.out.println("breadapplespineapplesbreadlettustomatobaconmayohambreadcheesebread".indexOf("bread"));

System.out.println("part 1");
sandwichSplitter("breadmayohambreadcheesebread");
System.out.println("part 2");
spaceSandwichSplitter("bread mayo ham bread cheese");
	}
public static void sandwichSplitter(String sandwich) {
//checks if there is any bread in the sandwich
	//if not, return error message
	if(sandwich.indexOf("bread") < 0) {
		System.out.println("that's a salad, not a sandwich");
	}
	
	String[] ingredients = sandwich.split("bread");

	if(sandwich.indexOf("bread") == 0 && sandwich.endsWith("bread")) {
			for(int i = 0; i < ingredients.length; i++) {
				System.out.print(ingredients[i]);
	
		}
			
	
		
	} else if(sandwich.indexOf("bread") > 0 && sandwich.indexOf("bread") != sandwich.length()-5) {
		for(int i = 1; i < ingredients.length-1; i++) {
			System.out.print(ingredients[i]);
		}
	} else if(sandwich.indexOf("bread") > 0) {
		for(int i = 1; i < ingredients.length-1; i++) {
			System.out.print(ingredients[i]);
	}  
	}else {
		for(int i = 0; i < ingredients.length-1; i++) {
			System.out.print(ingredients[i]);
		}
}
	System.out.println();
}
public static void spaceSandwichSplitter(String sandwich) {
	String[] ingredients = sandwich.split(" ");
	String sandwichWOspace ="";
	for(int i = 0; i < ingredients.length; i++) {
		sandwichWOspace += ingredients[i];
	}
	
	sandwichSplitter(sandwichWOspace);
}
}
