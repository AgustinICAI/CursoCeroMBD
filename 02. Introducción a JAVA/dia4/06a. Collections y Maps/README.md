# Collections
- List vs Set
- ArrayList , LinkedList
- TreeSet, HashSet
- Map
- HashMap, TreeMap
- Iteration y ejemplos prácticos


## Ordenes de ejecución

### ArrayList
| Operation | Complexity |
| ---      | --- |
| add() | takes O(1) time |
| add(index, element) | in average runs in O(n) time | 
| get() | is always a constant time O(1) operation |
| remove() | runs in linear O(n) time. We have to iterate the entire array to find the element qualifying for removal |
| indexOf() | also runs in linear time. It iterates through the internal array and checking each element one by one. So the time complexity for this operation always requires O(n) time |
| contains() | implementation is based on indexOf(). So it will also run in O(n) time |


### LinkedList
| Operation | Complexity |
| ---      | --- |
| add() | supports O(1) constant-time insertion at any position |
| get() | searching for an element takes O(n) time |
| remove() | removing an element also takes O(1) operation, as we provide the position of the element |
| contains() | also has O(n) time complexity |

### HashSet
| Operation | Complexity |
| ---      | --- |
| add() | O(1) |
| remove() | O(1) |
| contains() | O(1) |

### TreeSet
| Operation | Complexity |
| ---      | --- |
| add() | O(log(n)) |
| remove() | O(log(n)) |
| contains() | O(log(n)) |