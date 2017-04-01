# Description
This project is to practice with cucumber, as described in 'The Cucumber for Java Book'.
Unlike the book, the project uses Java 8 instead of older versions; therefore, the syntax 
of the cucumber Step Definitions is different (using lambda's instead of method declarations)
Also, this project uses a newer version of cucumber.

## How to build project and run tests
To build the project and run tests use 'mvn clean test'.

## Using regular expressions
Some useful tips:

### Capture groups
* Place a variable between parenthesis () to pass it as an argument to the method
### Wild cards
* Alternation: place different values in the capture group, separated by the pipe |

