# Virtual-Marketplace
A virtual marketplace that occurs entirely in the terminal that deals with Stores and Products.
Users will create and log into the program with accounts that they can edit.

The program is used by two types of accounts, Sellers and Customers.

- Sellers can create and edit stores; they can create or add products to each store and keep track of which customers purchased from which.
  - Products provide information about their description, quantity, price, etc.. which can be edited by the seller who created it. 
  - Stores prodive information about the products they contain and their sales, which can be edited by the seller who created it.
  - Sellers can also import and export their products in the form of CSVs.

- Customers can view a dashboard of the products available for sale and purchase them, with the ability to export their purchase history as a file. 

Data for the economy is split into three files whose values are separated by semicolons then commas:
  - Accounts.txt
    - [Email]; [Password]; [Nickname]; [Account Type]; +
    - If the account is a Customer:
      - [Purchase History]
      - Example: chen3927@purdue.edu; 12345; Willie; customer; Rope, Stapler, Chair, Shovel
    - If the account is a Seller:
      - [Stores owned by the seller];
      - Example: chen3927@purdue.edu; 12345; Willie; seller; Follett's, Macy's, Target
      
  - Stores.txt
    - [Name of the Store]; [Products of the Store]; [Total items sold by the store]; [Customers that purchased a product from the store]
    - Example: Follett's; Stapler, Chair, Rope; 345; Willie
    
  - Products.txt
    - [Name of the Product]; [Name of the product's store]; [Boolean for if product is on sale]; [Description of Product]; [Quantity of product in stock]; [Price of product]; [Number of Products sold thus far]
     - Example: Stapler; Follett's; true; Staples paper; 80; 8.99; 5
