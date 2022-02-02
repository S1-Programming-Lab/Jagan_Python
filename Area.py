from Graphics.Rectangle import*
from Graphics.circle import *
from Graphics.Dgraphics.Sphere import *
from Graphics.Dgraphics.Cuboid import *
print("1.Rectangle")
print("2.Circle")
print("3.Sphere")
print("4.Cuboid")
while True:
    choice=int(input("Enter Your choice:"))
    if choice==1:
        l=int(input("Enter The Length of Rectangle:"))
        b=int(input("Enter The Breadth of Rectangle:"))
        print("area = ",RectangleArea(l,b))
        print("Perimeter =", RectanglePerimeter(l,b))
    elif choice==2:
        r=int(input("Enter the radius of a circle:"))
        print("Circle area = ",CircleArea(r))
        print("Circle Perimeter =", CirclePerimeter(r))
    elif choice==3:
        r=int(input("Enter radius of Sphere:"))
        print("Circle area = ",SphereArea(r))
        print("Circle Perimeter =", SpherePerimeter(r))
    elif choice==4:
        l=int(input("Enter Length of Cuboid:"))
        b=int(input("Enter width of Cuboid:"))
        h=int(input("Enter Height of Cuboid:"))
        print("Surface Area Of Cuboid = ",cubesurface(l,b,h))
        print("Lateral surface Area Of Cuboid = ",cubelateral(l,b,h))
    else:
        print("Invalid Input")
        break
