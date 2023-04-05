package Latihan;

import java.util.Stack;
public class Latihan_1 {
    
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("aku"); // Menambahkan Sring ke dalam stack
        st.push("Anak"); 
        st.push("Indonesia");

        System.out.println("Next : " + st.peek()); // Menampilkan elemen teratas stack dengan method peek

        st.push("Raya");
        System.out.println(st.pop()); //Menghapus dan menampilkan elemen teratas stack dengan method pop()
        st.push("!");

        int count = st.search("aku"); // Mencari elemen di dalam stack
        while (count != -1 && count > 1){ // Menghapus elemen yang ditemukan
            st.pop(); // Menghapus elemen teratas stack
            count--; // Mengurangi indeks elemen yang ditemukan
        }
        System.out.println(st.pop());
        System.out.println(st.empty()); // Menampilkan apakah stack kosong atau tidak
    }
}
