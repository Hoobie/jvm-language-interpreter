/*
<PROGRAM> ::= <STATEMENTS>
<STATEMENTS> ::= <STATEMENT> | <STATEMENTS> <STATEMENT>
<STATEMENT> = epsilon|<VARIABLE-DECLARATION>;|<ASSIGNMENT>;|Print "string message";|Print <string-constant>;HeapAnalyze;|Collect;
<VARIABLE-DECLARATION> ::= VarDeclT <string-constant>;|VarDeclS <string-constant> "<string-constant>";|VarDeclS <string-constant> NULL;
<ASSIGNMENT> ::= <LVALUE> = <RVALUE>
<LVALUE> ::= <DEREF>
<RVALUE> ::= <DEREF>|NULL|<integer-constant>;|"<string-constant>";
<DEREF> ::= <string-constant>;|<DEREF>.<string-constant>;
*/
grammar NPJ;
program: statements;
statements: statement | statements statement;
statement: variableDeclaration';' | assignment';' | print';' | heapAnalyze';' | collect';';
variableDeclaration: variableDeclarationT | variableDeclarationSConstant | variableDeclarationSNull;
variableDeclarationT: 'VarDeclT' STRING;
variableDeclarationSConstant: 'VarDeclS' STRING '"'STRING'"';
variableDeclarationSNull: 'VarDeclS' STRING NULL;
assignment: lValue '=' rValue;
lValue: STRING | lValue'.'STRING;
rValue: lValue | NULL | INT | '"'STRING'"';
print: printStringMessage | printStringConstant;
printStringMessage: 'Print' '"'STRING'"';
printStringConstant: 'Print' STRING;
heapAnalyze: 'HeapAnalyze';
collect: 'Collect';
NULL: 'NULL';
INT: '0' | [1-9][0-9]*;
STRING: [a-zA-Z][a-zA-Z0-9]*;
WS: [ \t\r\n]+ -> skip;