from functions import *

calc_funcs = [sqroot, factorial, logarithm, power]
calc_funcs_name = ["Square root", "Factorial", "Logarithm", "Power"]

def menu():
    print("---------------------Simple Scientific Calculator---------------------")
    print("Choose an operation (Enter the corresponding number)")
    for i in range(1):
        print(str(i+1) + ". " + calc_funcs_name[i])
    print("Press q to exit")

    op = input()
    if op == "q":
        return 
    while type(op) != int:
        try:
            op = int(op)
        except:
            print("Press enter valid operation number")
            op = input()
            if op == "q":
                return
    
    x = int(input())
    ans = calc_funcs[op-1](x)
    print("Answer =", ans)
    menu()
    

if __name__ == "__main__":
    menu()
