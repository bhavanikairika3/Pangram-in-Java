Question : Check if the input is pangram or not. (A pangram is a sentence that contains all the 
alphabets from A to Z)

Firstly, Lets Understand the Question in detail : A pangram is a sentence that uses every letter of the alphabet at least once.
For example, "The quick brown fox jumps over the lazy dog" is a pangram because it contains all the letters from A to Z. Now, We need to check if a given sentence includes all 26 letters of the English alphabet

Let's Understand the Coding Part now :

public static boolean isPangram(String str)  =  This line defines a method called "isPangram" which takes a String as input and returns a boolean (either true if it's a pangram or false if it's not).

str = str.toLowerCase();  =  Converts the input sentence to lowercase. This step ensures that the function is not case-sensitive, meaning it can detect both uppercase and lowercase letters.

boolean[] isAlphabetPresent = new boolean[26];  =  Creates an array of boolean values called isAlphabetPresent with a length of 26 (for the 26 letters of the alphabet). Each element of this array represents whether a corresponding letter is present in the sentence.

for (int i = 0; i < str.length(); i++)  =  This loop goes through each character of the input sentence.

char ch = str.charAt(i);  =  Retrieves the current character from the sentence.

if (Character.isAlphabetic(ch))  =  Checks if the character is an alphabet letter.

isAlphabetPresent[ch - 'a'] = true;   =  If it's a letter, it marks the corresponding position in the isAlphabetPresent array as true, indicating that this letter is present in the sentence.
Check if All Letters are Present:

for (boolean isPresent : isAlphabetPresent)  =  This enhanced for loop goes through each element of the isAlphabetPresent array.

if (!isPresent) { return false; }  =  If any letter is not present (isPresent is false), the function immediately returns false, indicating it's not a pangram.
Return the Result:

return true; = If the loop completes without returning false, that means all letters are present, so the function returns true, indicating it's a pangram.

public static void main(String[] args)  =  This is the main method where the program starts executing.
String sentence = "The quick brown fox jumps over the lazy dog";:
Sets the input sentence. You can change this line to test different sentences.

boolean isPangram = isPangram(sentence); = Calls the isPangram method with the given sentence and stores the result in the isPangram variable.

System.out.println("The sentence is a pangram.");  =   Print Statement. If isPangram is true, this line prints "The sentence is a pangram."
System.out.println("The sentence is not a pangram.");  =  If isPangram is false, this line prints "The sentence is not a pangram."
