astr=input("Enter The string:\n")
char=input("Enter the Charater\n")
print("Given string:\n",astr)
print("Given Charater:\n",char)
res=0
for i in range(len(astr)):
    if(astr[i]==char):
        res=res+1
print("Number of times charater is present in string:\n",res)
