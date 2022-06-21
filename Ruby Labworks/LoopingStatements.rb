# .. it consider 1 and 20

puts "Please Enter a number :"
Number=gets.chomp.to_i

for i in 1..10 do
    res=Number*i

    puts "#{Number} x #{i} = #{res} "
    
end

# # .. it consider 1 and  till 19 only 

puts "Please Enter a number :"
Num=gets.chomp.to_i
for i in 1...21 do
    result=Num*i
    puts "#{Num} x #{i} = #{result} "

end

 # easy method of looping

 #(a) String
 
10.times{puts "Pavan"}

 #(b) Integer

num = 5
10.times{|i| puts num * i}

# while loop

i=10
while i<20 do
  puts "Hi Pavan"
  i+=1
 end

# until loop

i=10
until i > 20 do
   puts " Hi Pavan"
   i += 1
end

# do-while

  i=0
  loop do
     print "#{i} "
     i+=1
    break if i%3 == 0
end

# (i) for each

my_array = [1,2,3,5,12]
my_array.each do |x|
   print "#{x+100} "
end

# (ii) for each 

for i in my_array do
    puts i
end