class Stack:
    def __init__(self):
        self.items = []

    # Mendefinisikan kelas Stack yang memiliki sebuah atribut yaitu items yang digunakan untuk menyimpan elemen-elemen stack.

    def push(self, item):
        self.items.append(item)

    # Metode push digunakan untuk menambahkan elemen baru ke dalam stack dengan menambahkannya ke akhir list items.

    def pop(self):
        return self.items.pop()
    
    # Metode pop digunakan untuk menghapus dan mengembalikan elemen teratas stack dengan menggunakan method pop dari list items.

    def peek(self):
        return self.items[-1]
    
    # Metode peek digunakan untuk mengembalikan elemen teratas stack tanpa menghapusnya dengan mengakses elemen terakhir dari list items.

    def empty(self):
        return len(self.items) == 0
    
    # Metode empty digunakan untuk mengecek apakah stack kosong atau tidak dengan memeriksa apakah list items memiliki panjang nol.

    def search(self, item):
        try:
            index = len(self.items) - 1 - self.items[::-1].index(item)
            return len(self.items) - index
        except ValueError:
            return -1
        
    # Metode search digunakan untuk mencari elemen tertentu di dalam stack dengan menggunakan method index dari list items.


st = Stack()
st.push("aku")
st.push("Anak")
st.push("Indonesia")

print("Next : " + st.peek())

st.push("Raya")
print(st.pop())
st.push("!")

count = st.search("aku")
while count != -1 and count > 1:
    st.pop()
    count -= 1

print(st.pop())
print(st.empty())
