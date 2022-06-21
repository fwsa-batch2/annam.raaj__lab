#ternary statement
name = gets.chomp
a = (name == 'Pavan' ? true : false);
puts a


#unless statement
Age = gets.chomp.to_i
unless Age <= 18
    puts "You are eligible to vote."
else
    puts "You are not eligble to vote."
end
