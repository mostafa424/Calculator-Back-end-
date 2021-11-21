# Calculator-Back-end-
Calculator web-based application backend written in java(Spring Boot frame work).
# Instruction Manual:
# A) Using Web Buttons:
1. using web buttons, enter the expression you want to evaluate 
2. for negative numbers press +/- button before pressing the number
(pressing the “- “button instead will yield an error)
3. to evaluate the expression, press the “=” button.
# B) Using Keyboard Buttons:
1. enter the expression you want to evaluate separated by whitespace
2. for negative numbers press - button before pressing the number without 
whitespace separation (for example: -3 not - 3).
3. to evaluate the expression, press the “=” web button.
4. In case of error, delete the character before entering the expression.
# Assumptions:
• User must enter the operations with same precedence (5+3+2 ,5-2-9…) 
different operations may yield a wrong output (5+3*11 will yield 88 not 38)
• User mut not enter two operations (++ or +*) or the result will yield error. 
However, user can enter (- -)
• Writing negative numbers must be used by pressing the +/- button then the 
number only
Mostafa AbdelHaliem AbdelMohsen AbdelHaliem El Tawy ID: 19016662
• In case user wants to enter the expression using the keyboard he must 
write each symbol separated by white space (5 + 3) yet he must press the 
“=” button on the website in order to evaluate the expression
• Squaring and square root operations requires one operand only(not 
applicable inside an expression)
• Any error generated will appear as “E” in the form and on pressing the first 
button the letter will disappear. However, user must delete it manually 
when using the keyboard to enter the expression.
# Local Hosts:
1)angular: LocalHost:4200
2)Spring Boot: LocalHost:8080
# Features:
Support basic operations (+, -, *, /)
Support power functions (^) and squaring the result(^2)
Square Root of a number( ROOT(X) )
Support negative numbers (denoted by button +/-)
Clear function (c button)
Support keyboard typing
