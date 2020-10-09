#Recursive Function which returns an integer's string roman numeral value
# @param {Integer} num
# @return {String}
# @Requires 1 < num < 4000
def int_to_roman(num)
    if num == 0
        return ""
    end
    romans = ["I","IV","V","VI","VII","VIII","IX","X","XL","L","XC","C","CD","D","CM","M"]
numbers = [1,4,5,6,7,8,9,10,40,50,90,100,400,500,900,1000]
    i = 15
    while (num - numbers[i] < 0)
        i = i - 1
    end
    num = num - numbers[i]
    current = romans[i]
    print(current)
    return current + int_to_roman(num)
end
