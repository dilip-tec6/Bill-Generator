# 🍔 Burger Bill Generator (Java)

A simple Java-based project that calculates the total bill of a burger based on selected options like:

- Veg / Non-Veg  
- Extra Cheese  
- Extra Toppings  
- Takeaway (Packaging)  

---

## 🚀 Features

### Base Price
- Veg Burger: Rs.300  
- Non-Veg Burger: Rs.400  

### Add-ons
- Extra Cheese: Rs.100  
- Extra Toppings: Rs.150  
- Takeaway: Rs.20  

---

## 🛠️ Technologies Used

- Java (Core Java)  
- OOP Concepts (Classes, Methods, Constructors)  

---

## 📂 Project Structure

```
Burger.java        // Base burger class
KingBurger.java    // Special burger (inherits Burger)
Main.java          // Entry point to run program
```

---

## ▶️ How to Run

### 1. Compile the program
```
javac Main.java Burger.java KingBurger.java
```

### 2. Run the program
```
java Main
```

---

## 💡 Example Usage

```java
Burger burger = new Burger(true); // veg burger
burger.addExtraCheese();
burger.addExtraToppings();
burger.takeAway();

System.out.println(burger.getBill());
```

---

## 🧾 Output Example

```
Burger: 300
Extra Cheese added: 100
Extra Toppings added: 150
Take away: 20
Bill: 570
```

---

## ⚠️ Notes

- This is a basic console-based project  
- No user input or validation implemented  
- Add-ons can be improved with better checks  

---

## 📌 Author

Dilip (SudoZen)
