def check_Empty(list):
    print(bool(list))
if __name__  == "__main__":
    #making an empty list
    my_list = []
    check_Empty(my_list)
    #making a non-empty list
    my_list1 = [1, 2, 3]
    check_Empty(my_list1)