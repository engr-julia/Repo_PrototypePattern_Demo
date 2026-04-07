# 🐾 The Prototype Pasture
### *A Java implementation of the Prototype Design Pattern*

Welcome to the **Prototype Pasture**, a clean and efficient Java project demonstrating how to duplicate objects without coupling your code to their specific classes. Instead of "birthing" new animals from scratch, we use a **Registry** to clone master prototypes!

---

## 🏗️ Architecture
This project follows the **Prototype Design Pattern**. It allows us to create new instances of `Cow`, `Sheep`, and `Horse` by copying existing configurations from a central registry.

### 🧩 Core Components
| Class | Role | Responsibility |
| :--- | :--- | :--- |
| **`Animal`** | **Interface** | The blueprint. Defines `makeSound()`, `getType()`, and the essential `clone()`. |
| **`Cow/Sheep/Horse`**| **Prototypes** | The concrete objects that know how to copy themselves. |
| **`AnimalRegistry`** | **Registry** | The manager. It stores a "Master Copy" of each animal and handles cloning. |
| **`TestAnimal`** | **Main Class** | The conductor. This is the entry point that brings the pasture to life. |

---

## 🚀 Getting Started

### Prerequisites
* **Java JDK 8** or higher installed.
* A terminal or your favorite IDE (IntelliJ, Eclipse, VS Code).

### Installation & Execution
1. **Clone the repository** (or copy the files into a single folder).
2. **Compile the source files:**
   ```bash
   javac Animal.java Cow.java Sheep.java Horse.java AnimalRegistry.java TestAnimal.java
   
## 🛠️ Key Logic: The Clone
The "magic" of this pattern happens in the clone() method. Instead of the Main class knowing the specific constructor details for every animal, it simply asks for a copy:

Java
@Override
public Animal clone() {
    // Logic: Returns a fresh instance of the same class
    return new Sheep(); 
}
## 🌟 Why use the Prototype Pattern?
Decoupling: The TestAnimal class doesn't need to know the specific classes of the objects it creates; it only deals with the Animal interface.

Efficiency: It simplifies object creation when you have many objects with similar default states (like 4 legs and specific diets).

Flexibility: You can easily add a Pig or a Goat just by implementing the interface and adding it to the Registry.

Created with ❤️ for Java developers and animal lovers alike.
