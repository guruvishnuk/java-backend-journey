# Java Collections Framework (JCF)

## What is Collection?

A Collection is a framework that provides architecture to store and manipulate group of objects.

---

## Why Collections?

Problems with Arrays:
- Fixed size
- No built-in methods
- Not flexible

Collections solve:
- Dynamic size
- Built-in algorithms
- Easy data handling

---

## Collection Hierarchy

Iterable
   ↓
Collection
   ├── List (ArrayList, LinkedList)
   ├── Set (HashSet)
   └── Queue

Map (separate hierarchy)
   ├── HashMap
   ├── TreeMap

---

## List

- Ordered
- Allows duplicates

Example:
[10, 20, 20]

---

## Set

- No duplicates
- Unordered

Example:
[10, 20]

---

## Map

- Key-Value pairs
- Keys are unique

Example:
{id: 101, name: "Ram"}

---

# HashMap (IMPORTANT)

## What is HashMap?

Stores data in key-value pairs.

---

## Internal Working (VERY IMPORTANT)

1. Key → Hash Function → HashCode
2. HashCode → Index (bucket)
3. Value stored in bucket

---

## Collision

When two keys map to same index.

Handled using:
- Linked List
- Tree (Java 8+)

---

## Load Factor

Default: 0.75

When exceeded:
→ Rehashing happens

---

## Time Complexity

- get() → O(1)
- put() → O(1)

Worst case:
→ O(n)

---

## Null Rules

- One null key allowed
- Multiple null values allowed