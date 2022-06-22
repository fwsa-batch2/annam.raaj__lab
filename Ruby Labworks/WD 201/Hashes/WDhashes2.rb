# Problem 2. Given this list of todos, create a Hash keyed by category, whose value is an array containing all the todos 
# in that category. The keys of the Hash must be a symbol.
# Fill in code that will create a Hash that looks like:
#   {
#     :money =>
#       ["Send invoice", "Pay rent", ...],
#     ...
#   }

todos = [
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"]
  ]

  money_array = []
  organize_array = []
  food_array = []
  for i in 0...todos.length do
      check = todos[i][1]
      if check == "money"
          money_array.push(todos[i][0])
      elsif check == "organize"
          organize_array.push(todos[i][0])
      elsif check == "food"
          food_array.push(todos[i][0])
      end
  end
  todo_list = {:money => money_array, :organize => organize_array, :food => food_array}
  puts todo_list
