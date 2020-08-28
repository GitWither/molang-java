grammar MoLang;

//Logical operators
And: '&&';
Or: '||';
NullCoalescing: '??';
Not: '!';
Less: '<';
LessOrEqual: '<=';
Equal: '==';
Greater: '>';
GreaterOrEqual: '>=';
NotEqual: '!=';

//Math operators
Add: '+';
Subtract: '-';
Multiply: '*';
Divide: '/';
Modulus: '%'; //Not sure if this one is implemented

//Keywords
This: 'this';
Return: 'return';

//Brackets
LeftParen: '(';
RightParen: ')';
LeftBrace: '{';
RightBrace: '}';
LeftBracket: '[';
RightBracket: ']';

program
    : expression
    ;

expression
    : conditional_operator
    | assignment
    | sum
    ;

conditional_operator
    : LeftParen expression RightParen '?' block (':' block)?
    ;

assignment
    : field '=' expression
    ;

block
    : LeftBrace (expression ';')* RightBrace
    ;

sum
    : sum Add sum
    | sum Subtract sum
    | sum Multiply sum
    | sum Divide sum
    | sum Modulus sum
    | sum Equal sum
    | sum Less sum
    | sum LessOrEqual sum
    | sum Greater sum
    | sum GreaterOrEqual sum
    | sum NotEqual sum
    | value
    | function_call
    | LeftParen sum RightParen
    ;

value
    : field
    | NUMBER
    ;

field
   : field ('[' value ']')
   | field '.' name
   | name
   ;

function_call
   : name ('.' name)* LeftParen (sum? (','sum)*) RightParen
   ;

name
   : STRING
   ;

STRING
   : [a-zA-Z_][a-zA-Z0-9_]*
   ;

NUMBER
    : [0-9]+('.'[0-9]*)?
    ;

WS
   : [ \r\n\t] -> channel(HIDDEN)
   ;
