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
            return "R"
        return "L"
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
                while self.Stack and (self.precedence(d) < self.precedence(self.Stack[-1]) or (self.precedence(d) == self.precedence(self.Stack[-1]) and self.associativity(d) == "L")):
                    self.result.append(self.Stack.pop())
                self.Stack.append(d)
    
        while self.Stack:
            self.result.append(self.Stack.pop())
        print("".join(self.result))

    def postfix_evaluation(self):
        for i in range(len(self.exp)):
            if self.exp[i] not in ("^","/","*","+","-","(",")"):
                self.Stack.append(self.exp[i])
            else:
                y = int(self.Stack.pop())
                x = int(self.Stack.pop())
                
                if self.exp[i] == "+":
                    d = x + y
                    self.Stack.append(d)
                    continue
                elif self.exp[i] == "-":
                    d = x - y
                    self.Stack.append(d)
                    continue
                elif self.exp[i] == "*":
                    d = x * y
                    self.Stack.append(d)
                    continue
                elif self.exp[i] == "/":
                    d = x / y
                    self.Stack.append(d)
                    continue
                elif self.exp[i] == "^":
                    d = x ^ y
                    self.Stack.append(d)
        print(self.Stack.pop())
expression1 = input("enter infix expression : ")
obj  = infix_to_postfix(expression1)
obj.postfix()


expression2 = input("enter postfix expression : ")
obj  = infix_to_postfix(expression2)
obj.postfix_evaluation()