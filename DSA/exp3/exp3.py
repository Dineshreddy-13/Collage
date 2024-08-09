class Queue:
    def __init__(self, max_size, queue_type="linear"):
        self.queue = [None] * max_size
        self.type = queue_type.lower()
        self.max = max_size
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
            print("Enqueue successful")

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
            print("Dequeue successful")
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
    choice = int(input("Enter your choice: "))
    if choice == 1:
        size = int(input("Enter the size of the queue: "))
        obj = Queue(size)
    elif choice == 2:
        size = int(input("Enter the size of the queue: "))
        obj = Queue(size, "circular")
    else:
        break
    while True:
        print("\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit")
        action = int(input("Enter your choice: "))
        if action == 1:
            data = input("Enter the data: ")
            obj.Enqueue(data)
        elif action == 2:
            obj.Dequeue()
        elif action == 3:
            obj.Display()
        else:
            break