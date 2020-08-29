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

//Keywords
This: 'this';
Return: 'return';
Break: 'break';
Continue: 'continue';

//Brackets
LeftParen: '(';
RightParen: ')';
LeftBrace: '{';
RightBrace: '}';
LeftBracket: '[';
RightBracket: ']';

program
    : expression+
    ;

expression
    : conditional_operator
    | assignment
    | sum
    ;

conditional_operator
    : LeftParen? sum RightParen? '?' block (':' block)?
    ;

assignment
    : field '=' expression
    ;

block
    : LeftBrace (Return expression ';')* RightBrace
    | expression
    ;

sum
    : sum (Multiply | Divide) sum
    | sum (Add | Subtract) sum
    | sum Equal sum
    | sum Less sum
    | sum LessOrEqual sum
    | sum Greater sum
    | sum GreaterOrEqual sum
    | sum NotEqual sum
    | value
    | LeftParen sum RightParen
    ;

value
    : field
    | NUMBER
    ;

argument
    : field
    | NUMBER
    ;

field
   : field LeftBracket value RightBracket
   | field LeftParen argument (',' argument)* RightParen
   | field '.' name
   | name
   ;

name
   : STRING
   ;

STRING
   : [a-zA-Z_][a-zA-Z0-9_]*
   ;

NUMBER
    : ('-')?[0-9]+('.'[0-9]*)?
    ;

WS
   : [ \r\n\t] -> channel(HIDDEN)
   ;
