# Problem 1. Given a nested array of first names and last names, return a new array with the full names.
  # fill in code that will return a new array of the full names:
  #   ["Jhumpa Lahiri", "J.K Rowling", ...]


  names = [["Jhumpa", "Lahiri"], ["J. K", "Rowling"], ["Devdutt", "Pattanaik"]]
  fullNames = []
  for i in 0...names.length do
      j=0
      fullNames.push(names[i][j]+" "+names[i][j+1])
  end
  print fullNames