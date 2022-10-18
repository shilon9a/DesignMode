package Interpreter;

import Interpreter.Expression.Expression;
import Interpreter.Expression.impl.AndExpression;
import Interpreter.Expression.impl.OrExpression;
import Interpreter.Expression.impl.TerminalExpression;

public class Main {
    public static void main(String[] args) {
        Expression expressionOr=Or();
        System.out.println(expressionOr.interpreter("Roobot and jhn john "));
        Expression expressionAnd=And();
        System.out.println(expressionAnd.interpreter("is alice married?"));
    }

    public static Expression Or(){
        Expression expression1=new TerminalExpression("Roobot");
        Expression expression2=new TerminalExpression("john");
        return new OrExpression(expression1,expression2);
    }

    public static Expression And(){
        Expression expression1=new TerminalExpression("alice");
        Expression expression2=new TerminalExpression("married");
        return new AndExpression(expression1,expression2);
    }
}
