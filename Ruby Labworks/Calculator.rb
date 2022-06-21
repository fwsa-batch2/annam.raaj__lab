class Calculator

    def addtion(a,b)
         a+b
    end
   
    def subtraction(a,b)
        a-b
    end

    def division(a,b)
        a/b
    end

    def multiplication(a,b)
        a*b
    end

end

a=gets.chomp.to_i
b=gets.chomp.to_i
c=gets.chomp

objcalculator = Calculator.new
if c == '+'
    puts "Addtion of #{a} and #{b} is #{objcalculator.addtion(a,b)}"
elsif c == '-'
    puts "Subtraction of #{a} and #{b} is #{objcalculator.subtraction(a,b)}"
elsif c == '/'
    puts "Division of #{a} and #{b} is #{objcalculator.division(a,b)}"
else c == '*'
    puts "Multiplication of #{a} and #{b} is #{objcalculator.multiplication(a,b)}"
    
end






