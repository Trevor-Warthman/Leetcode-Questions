//Note: Easier than making roman numerals. Just take each part one at a time.
//Given a roman numeral, convert it to an integer.
romans = ["I","IV","V","VI","VII","VIII","IX","X","XL","L","XC","C","CD","D","CM","M"]
numbers = [1,4,5,6,7,8,9,10,40,50,90,100,400,500,900,1000]

/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    if (s.length == 0)
        return 0
    var current = 0
    let i = 15
    while (romans[i] != s.substring(0,romans[i].length)){
        i--
    }
    s = s.substring(romans[i].length,s.length)
    return (numbers[i] + romanToInt(s))
};
