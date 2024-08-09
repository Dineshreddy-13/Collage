class Queue:
<<<<<<< Updated upstream
    def __init__(self, max_size, queue_type="linear"):
        self.queue = [None] * max_size
        self.type = queue_type.lower()
        self.max = max_size
=======
    def __init__(self, max, type="linear"):
        self.queue = [None] * max
        self.type = type.lower()
        self.max = max
>>>>>>> Stashed changes
        self.front = -1
        self.rear = -1

    def Enqueue(self, data):
        if self.isFull():
            print("Queue is full")
        else:
            if self.front == -1:
                self.front = 0
            if self.type == "circular":
                self.rear = (self.rear + 1) % self.max
            else:
                self.rear += 1
            self.queue[self.rear] = data
<<<<<<< Updated upstream
            print("Enqueue successful")
=======
            print("Enqueue successfull --> "+data)
>>>>>>> Stashed changes

    def isFull(self):
        if self.type == "circular":
            return (self.rear + 1) % self.max == self.front
        return self.rear == self.max - 1

    def Dequeue(self):
        if self.isEmpty():
            print("Queue is empty")
        else:
            x = self.queue[self.front]
            if self.front == self.rear:
                self.front, self.rear = -1, -1
            elif self.type == "circular":
                self.front = (self.front + 1) % self.max
            else:
                self.front += 1
<<<<<<< Updated upstream
            print("Dequeue successful")
=======
            print("Dequeue successfull --> "+x)
>>>>>>> Stashed changes
            return x

    def isEmpty(self):
        return self.front == -1

    def Display(self):
        if self.isEmpty():
            print("Queue is empty")
            return
        print()
        if self.type == "circular" and self.rear < self.front:
            for i in range(self.front, self.max):
                print(self.queue[i], end=" ")
            for i in range(0, self.rear + 1):
                print(self.queue[i], end=" ")
        else:
            for i in range(self.front, self.rear + 1):
                print(self.queue[i], end=" ")
        print()

while True:
    print("1. Linear Queue\n2. Circular Queue\n3. Exit")
<<<<<<< Updated upstream
    choice = int(input("Enter your choice: "))
    if choice == 1:
        size = int(input("Enter the size of the queue: "))
        obj = Queue(size)
    elif choice == 2:
=======
    x = int(input("Enter your choice: "))
    if x == 1:
        size = int(input("Enter the size of the queue: "))
        obj = Queue(size)
    elif x == 2:
>>>>>>> Stashed changes
        size = int(input("Enter the size of the queue: "))
        obj = Queue(size, "circular")
    else:
        break
    while True:
        print("\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit")
<<<<<<< Updated upstream
        action = int(input("Enter your choice: "))
        if action == 1:
            data = input("Enter the data: ")
            obj.Enqueue(data)
        elif action == 2:
            obj.Dequeue()
        elif action == 3:
=======
        a = int(input("Enter your choice: "))
        if a == 1:
            data = input("Enter the data: ").split(" ")
            for i in data:
                obj.Enqueue(i)
        elif a == 2:
            d = int(input("enter no of times to Dequeue: "))
            for i in range (d):
                obj.Dequeue()
        elif a == 3:
>>>>>>> Stashed changes
            obj.Display()
        else:
            break