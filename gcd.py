a=int(input("Enter First numbers:"))
b=int(input("Enter Second Numbers:"))
for i in range(1,min(a,b)+1):
    if(a%i==0 and b%i==0):
        gcd=i
print("GCD pf",a,"and",b,"is",gcd)
