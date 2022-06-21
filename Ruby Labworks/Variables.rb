 
 # Instance variables which 
 @drink="Animals can drink water."

class VariablesExample

    # local variables which is useful only in the code block 
    def animal
        eat="Animal can eat."
        sleep="Animal can sleep."
        puts "Animals about eating #{eat}"
        puts "Animals about sleeping #{sleep}"

    end
 
   

    # obj1=VariablesExample.new
    #  obj1.animal


    # puts "Animals about eating #{eat}"     This does not work because it is outside code block and local variable
    
    # global variables which is useful all over the program
    # $breathe="Animals can breathe."

    # # class variables which is accessible all overt he class, need to be initilized
    # @@walk="Animals can walk."

   
end

animal()

# class variableExample1

#     puts "Aimals about breathing #{$breathe}"
    
# end