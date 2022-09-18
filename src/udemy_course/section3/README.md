# Section 3: Course first steps
In this section I got introduce to Java basics: declaration statements, expressions and primitive data types.

## Primitive data types:
- byte (8 bits)
- short (16 bits)
- int (32 bits) => always use integer unless you got a really good reason to not do that
- long (64 bits)


- float (32 bits) => use `f` to tell compiler to treat literal as float instead of double eg. 2.4f
- double (64 bits) => double is faster so its highly recommend to use it over float. use `d` to tell compiler that literal is double and not integer eg. 2d
- NOTE: float or double are not great for precise calculations. we should use **BigDecimal**.


- char (16 bits / 2 bytes) => it stores unicode characters too like '\u0040' => unicode-table.com
- boolean (true/false)

## Type casting in Java: 
Type casting is when you assign a value of one primitive data type to another type.
Should add `(short)` `(byte)` manually when converting `int` to a smaller size type (short/byte).

## Strings:
1. string data type is not a primitive type.
2. It's actually a class. Strings are immutable.
3. New string get created each time we modify its value.
4. Should use **StringBuffer** to append strings instead of += as it is more efficient.

## Operators, operands, expressions:
1. Java operators: `+` `-` `*` `/` `%` `=` `==` `!=` `>` `<` `<=` `>=` `&&` `||` `&` `|`
2. Operands => 5 * myValue (`5` is an operand, `myValue` is an operand)
3. Expressions => `5 * myValue` is an expression

## If-then statements:
Always use code blocks. Even if there is one statement inside. It's cleaner and easier for code modification.

## Operators summary
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

## Java Operator Precedence Table
https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
