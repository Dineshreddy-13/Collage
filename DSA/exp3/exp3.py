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
    def isFull(self):
        if self.rear == self.max-1:
            return 1
        else:
            return 0
   
    def Dequeue(self):
        if(self.isEmpty()):
            print("empty")
        else:
            x = self.queue[self.front]
            if self.front == self.rear:
                self.front,self.rear = -1,-1
            elif(self.type == "circular" and self.front == self.max - 1):
                self.front = 0
            else:
                self.front +=1
            return x
       
    def isEmpty(self):
        if (self.front == -1 ):
            return 1
        else:
            return 0
       
    def Display(self):
        for i in range(self.front,self.rear+1):
            print(self.queue[i],end = " ")
           
obj = Queue(5,"Circular")
obj.Enqueue(1)
obj.Enqueue(2)
obj.Enqueue(3)
obj.Enqueue(4)
obj.Enqueue(4)
obj.Dequeue()
obj.Dequeue()
obj.Dequeue()
obj.Dequeue()
obj.Dequeue()
obj.Enqueue(5)

obj.Display()
