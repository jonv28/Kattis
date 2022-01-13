from sys import stdin, stdout

class Union_find:
    
    def __init__(self):
        self.parent = {}
        self.rank = {}
        self.count = {}

    def find (self, person):
        if not (person in self.parent):
            self.parent[person] = person
            self.rank[person] = 0
            self.count[person] = 1
        else:
            if person != self.parent[person]:
                self.parent[person] = self.find(self.parent[person])
        return self.parent[person]  

    def union(self, p1, p2):
        
        repri1 = self.find(p1)
        repri2 = self.find(p2)

        if repri1 == repri2:
            return self.count[repri1]
        
        if self.rank[repri1] > self.rank[repri2]:
            self.parent[repri2] = repri1
            self.count[repri1] += self.count[repri2]
            total = self.count[repri1]

        elif self.rank[repri1] < self.rank[repri2]: 
            self.parent[repri1] = repri2
            self.count[repri2] += self.count[repri1]
            total = self.count[repri2]

        else:
            self.parent[repri2] = repri1
            self.rank[repri1] += 1
            self.count[repri1] += self.count[repri2]
            total = self.count[repri1]

        
        return total

num_test = int(input(""))
x = 0
answers = []
while x < num_test:

    num_friends = int(input(""))

    union = Union_find()
    y = 0

    while y < num_friends:
        p1, p2 = input("").split()
        answers.append(union.union(p1,p2))
        y += 1
    x += 1

for i in answers:
    print(i)




