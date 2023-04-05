class Node:
    def __init__(self, value=None):
        self.value = value
        self.next = None


class Queue:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def remove(self, value):
        if self.is_empty():
            return None
        else:
            current = self.head
            previous = None
            while current is not None:
                if current.value == value:
                    if previous is not None:
                        previous.next = current.next
                    else:
                        self.head = current.next
                    self.size -= 1
                    if self.is_empty():
                        self.tail = None
                    return current.value
                else:
                    previous = current
                    current = current.next
            return None

    def is_empty(self):
        return self.size == 0

    def enqueue(self, value):
        new_node = Node(value)
        if self.is_empty():
            self.head = new_node
        else:
            self.tail.next = new_node
        self.tail = new_node
        self.size += 1

    def dequeue(self):
        if self.is_empty():
            return None
        else:
            value = self.head.value
            self.head = self.head.next
            self.size -= 1
            if self.is_empty():
                self.tail = None
            return value

    def peek(self):
        if self.is_empty():
            return None
        else:
            return self.head.value


def queue_example():
    queue = Queue()
    queue.enqueue("Java")
    queue.enqueue("DotNet")
    queue.enqueue("PHP")
    queue.enqueue("Html")
    print("remove ", queue.remove("Java"))
    print("peek:", queue.peek())
    print("dequeue:", queue.dequeue())
    print("peek:", queue.peek())


queue_example()
