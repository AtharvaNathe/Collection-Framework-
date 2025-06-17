# Collection-Framework-

# 📚 Java Collections Framework – Examples & Usage

This repository demonstrates the core concepts and usage of the **Java Collections Framework**, with clean and simple examples for each major interface and class like `ArrayList`, `HashMap`, `HashSet`, and more.

> Designed for students, interview prep, and Java developers wanting to understand how different collections work in practice.

---

## 🔧 Technologies Used

- Language: Java
- JDK Version: 8 or above
- IDE: Any (e.g., IntelliJ, Eclipse, VS Code)
- No external dependencies

---

## 📁 Project Structure

Each class in the Collections Framework is covered with a dedicated `.java` file that demonstrates:
- Basic syntax and object creation
- Element insertion and deletion
- Use of loops and iterators
- Null and duplicate handling
- Ordered vs Unordered behavior

### ✅ Covered Interfaces and Classes:

| Category     | Interfaces     | Classes |
|--------------|----------------|---------|
| **List**     | `List`         | `ArrayList`, `LinkedList`, `Vector`, `Stack` |
| **Queue**    | `Queue`, `Deque` | `PriorityQueue`, `ArrayDeque` |
| **Set**      | `Set`, `SortedSet` | `HashSet`, `LinkedHashSet`, `TreeSet` |
| **Map**      | `Map`, `SortedMap` | `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable` |

---

## 📘 Example – ArrayList

```java
ArrayList<String> cars = new ArrayList<>();
cars.add("Audi");
cars.add("BMW");
cars.add(null); // Allows null
cars.add("Audi"); // Allows duplicates

System.out.println(cars);            // Print all elements
System.out.println(cars.get(0));     // Access element by index
cars.remove(1);                      // Remove by index



##🎯 Learning Outcomes
Understand the behavior of various collections

Learn when to use which type of collection

Handle duplicates, nulls, sorting, and iteration

Improve your coding and debugging skills in Java

##🧠 Author
 Atharva Nathe
