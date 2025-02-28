* What is JDK, JRE, and JVM? *

=======================================
📌 1. JVM (Java Virtual Machine)
=======================================
* JVM is an abstract machine that provides a runtime environment to execute Java programs.
* It is platform-independent (Write Once, Run Anywhere).
* Converts **Java bytecode** into machine code.
* Handles memory management (Garbage Collection).
* Components:
  - Class Loader: Loads .class files.
  - Runtime Memory: Manages heap, stack, etc.
  - Execution Engine: Executes bytecode.

=======================================
📌 2. JRE (Java Runtime Environment)
=======================================
* JRE is a software package that provides the **libraries + JVM** required to run Java applications.
* It does NOT include development tools (compiler, debugger, etc.).
* If you only want to **run** Java programs, install JRE.

🔹 Components:
  - JVM
  - Core Libraries (Java API)
  - Supporting Files

=======================================
📌 3. JDK (Java Development Kit)
=======================================
* JDK is a **complete software package** for Java development.
* It includes **JRE + development tools** like compiler (`javac`), debugger, and documentation generator.
* Required for writing and compiling Java programs.

🔹 Components:
  - JRE (which includes JVM)
  - Development Tools (Compiler, Debugger, Javadoc, etc.)
  - Additional Libraries (JavaFX, Swing, etc.)

=======================================
📌 4. Key Differences Between JDK, JRE, and JVM
=======================================

| Feature  | JVM  | JRE  | JDK  |
|----------|------|------|------|
| Runs Java Code | ✅ | ✅ | ✅ |
| Includes JVM   | ✅ | ✅ | ✅ |
| Includes JRE   | ❌ | ✅ | ✅ |
| Includes Compiler | ❌ | ❌ | ✅ |
| Used for Development | ❌ | ❌ | ✅ |
| Used for Running Java Apps | ✅ | ✅ | ✅ |

=======================================
📌 5. Summary
=======================================
✔ **JVM** → Runs Java code (inside JRE).  
✔ **JRE** → Runs Java applications (contains JVM & Libraries).  
✔ **JDK** → Develops & runs Java programs (contains JRE & tools).  

🔹 If you want to **run Java programs**, install **JRE**.  
🔹 If you want to **develop Java programs**, install **JDK**.

---

🔥 Happy Learning! 🚀
