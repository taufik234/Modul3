package Prak;
import java.util.Scanner;

public class Tugas1 {
    private static int MAXSIZE = 100; // ukuran maksimum stack
    private char[] stackArray = new char[MAXSIZE]; // array untuk menyimpan elemen stack
    private int top = -1; // indeks teratas stack

    // Method untuk menambahkan elemen ke stack
    public void push(char ch) {
        if (top == MAXSIZE - 1) { // cek apakah stack sudah penuh
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stackArray[top] = ch;
    }

    // Method untuk menghapus elemen dari stack
    public char pop() {
        if (top == -1) { // cek apakah stack sudah kosong
            System.out.println("Stack Underflow");
            return '\0';
        }
        char ch = stackArray[top];
        top--;
        return ch;
    }

    // Method untuk membalikkan urutan string
    public String reverseString(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            push(str.charAt(i)); // tambahkan setiap karakter dari string ke dalam stack
        }
        String reversedString = "";
        for (int i = 0; i < length; i++) {
            reversedString += pop(); // hapus setiap karakter dari stack dan tambahkan ke dalam string hasil balik
        }
        return reversedString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah string: ");
        String inputString = sc.nextLine();
        Tugas1 stack = new Tugas1();
        String reversedString = stack.reverseString(inputString);
        System.out.println("String yang telah dibalik: " + reversedString);
    }
}
