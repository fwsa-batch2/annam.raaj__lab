#   Problem 3. Print the given list of todos by category. (You haven't learned Hashes yet, so use only arrays.)
# Fill in code that will print:
#   money:
#     Send invoice
#     Pay rent
#     Pay taxes
#   organize:
#     Clean room
#     Arrange books
#   food:
#     Buy groceries


todos = [
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"]
  ]

 money=[]
 organize=[]
 food=[]
 #money array
 puts
 puts "Money: "
 for i in 0...todos.length do
  check_money = todos[i][1]
  if check_money == "money"
    money.push(todos[i][0])  
  end   
 end
 puts money
 puts

 #organize array 
 puts "Organize: "
 for j in 0...todos.length do
     check_organize = todos[j][1]
     if check_organize == "organize"
        organize.push(todos[j][0])         
     end
 end
 puts organize
 puts

 #food array
 puts "food: "
 for k in 0...todos.length do
     check_food = todos[k][1]
     if check_food == "food"
        food.push(todos[k][0])         
     end
 end
 puts food