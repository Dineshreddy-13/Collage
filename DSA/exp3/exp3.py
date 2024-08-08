class Queue:
    def __init__(self,max,type = "linear"):
        self.queue = [None]*max
        self.type = type.lower()
        self.max = max
        self.front = -1
        self.rear = -1
       
    def Enqueue(self,data):
        if (self.isFull()):
            print("overflow")
        else:
            if self.front == -1:
                self.front = 0
            self.rear +=1
            self.queue[self.rear] = data
            print("Enqueue successfull")
            
    def isFull(self):
        return self.rear == self.max-1
   
    def Dequeue(self):
        if(self.isEmpty()):
            print("Queue is empty")
        else:
            x = self.queue[self.front]
            if self.front == self.rear:
                self.front,self.rear = -1,-1
            elif(self.type == "circular" and self.front == self.max - 1):
                self.front = 0
            else:
                self.front +=1
            print("Dequeue successfull")
            return x
       
    def isEmpty(self):
            return self.front == -1
       
    def Display(self):
        print()
        for i in range(self.front,self.rear+1):
            print(self.queue[i],end = " ")
        print()
           

while(True):
    print("1.linear queue\n2.CircularQueue\n3.Exit")
    x= int(input("enter your choice : "))
    if x == 1:
        size = int(input("enter the size of the queue : "))
        obj = Queue(size)
    elif x == 2:
        size = int(input("enter the size of the queue : "))
        obj = Queue(size,"circular")
    else:
        break
    while(True):
        print("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit")
        b= int(input("enter your choice : "))
        if b==1:
            data = input("enter The data : ")
            obj.Enqueue(data)
        elif b==2:
            obj.Dequeue()
        elif b==3:
            obj.Display()
        else :
            break

