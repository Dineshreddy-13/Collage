class Stack:
    def __init__(self, max):
        self.stack = [None] * max
        self.top = -1
        self.max = max

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

print("<---------------------------->\n| DINESH REDDY - URK23CS1263 |\n<---------------------------->\n")

size = int(input("Enter the size of the stack : "))
s = Stack(size)
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
