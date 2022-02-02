line=input("Enter the line:")
counts={}
sentence=line.split()
for word in sentence:
    if word in counts:
        counts[word]+=1
    else:
        counts[word]=1
for a,m in counts.items():
    print(a,m)
