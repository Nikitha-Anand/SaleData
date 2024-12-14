# About SaleData

- A business sells a single product. Customers can purchase one or more of this product.
- Each sale has an ID and a quantity, for example : "ABC" and 2 
- The business needs a program to store the data about the sales in a circular queue data structure.

# Declarations/Initialisations

- declare a global array, CircularQueue, of 5 items to store the sale records
- declare the global pointers Head and Tail
- declare the global variable NumberOfItems
- initialise all elements of the array CircularQueue to an empty record, where the ID is null ("") and quantity is -1
- initialise Head, Tail and NumberOfItems to 0

# Procedures/Functions

- Enqueue():
  - takes a new record as a parameter
  - inserts the record in the circular queue at the element pointed to by Tail
  - updates pointers and other variables as required
  - returns −1 if the circular queue is full
  - returns 1 if the record is stored successfully.
- Dequeue():
  - returns a null or empty record if the circular queue is empty
  - returns the first record in the queue if the circular queue is not empty
  - updates pointers and other variables as required.
- EnterRecord():
  - takes an ID and quantity as input and creates a sale record
  - uses Enqueue() to insert the record in the circular queue
  - outputs "Full" if the record was not inserted in the circular queue
  - outputs "Stored" if the record was inserted in the circular queue.
- Main Program():
  - use EnterRecord() to input six records in the table
  - use Dequeue() to remove one record
  - output either the ID and quantity of the removed record, or an error message if the circular queue is empty
  - use EnterRecord() to input the record with the ID "LLP" for a second time
  - output the ID and quantity for all the records currently stored in the array CircularQueue.
