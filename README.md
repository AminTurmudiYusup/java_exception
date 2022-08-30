# java_exception
# This Project Explain how Java Exception works
- What Is an Exception? =  is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instruction.

- Term and Explanation
  - Exception
  - exception handler components ( the try, catch, and finally blocks)
  	- try = define a block of code to be tested within a try block
  	- catch =allows you to define a block of code to be executed, if an error occurs in the try block
  	- throw = used to throws an exception, runtime system attempts to find something to handle it.

For explanation theory and practice follow this step to create maven project from scratch
 - open intellij idea or other idea
 - create maven project
 - create Age Exception class
 - Create comparison Age class



- FLow when an exception occurs and passed to handler
   - when an error occurs within a method
   - method create exception object
   - method hand it of excpetion object to the runtime system
   - runtime system looking for appropriate handler(try, catch block)
   - when found, passed the exception to handler(when exception handle by try catch, execution program will continue)
   - when not found handler, the runtime system will abort the program (i.e. crash) and an exception message will print to the console.


- How to Constructing Exception Handler
	- create try
	- enclose the code that might throw an exception within a try block/define a block of code to be tested within a try block
	- create catch and define Exception Type may occurs during test code inside the try block

WHAT WE CAN DO WITH THE EXCEPTION
Throw Exception
1. declare method which that thrown the exception
2. caller method call method that has throw the exception
3. create exception handler in try,catch block

Create Custom exception(Custom Exception are used to customize the exception according to user need)
  - create class which extend Exception class
  - create constructor of class
  - and calling constructor of parent Excpetion

Re-throwing Exception(when to re-throw exception?? i will use this scenario)
- Error occurred in the method
- we want to write log into db
- we can catch the exception in catch block and save log to db
- re-throw again the same exception
- for example, in my project

