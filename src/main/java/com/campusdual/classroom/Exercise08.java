package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {

    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int Y) {
int X = 0;

while (X < Y) {
    System.out.println(X + " < " + Y + ". El proximo ciclo valdra: " + (X + 1));
    X++;
}
System.out.println(X + " es ahora igual o mayor que " + Y + ". Fin del ciclo.");

    }
}