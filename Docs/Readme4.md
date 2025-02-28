# Java Data Types

Java data types are categorized into **primitive** and **non-primitive** types.

## 1. Primitive Data Types
Primitive data types are predefined by Java and store simple values.

| Data Type | Size (Bytes) | Default Value | Range |
|-----------|-------------|---------------|------------|
| **byte** | 1 | 0 | -128 to 127 |
| **short** | 2 | 0 | -32,768 to 32,767 |
| **int** | 4 | 0 | -2,147,483,648 to 2,147,483,647 |
| **long** | 8 | 0L | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| **float** | 4 | 0.0f | 3.4e-038 to 3.4e+038 | 
| **double** | 8 | 0.0d | 1.7e-308 to 1.7e+308 |
| **char** | 2 | '\u0000' | 0 to 65,535 (Unicode) |
| **boolean** | 1 | false | true or false |

### **Byte Data Type - Uses**
- Used to save memory when handling large amounts of data.
- Alternative to `int` for small-range values.
- Used in file handling, image processing, and network transmission.

## 2. Non-Primitive Data Types
Non-primitive data types are user-defined and can store multiple values.

### **Class & Object**
- **Class:** A blueprint for creating objects.
- **Object:** An instance of a class.

### **Enum (Enumerations)**
- Represents a fixed set of constants.

### **Array**
- Stores multiple values of the same data type.

### **String**
- A sequence of characters (non-primitive, though it behaves like a primitive).

## 3. Access Modifiers in Java
Access modifiers define visibility for classes, variables, and methods.

| Modifier | Within Class | Within Package | Outside Package (Subclass) | Outside Package (Non-Subclass) |
|----------|-------------|----------------|----------------------------|--------------------------------|
| **public** | ✅ | ✅ | ✅ | ✅ |
| **private** | ✅ | ❌ | ❌ | ❌ |
| **protected** | ✅ | ✅ | ✅ | ❌ |
| **default (no modifier)** | ✅ | ✅ | ❌ | ❌ |

## 4. Primitive vs Non-Primitive Data Types

| Feature | Primitive Data Type | Non-Primitive Data Type |
|---------|--------------------|----------------------|
| **Definition** | Predefined in Java | Created by the programmer |
| **Size** | Fixed | Can be dynamic |
| **Memory Usage** | Stores actual value | Stores reference to the object |
| **Operations** | Fast | Slower compared to primitive types |
| **Examples** | `int, float, char, boolean` | `String, Array, Class, Object` |

