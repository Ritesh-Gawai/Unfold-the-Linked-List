# 🧩 Unfold the Linked List

This Java program **unfolds a folded linked list** back to its original order.

In a folded list:
L0 -> LN -> L1 -> LN-1 -> L2 -> LN-2 -> ...

css
Copy code
The program restores it to:
L0 -> L1 -> L2 -> ... -> LN

yaml
Copy code

---

## 🧠 Problem Description

Given a folded linked list, your task is to **unfold it** and print the original sequence.

### Example 1
**Input:**
6
1 6 2 5 3 4

makefile
Copy code

**Output:**
1 2 3 4 5 6

makefile
Copy code

### Example 2
**Input:**
5
1 5 2 4 3

makefile
Copy code

**Output:**
1 2 3 4 5

pgsql
Copy code

---

## ⚙️ Algorithm

1. Split the linked list into two halves — one with even-indexed nodes, one with odd-indexed nodes.  
2. Reverse the second half.
3. Append the reversed half to the end of the first half.

---


📂 Project Structure
css
Copy code
UnfoldLinkedList/
├── src/
│   └── Main.java
└── README.md
🧪 How to Run
Open the project in IntelliJ IDEA or any Java IDE.

Copy the code into src/Main.java.

Run the program.

Input:

Copy code
6
1 6 2 5 3 4
Output:

Copy code
1 2 3 4 5 6
🏷️ Topics Covered
Linked List

Reversal of Linked List

Two-pointer technique

Data Structures in Java

👨‍💻 Author
Ritesh Gawai
💼 Java Developer | 🎓 BCA Graduate
