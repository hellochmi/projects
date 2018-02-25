class LinkedList:

    test = 'whatup'

    def __init__(self,head):
        head = None
        head.next = None
        size = 0

class Node:

    def __init__(self,data,nn=None):
        self.data = data
        data.nn = nn

    def getData(self,data):
        return self.data

    def setData(self,data):
        self.data = data

    def getNext(self):
        return self.nn

    def setNext(self,node):
        self.nn = node

    
