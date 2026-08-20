# Bob's Bagels Domain Model

| User Story                   | Classes           | Properties                        | Methods                                         | Scenario / Output                                   |
|:-----------------------------|:------------------|:----------------------------------|:------------------------------------------------|:----------------------------------------------------|
| 1. Add bagel                 | Basket            | items: List<String>               | addItem(item: String)                           | Bagel is put into basket list.                      |
| 2. Remove bagel              | Basket            | items: List<String>               | removeItem(item: String)                        | Bagel is removed from basket list                   |
| 3. Basket capacity           | Basket            | items: List, capacity: int        | isFull():boolean                                | Basket is full or not.                              |
| 4. Change basket capacity    | Basket            | capacity: int                     | changeCapacity(newCapacity : int): void         | Updates max capacity of basket.                     |
| 5. Remove non-existing item  | Basket            | items: List<String>               | removeItem(item: String): boolean               | Returns false if the item is not in the basket.     | 
| 6. Get total cost of items   | Basket            | items: List<String>, price: float | totalCost(): float                              | Get total price of items in basket.                 |
| 7. Get price of item         | Inventory         | stock: Map<String, Float>         | getItemPrice(item: String): float               | Returns the price of the specific item.             |
| 8. Choose fillings for bagel | Basket, Inventory | items: List<String>               | addFillingToBagel(bagel:String, filling:String) | Add filling to bagel.                               |
| 9. Get price of filling      | Inventory         | stock: Map<String, Float>         | getItemPrice(filling: String): float            | Returns price of filling.                           |
| 10. Check if item exists     | Basket, Inventory | stock: Map<String, Float>         | isInMenu(item: String): boolean                 | Returns true if the item is in stock, false if not. |

