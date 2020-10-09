
romans = ["I","IV","V","VI","VII","VIII","IX","X","XL","L","XC","C","CD","D","CM","M"]
numbers = [1,4,5,6,7,8,9,10,40,50,90,100,400,500,900,1000]

//Recursive Function which returns an integer's string roman numeral value
// @param {Integer} num
// @return {String}
// @Requires 1 < num < 4000
//@Params: 
// - num: the integer
// - array of roman numerals 1-10,40,50,90,100,400,500,900,1000
// - array of numbers same as above

function intToRoman(num){
    if (num == 0){
        return ""
    }
    let i = 15
    while (num - numbers[i] < 0){
        i--
    }
    num = num - numbers[i]
    current = romans[i]
    return (current + intToRoman(num))
}
