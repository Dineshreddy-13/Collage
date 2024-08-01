class infix_to_postfix:
    def __init__(self,exp):
        self.exp = exp
        self.Stack = []
        self.result = []
    def precedence(self,a):
        if a == "^":
            return 3
        elif a == "*" or a == "/":
            return 2
        elif a == "+" or a == "-":
            return 1
        else:
            return -1
        
    def associativity(self,a):
        if a == "^":
            return "r"
        return "l"
    def postfix(self):
        for i in range(len(self.exp)):
            d = self.exp[i]
            if d not in ("^","/","*","+","-","(",")"):
                self.result.append(d)
            elif d == "(":
                self.Stack.append(d)
            elif d == ")":
                while self.Stack and self.Stack[-1] != "(":
                    self.result.append(self.Stack.pop())
                self.Stack.pop()
            else:
                while self.Stack and (self.precedence(d) < self.precedence(self.Stack[-1]) or (self.precedence(d) == self.precedence(self.Stack[-1]) and self.associativity(d) == "l")):
                    self.result.append(self.Stack.pop())
                self.Stack.append(d)
    
        while self.Stack:
            self.result.append(self.Stack.pop())
        print("".join(self.result))
expression = input("Enter infix expression : ")
obj  = infix_to_postfix(expression)
obj.postfix()




class postfix_evaluation:
    def __init__(self,exp):
        self.exp = exp
        self.final_result = []
    def evaluate(self):
        for i in range(len(self.exp)):
            if self.exp[i] not in ("^","/","*","+","-","(",")"):
                self.final_result.append(self.exp[i])
            else:
                y = int(self.final_result.pop())
                x = int(self.final_result.pop())
                
                if self.exp[i] == "+":
                    d = x + y
                    self.final_result.append(d)
                    continue
                elif self.exp[i] == "-":
                    d = x - y
                    self.final_result.append(d)
                    continue
                elif self.exp[i] == "*":
                    d = x * y
                    self.final_result.append(d)
                    continue
                elif self.exp[i] == "/":
                    d = x / y
                    self.final_result.append(d)
                    continue
                elif self.exp[i] == "^":
                    d = x ^ y
                    self.final_result.append(d)
        print(self.final_result.pop())

    
expression  = input("Enter the postfix expression : ")
obj = postfix_evaluation(expression)
obj.evaluate()

                    


    