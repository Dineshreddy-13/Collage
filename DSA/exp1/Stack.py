class Stack:
    def __init__(self, stack):
        self.stack = stack
        self.top = -1
        self.max = len(stack)

    def push(self, data):
        if self.isFull():
            print("Overflow")
        else:
            self.top += 1
            self.stack[self.top] = data

    
    def isFull(self):
        return self.top == self.max - 1

    def pop(self):
        if self.isEmpty():
            print("Stack underflow")
        else:
            x = self.stack[self.top]
            self.stack[self.top] = None
            self.top -= 1
            return x

    def isEmpty(self):
        return self.top == -1

    def display(self):
        for i in range(self.top + 1):
            print(self.stack[i],end=" ")
        print()

print("<--------------------------->")
print("| DINESH REDDY - URK23CS1263|")
print("<--------------------------->\n")

s = Stack([None] * 5)
s.push(1)
s.push(2)
s.push(3)
s.push(4)
s.push(5)
s.push(6) 
s.display() 
s.pop() 
s.pop() 
s.display()
