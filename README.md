## Rooftop Energy Tech Sdn Bhd - Technical Assessment

### How to run the scripts (Java files) :
1. Choose any .java file you want to run (e.g., hello.java, div_mod.java)
2. Download the file
3. Open an IDE/text editor such as VS Code, Eclipse, etc
4. Open the downloaded .java file in the IDE
5. Run the program

Make sure Java (JDK) is installed on your computer before running.


### Part 1 - Critical Thinking & Problem Solving  
**Question 1 (hello.java)**  
This is the simplest program to confirm output prints correctly.

**Question 2 (is_even.java)**  
I checked whether the number is divisible by 2 since this is the most straightforward way to determine if a number is even or odd. I could use a bitwise check. but using modulo is more easier to understand. 

**Question 3 (greater_of_two.java)**  
The easiest way to differentiate between two integers is by using an if–else statement. Since this is not allowed, I used a mathematical formula to determine the larger number without relying on conditional statements.

**Question 4 (count_digit.java)**  
I processed the number digit by digit using modulo and division to count how many times the digit appears. Another alternative solution is to convert the number to a string and count the characters but the arithmetic approach is more efficient and does not rely on type conversion.

**Question 5 (string_rev.java)**  
Since StringBuilder.reverse() is not allowed, I reversed the string by looping from the last character to the first and building a new string.

**Question 6 (get_second_largest.java)**  
I sorted the array and scanned backward to find the first value that is different from the maximum, ensuring duplicates are handled correctly.

**Question 7 (fizzbuzz.java)**  
I looped from 1 to 100 and checked divisibility conditions in the correct order to handle all cases properly. I could dynamically build a result string but using if-else conditions is simpler and clearer.

### Bonus Question  
**Question 8 (div_mode.java)**  
I simulated division using repeated substraction to calculate the quotient and remainder without using division operators. Another alternative solution is to use a faster doubling technique but repeated substraction is more simpler. 

**Question 9 (first_uniq_char.java)**  
I counted character frequencies using a map and then scanned the string again to find the first character that appears only once. Another alternative solution is to use an array for ASCII characters.

**Question 10 (simple_stack.java)**  
I implemented the stack using an array and a top index so that elements follow Last-In-First-Out behavior. Another alternatie solution is to use an ArrayList but using an array better demonstrates how a stack works internally.





