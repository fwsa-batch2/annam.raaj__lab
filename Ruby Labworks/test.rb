# puts agechecking = (gets.chomp.to_i> 18 ? "eligible to vote" : "Not eligible to vote.")
    
# behavour=gets.chomp
# if behavour == "Hunger"
#     puts "I want to stop reading and study. "
# else
#     puts "I want to study."
# end

# num = [2,3,41,32,4,6]
# num.each{|x| puts "Numbers #{x}"}

nums = [2, 4, 200, 400]
new_nums = nums.map {|number| number * 125 }
new_nums.each {|n| puts n }