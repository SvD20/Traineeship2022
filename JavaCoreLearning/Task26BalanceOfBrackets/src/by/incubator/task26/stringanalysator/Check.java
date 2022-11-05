package by.incubator.task26.stringanalysator;

import java.util.Stack;

public class Check {

    private String input;
    private int lengthInput;
    private Stack<Character> stack;

    //В конструкторе инициализируем поля
    public Check(String input) {
        this.input = input;
        this.lengthInput = input.length();
        stack = new Stack();
    }

    public boolean makeCheck() {
        for (int i = 0; i < lengthInput; i++) {  // начинаем последовательно считывать
            char ch = input.charAt(i);              // считывание символа
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.addElement(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!stack.isEmpty()) {                                 //если стек не пустой
                        char chClosed = stack.pop();             //удалить и проверить
                        if ((ch == '}' && chClosed != '{')
                                || (ch == ']' && chClosed != '[')
                                || (ch == ')' && chClosed != '('))
                            return false;
                    } else                                                  //недостаток элементов в стеке
                        return false;
                    break;
                default:    // для других символов действия не выполняются
                    break;
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}